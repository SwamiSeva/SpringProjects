package com.soulsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		
		Alience ali=context.getBean(Alience.class);
		ali.display();
	}

}
