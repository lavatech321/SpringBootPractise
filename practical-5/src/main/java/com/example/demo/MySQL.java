package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class MySQL implements Database {
    public void run() {
        System.out.println("MySQL Database running");
    }
}
