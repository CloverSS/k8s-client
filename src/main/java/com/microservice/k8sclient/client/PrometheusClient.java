package com.microservice.k8sclient.client;

import com.microservice.k8sclient.grpc.*;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class PrometheusClient {
	
	@Value("${k8s.prometheus.ip}")
	private String prometheusIp;
	@Value("${k8s.prometheus.port}")
	private String prometheusPort;
	
	public historyReq getHistoryData(String namespace, String depName){
		historyReq.Builder historyData =  historyReq.newBuilder();
		long endtime = (new Date().getTime()) / 1000;
		long starttime = endtime-60*60;

		String condition = "namespace=\"" + namespace + "\",pod=~\"" + depName + ".*\"";
		String query = "sum(node_namespace_pod_container:container_cpu_usage_seconds_total:sum_rate{" + condition + "})";
		String theUrl = "http://" + prometheusIp + ":" + prometheusPort + "/api/v1/query_range?query=" + query + "&start=" + starttime + "&end="
				+ endtime + "&step=30";
		JSONObject promRes = this.DoSelect(theUrl);
		
		if (promRes.has("values")) {
			JSONArray promArray = promRes.getJSONArray("values");
			for(int i=0;i<promArray.length();i++) {
				JSONArray value=promArray.getJSONArray(i);
				historyStruct.Builder historyStc =  historyStruct.newBuilder();
				historyStc.setTimestamp(value.getDouble(0));
				historyStc.setValue(value.getDouble(1));
				historyData.addData(historyStc.build());
			}
		}
		return historyData.build();
	}

	private JSONObject DoSelect(String theUrl) {
		System.out.println(theUrl);
		RestTemplate restTemplate = new RestTemplate();
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(theUrl);
			UriComponents uriComponents = builder.build();
			ResponseEntity<String> response = restTemplate.getForEntity(uriComponents.toUri(), String.class);
			
			if (response.hasBody()) {
				JSONObject promJson = new JSONObject(response.getBody());
				System.out.println(promJson.toString());
				if (promJson.has("data")) {
					if (promJson.getJSONObject("data").has("result")) {
						JSONArray promRes = promJson.getJSONObject("data").getJSONArray("result");
						if (promRes.isEmpty())
							return new JSONObject();
						return promRes.getJSONObject(0);
					}
				}
			}
			return null;
		} catch (Exception eek) {
			System.out.println("** Exception: " + eek.getMessage());
			return null;
		}
	}
}
