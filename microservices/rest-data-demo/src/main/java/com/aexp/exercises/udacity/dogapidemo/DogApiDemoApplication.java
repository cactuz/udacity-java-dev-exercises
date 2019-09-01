package com.aexp.exercises.udacity.dogapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApiDemoApplication.class, args);
	}

}
