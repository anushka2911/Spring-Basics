package com.selenium_express.test;

public class EnglishGreetingService implements GreetingService{

    @Override
    public void sayGreeting() {
        System.out.println("Good Morning! 🌞🌞 %f");
    }
}
