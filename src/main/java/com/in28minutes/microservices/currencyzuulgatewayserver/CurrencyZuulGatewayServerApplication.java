package com.in28minutes.microservices.currencyzuulgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class CurrencyZuulGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyZuulGatewayServerApplication.class, args);
	}

}
