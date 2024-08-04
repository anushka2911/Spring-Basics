package com.selenium_express6.test;

public class Client {
    String clientName;
    int id;
    NotificationService notificationService;


    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotificationService(NotificationService notificationService) {
        System.out.println("Notification service called....");
        this.notificationService = notificationService;
    }

    public void clientHere()
    {
        System.out.printf("Client Name " + clientName + "and alloted id is " + id + "🌻🌻🌻🌻🌻🌻🌻");
    }
}
