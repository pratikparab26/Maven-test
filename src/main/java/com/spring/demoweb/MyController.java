package com.spring.demoweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	SayHelloService sayHelloService;
	@GetMapping("/hello/{name}")
	public String webServce1(@PathVariable String name){
		return sayHelloService.sayHello(name);
	}

}
