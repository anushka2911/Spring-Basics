package com.selenium_express.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SelExpCrashCourseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Entry to main program.....");
		SpringApplication.run(SelExpCrashCourseApplication.class, args);
		System.out.println("Exit .........");
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingsController client = context.getBean("greeting",GreetingsController.class);
		client.GreetClient();
	}
}
