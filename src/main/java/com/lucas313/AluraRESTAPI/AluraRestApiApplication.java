package com.lucas313.AluraRESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class AluraRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraRestApiApplication.class, args);
	}

}
