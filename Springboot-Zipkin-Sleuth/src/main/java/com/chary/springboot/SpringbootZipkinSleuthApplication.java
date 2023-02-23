package com.chary.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringbootZipkinSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZipkinSleuthApplication.class, args);
		System.out.println("welcome to zipkin....");
	}

}
