package com.microservice.k8sclient.client;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.apps.DeploymentList;
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

@Component
public class FabClient {
	private KubernetesClient client;

	@Autowired
	public FabClient(@Value("${k8s.master.ip}") String masterIp, @Value("${k8s.ca.crt}") String caCrt,
			@Value("${k8s.apiserver.kubelet.crt}") String apiClientCrt,
			@Value("${k8s.apiserver.kubelet.key}") String apiClientKey) {
		Config config = new ConfigBuilder().withMasterUrl(masterIp).withCaCertFile(caCrt)
				.withClientCertFile(apiClientCrt).withClientKeyFile(apiClientKey).build();
		client = new DefaultKubernetesClient(config);
	}
	
	public BigDecimal getResRequest(String namespace, String depName, String type) {
		Deployment Dep = client.apps().deployments().inNamespace(namespace).withName(depName).get();
		if(Dep != null) {
			Quantity quantity = Dep.getSpec().getTemplate().getSpec().getContainers().get(0).getResources().getRequests().get(type);
			BigDecimal quantityAmount = Quantity.getAmountInBytes(quantity);
			return quantityAmount;
		}
		return BigDecimal.ZERO;
	}
	
	public Integer getReplicas(String namespace, String depName) {
		Deployment Dep = client.apps().deployments().inNamespace(namespace).withName(depName).get();
		if (Dep != null) {
			DeploymentSpec spec = Dep.getSpec();
			return spec.getReplicas();
		}
		return 0;
	}

	public void scaleDeployment(String namespace, String depName, int replics) {
		Deployment Dep = client.apps().deployments().inNamespace(namespace).withName(depName).get();
		if (Dep != null) {
			client.apps().deployments().inNamespace(namespace).withName(depName).scale(replics);
		}
	}
	
	public String FromSvcGetDep(String namespace, String svcName) {
		Map<String, String> svcSelector = client.services().inNamespace(namespace).withName(svcName).get().getSpec().getSelector();
		if(svcSelector.size()>0) {
			DeploymentList Deps = client.apps().deployments().inNamespace(namespace).list();
			for(Deployment dep:Deps.getItems()) {
				Map<String, String> depSelector = dep.getSpec().getSelector().getMatchLabels();
				for(Map.Entry<String, String> entry:depSelector.entrySet()) {
					if(svcSelector.containsKey(entry.getKey())&&svcSelector.get(entry.getKey()).equals(entry.getValue())){
						return dep.getMetadata().getName();
					}
				}
			}
		}
		return "";
		
	}

}
