package com.spring.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.IBootRestController;

@Component
public class BootRestController implements IBootRestController{

	@Value("${welcome.message}")
	public String name;
	
	@Override
	public String sayHello() {
		System.out.println(name);
		return "Hello dude!";
	}

}
