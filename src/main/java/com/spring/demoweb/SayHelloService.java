package com.spring.demoweb;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
	
	public String sayHello(){
		return "Hello";
	}
	
	public String sayHello(String name){
		return "Hello "+ name;
	}

}
