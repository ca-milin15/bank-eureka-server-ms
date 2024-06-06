package com.pichincha.bank_eureka_server_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankEurekaServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankEurekaServerMsApplication.class, args);
	}

}
