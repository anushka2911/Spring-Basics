package com.selenium_express.spring_day1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDay1Application implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Start of the main program");
		SpringApplication.run(SpringDay1Application.class, args);
		System.out.println("End of the main program");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is the starting of run.....................");
	}
}
