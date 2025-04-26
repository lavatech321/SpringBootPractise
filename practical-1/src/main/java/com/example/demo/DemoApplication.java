package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Beans: " + ctx.getBeanDefinitionCount());
		var names = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		Arrays.asList(names).forEach(System.out::println);
	}
}