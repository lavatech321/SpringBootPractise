package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// Get the Database bean (MySQL implementation)
		Database d1 = context.getBean(Database.class);
		d1.run();
	}
}
