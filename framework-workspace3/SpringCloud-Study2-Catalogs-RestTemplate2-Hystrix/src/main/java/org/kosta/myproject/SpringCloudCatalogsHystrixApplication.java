package org.kosta.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableCircuitBreaker // 분산환경을 위한 서비스 장애 내성 및 지연 내성을 위한 설정 ( Spring Cloud(Netflix OSS)의 Hystrix를 이용)
@SpringBootApplication
public class SpringCloudCatalogsHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCatalogsHystrixApplication.class, args);
	}
	@Bean
	 public RestTemplate restTemplate() {
	 return new RestTemplate();
	 }
}
