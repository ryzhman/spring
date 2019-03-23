package com.go2it.edu.service;

/**
 * @author Alex Ryzhkov
 */
public class HelloWorldService implements IGreetingService {
	public String message;

	public HelloWorldService() {
		message = "";
	}

	public HelloWorldService(String message) {
		this.message = message;
	}

	public void sendGreeting() {
		System.out.println("Hello, world! " + message);
	}
}
