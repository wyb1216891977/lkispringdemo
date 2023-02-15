package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties(prefix = "comprison-site")
public class StandardizeFieldsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardizeFieldsApplication.class, args);
	}

}
