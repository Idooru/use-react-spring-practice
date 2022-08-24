package com.reactfront.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication {

    public static String port = "8080";

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
        System.out.println("Server is running at " + "http://localhost:" + port + "!");
    }

}
