package com.selenium_express.spring_day1.Sim;

public class Jio implements Sim{

    @Override
    public void Calling() {
        System.out.println("I am a JIO sim and you can do unlimited calling");
    }

    @Override
    public void Data() {
        System.out.println("I am a JIO sim and you can use 2GB data");
    }

    @Override
    public void Messaging() {
        System.out.println("I am a JIO sim and you can send  2309000 messages");
    }
}
