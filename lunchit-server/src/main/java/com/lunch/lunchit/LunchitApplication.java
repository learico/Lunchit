package com.lunch.lunchit;

import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class LunchitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LunchitApplication.class, args);
	}
	 @Bean
	 protected ModelMapper ModelMapper() {
		 return new ModelMapper();
		
	}
}
