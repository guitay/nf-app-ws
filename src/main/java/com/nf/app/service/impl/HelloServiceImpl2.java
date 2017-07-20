package com.nf.app.service.impl;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;

import com.nf.app.service.HelloService;

import io.swagger.annotations.Api;

@Path("/sayHello2")
@Api("/sayHello2")
@Service
public class HelloServiceImpl2 implements HelloService {
 
    public String sayHello(String a) {
        return "Hello2 " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }
    
}
