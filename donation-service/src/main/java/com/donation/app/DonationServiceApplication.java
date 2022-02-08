package com.donation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DonationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonationServiceApplication.class, args);
	}

}
