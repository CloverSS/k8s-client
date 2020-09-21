package com.microservice.k8sclient.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
	@Value("${expan.Threshold}")
	private double expanThreshold;

	@Value("${shrink.Threshold}")
	private double shrinkThreshold;

	public Integer calculateReplicas(Integer old, BigDecimal request, BigDecimal predict) {
		Integer newNum;
		if ((newNum = predict.divide(request, 4, BigDecimal.ROUND_HALF_UP)
				.divide(BigDecimal.valueOf(expanThreshold), 4, BigDecimal.ROUND_HALF_UP)
				.setScale(0, BigDecimal.ROUND_UP).intValue()) > old) {

		} else {
			newNum = predict.divide(request, 4, BigDecimal.ROUND_HALF_UP)
					.divide(BigDecimal.valueOf(shrinkThreshold), 4, BigDecimal.ROUND_HALF_UP)
					.setScale(0, BigDecimal.ROUND_UP).intValue();
		}
		return newNum;
	}
}
