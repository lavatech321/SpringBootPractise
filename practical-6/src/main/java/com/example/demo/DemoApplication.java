package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Get MySQL bean
		Database d1 = (Database) context.getBean("mysql");
		d1.run(); // Calls MySQL run()

		// Get PostgreSQL bean by name
		Database d2 = (Database) context.getBean("postgresSQL");
		d2.run(); // Calls PostgreSQL run()
	}
}
