package com.example.ThiGKTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ThiGkTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThiGkTemplateApplication.class, args);
		
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
