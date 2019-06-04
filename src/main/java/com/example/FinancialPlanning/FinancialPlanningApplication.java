package com.example.FinancialPlanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FinancialPlanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialPlanningApplication.class, args);
	}

}
