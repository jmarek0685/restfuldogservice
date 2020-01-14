package com.example.restfuldogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.example.restfuldogservice.rest")
public class DemoApplication extends SpringBootServletInitializer
{

	public static void main(String[] args)
	{
		SpringApplication sa = new SpringApplication(DemoApplication.class);
		sa.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(DemoApplication.class);
	}

}