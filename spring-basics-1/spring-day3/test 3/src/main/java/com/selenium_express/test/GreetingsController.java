package com.selenium_express.test;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingsController {
    private String clientName;
    private int id;
    private String address;
    private GreetingService greetingService;


    public GreetingsController(GreetingService greetingService) {
        System.out.println("🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻");
        this.greetingService = greetingService;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Autowired
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService=greetingService;
        System.out.println("Setter method called......");
    }

    public void GreetClient() {
        System.out.printf("Client name = %s%n", clientName);
        System.out.printf("Id = %d%n", id);
        System.out.printf("Address = %s%n", address);
        greetingService.sayGreeting();
    }
}
