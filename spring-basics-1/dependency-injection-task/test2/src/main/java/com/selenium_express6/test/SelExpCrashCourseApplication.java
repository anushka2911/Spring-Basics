package com.selenium_express6.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SelExpCrashCourseApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Beginning of the main program...🏁🏁🏁🏁🏁🏁🏁🏁");
		SpringApplication.run(SelExpCrashCourseApplication.class, args);
		System.out.println("End of the main program.... 🔚");
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Client client = context.getBean("client",Client.class);
		client.clientHere();

	}
}
