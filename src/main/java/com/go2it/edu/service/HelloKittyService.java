package com.go2it.edu.service;

import org.springframework.stereotype.Component;

/**
 * @author Alex Ryzhkov
 */
@Component(value = "helloKittyService")
public class HelloKittyService implements IGreetingService {
	public void sendGreeting() {
		System.out.println("Hello, Kitty!");
	}
}
