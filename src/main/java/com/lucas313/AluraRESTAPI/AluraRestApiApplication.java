package com.lucas313.AluraRESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
@EnableSwagger2
public class AluraRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraRestApiApplication.class, args);
	}

}
