package com.example.docker.springbootdocker.com.example.docker.springbootdocker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/docker/hello")
public class RestController {
	
	@GetMapping
	public String hello(){
		return "hello world";
	}
}
