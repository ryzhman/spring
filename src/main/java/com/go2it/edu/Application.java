package com.go2it.edu;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.go2it.edu.service.IGreetingService;

@Component
public class Application {
	@Inject
	//	@Autowired - this annotation will do literally the same as Inject
			IGreetingService greeting = null;

	public Application() {
	}

	public Application(IGreetingService greeting) {
		this.greeting = greeting;
	}

	public static void main(String[] args) {
		//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-auto-discovery.xml");
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
