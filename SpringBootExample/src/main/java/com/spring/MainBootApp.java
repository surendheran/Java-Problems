package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication/*(scanBasePackages = {"com.spring"})*/
@EnableAutoConfiguration
//@ComponentScan(basePackages={"com.spring"})
public class MainBootApp {

	public static void main(String[] args) {
		
		SpringApplication.run(MainBootApp.class, args);

	}

}
