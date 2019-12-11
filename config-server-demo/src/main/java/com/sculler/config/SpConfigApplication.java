package com.sculler.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpConfigApplication.class, args);
	}
}
