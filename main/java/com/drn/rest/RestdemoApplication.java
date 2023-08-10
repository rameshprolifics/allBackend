package com.drn.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestdemoApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(RestdemoApplication.class, args);
		
		
		
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	

}
