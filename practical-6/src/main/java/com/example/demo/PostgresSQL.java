package com.example.demo;
import org.springframework.stereotype.Component;

@Component("postgresSQL")
public class PostgresSQL implements Database {
    @Override
    public void run() {
        System.out.println("PostgresSQL database running");
    }
}
