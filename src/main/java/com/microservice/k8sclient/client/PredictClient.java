package com.microservice.k8sclient.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.microservice.k8sclient.grpc.PredictResourceGrpc;
import com.microservice.k8sclient.grpc.historyReq;
import com.microservice.k8sclient.grpc.predictResp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class PredictClient{
	private final PredictResourceGrpc.PredictResourceBlockingStub blockingStub;
	
	@Autowired
	public PredictClient(@Value("${predictservice.ip}")String predictIp, @Value("${predictservice.port}")String predictPort) {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(predictIp, Integer.valueOf(predictPort))
				// 使用非安全机制传输
				.usePlaintext().build();

		blockingStub = PredictResourceGrpc.newBlockingStub(managedChannel);
	}
	
	public List<Double> getPredictRes(historyReq request) {
		try {
			predictResp resp = blockingStub.predict(request);
			return resp.getResultList();
		} catch (Exception err) {
			System.out.println(err);
		}
		return null;
	}
	
}  