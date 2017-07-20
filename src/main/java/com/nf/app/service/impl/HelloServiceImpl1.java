package com.nf.app.service.impl;

import org.springframework.stereotype.Service;

import com.nf.app.service.HelloService;

import io.swagger.annotations.Api;

@Api("/sayHello")
@Service
public class HelloServiceImpl1 implements HelloService {

	public String sayHello(String a) {
		return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
	}

}
