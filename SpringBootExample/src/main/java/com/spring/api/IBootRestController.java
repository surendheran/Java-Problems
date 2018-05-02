package com.spring.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public interface IBootRestController {

	@RequestMapping("/")
	public String sayHello();
}
