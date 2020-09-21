package com.microservice.k8sclient;
import com.microservice.k8sclient.client.*;
import com.microservice.k8sclient.controller.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.microservice.k8sclient")
public class K8sClientApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(K8sClientApplication.class, args);
	}

}
  