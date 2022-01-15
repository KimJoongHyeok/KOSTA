package org.kosta.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableCircuitBreaker // 분산환경을 위한 서비스 장애 내성 및 지연 내성을 위한 설정 ( Spring Cloud(Netflix OSS)의 Hystrix를 이용)
@SpringBootApplication
public class SpringCloudCatalogsHystrixRibbonApplication {	
	@Bean
	@LoadBalanced // 부하 분산을 위한 로드 밸런싱을 위한 설정 
	 public RestTemplate restTemplate() {
	 return new RestTemplate();
	 }
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCatalogsHystrixRibbonApplication.class, args);
	}
}
