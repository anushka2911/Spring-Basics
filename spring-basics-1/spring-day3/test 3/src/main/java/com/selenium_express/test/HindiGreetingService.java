package com.selenium_express.test;

public class HindiGreetingService implements GreetingService{

    @Override
    public void sayGreeting() {
        System.out.println("Namaste 🙏🏻 %f");
    }
}
