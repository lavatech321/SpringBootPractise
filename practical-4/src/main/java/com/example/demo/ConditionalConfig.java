package com.example.demo;

import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

    // Bean is created only if MyService class is present in the classpath
    @Bean
    @ConditionalOnClass(MyService.class)
    public String beanWhenClassPresent() {
        return "MyService class is present!";
    }

    // Bean is created only if MyMissingService class is NOT in the classpath
    @Bean
    @ConditionalOnMissingClass
            ("com.example.demo.MyMissingService")
    public String beanWhenClassMissing() {
        return "MyMissingService class is NOT present!";
    }
}