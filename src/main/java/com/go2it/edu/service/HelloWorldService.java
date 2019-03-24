package com.go2it.edu.service;

import javax.inject.Named;

/**
 * @author Alex Ryzhkov
 */
@Named
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
