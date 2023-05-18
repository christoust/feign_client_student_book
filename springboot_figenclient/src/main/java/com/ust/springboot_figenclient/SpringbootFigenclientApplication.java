package com.ust.springboot_figenclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootFigenclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFigenclientApplication.class, args);
	}

}
