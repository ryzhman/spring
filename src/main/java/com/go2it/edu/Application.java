package com.go2it.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.go2it.edu.service.IGreetingService;

public class Application {

	IGreetingService greeting = null;

	public Application() {
	}

	public Application(IGreetingService greeting) {
		this.greeting = greeting;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Application application = (Application) ctx.getBean("application");
		application.start();
	}

	public void start() {
		if (greeting != null) {
			greeting.sendGreeting();
		}
	}

	public void logExample() {
		Logger logger = LoggerFactory.getLogger(Application.class);
		logger.trace("Hello World");
		logger.debug("Hello World");
		logger.info("Hello World");
		logger.warn("Hello World");
		logger.error("Hello World");
	}
}
