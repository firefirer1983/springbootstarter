package com.firefirer.springeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(HelloWorld.class, args);



    }
}
