package com.go2it.edu.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.go2it.edu.service.IGreetingService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IGreetingService service = (IGreetingService)ctx.getBean("helloKittyWorldService");
		service.sendGreeting();

	}


	public void logExample(){
		Logger logger = LoggerFactory.getLogger(Application.class);
		logger.trace("Hello World");
		logger.debug("Hello World");
		logger.info("Hello World");
		logger.warn("Hello World");
		logger.error("Hello World");
	}
}
