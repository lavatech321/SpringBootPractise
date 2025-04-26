package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.Arrays;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example2"})
public class DemoApplication {
	public static void main(String[] args) {
		var ctx =
				SpringApplication.run(DemoApplication.class, args);
		var names = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		Arrays.stream(names)
				.filter(name -> name.toLowerCase().contains("sampleclass"))
				.forEach(System.out::println);
	}
}