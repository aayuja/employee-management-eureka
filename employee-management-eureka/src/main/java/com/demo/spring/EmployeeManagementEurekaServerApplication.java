package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeManagementEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementEurekaServerApplication.class, args);
	}

}
