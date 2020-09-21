package com.microservice.k8sclient.controller;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.k8sclient.client.FabClient;
import com.microservice.k8sclient.client.PredictClient;
import com.microservice.k8sclient.client.PrometheusClient;
import com.microservice.k8sclient.grpc.historyReq;
import com.microservice.k8sclient.grpc.predictResp;
import com.microservice.k8sclient.service.CalculateService;

@RestController
public class ClientController {
	@Autowired
	private FabClient fabClient;

	@Autowired
	private CalculateService calService;
	
	@Autowired 
	private PrometheusClient proClient;
	
	@Autowired
	private PredictClient predictClient;

	public ClientController() {

	}

	@RequestMapping("/findRes")
	public void findRes(@RequestParam String namespace, @RequestParam String SvcName, @RequestParam String type) {
		fabClient.getResRequest(namespace, SvcName, type);
	}

	@RequestMapping("/autoscale")
	public void autoScale(@RequestParam String namespace, @RequestParam String depName, @RequestParam String type,
			@RequestParam String predict) {
	}

	@PostMapping("/scale")
	public void scaleDep(@RequestParam String namespace, @RequestParam String svcName, @RequestParam String type) {
		//service转deployment
		String depName = fabClient.FromSvcGetDep(namespace, svcName);
		
		//获取历史数据
		historyReq historyData = proClient.getHistoryData(namespace, depName);
		
		//获取预测结果->grpc
		List<Double> predictList = predictClient.getPredictRes(historyData);
		
		if(predictList!=null && predictList.size()>0) {
			Double predicted = Collections.max(predictList);
			System.out.println(predicted);
			
			//获取限制值
			BigDecimal request = fabClient.getResRequest(namespace, depName, type); 
			BigDecimal predictDec = new BigDecimal(predicted);
			
			//获取当前数目
			Integer old = fabClient.getReplicas(namespace, depName);
			
			//计算扩缩容数量
			Integer newNum = calService.calculateReplicas(old, request, predictDec);
			System.out.println(old + " " + newNum + " " + request + " " + predictDec);
			
			//执行扩缩容
			if(old!=newNum) { 
				fabClient.scaleDeployment(namespace,depName,newNum);
			}
		}
		
	}

}