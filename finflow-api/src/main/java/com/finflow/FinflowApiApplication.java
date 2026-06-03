package com.finflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FinflowApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinflowApiApplication.class, args);
	}

}
