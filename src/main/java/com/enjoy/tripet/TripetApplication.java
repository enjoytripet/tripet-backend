package com.enjoy.tripet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaAuditing
//@EnableJpaRepositories
public class TripetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripetApplication.class, args);
	}

}
