package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Print only the beans that have String as their return type from the Spring Application Context.
		Arrays.stream(context.getBeanNamesForType(String.class))
				.forEach(bean -> System.out.println(bean + ": " + context.getBean(bean)));
	}
}