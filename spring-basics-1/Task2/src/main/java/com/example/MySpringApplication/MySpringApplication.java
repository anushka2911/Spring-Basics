package com.example.MySpringApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class MySpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Main Started");
		SpringApplication.run(MySpringApplication.class, args);
		System.out.println("Main ended");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...");
	}
}
