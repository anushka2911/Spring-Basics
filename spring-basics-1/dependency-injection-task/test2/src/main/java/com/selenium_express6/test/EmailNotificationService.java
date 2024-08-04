package com.selenium_express6.test;

public class EmailNotificationService implements NotificationService{

    void EmailNotificationService(){
        System.out.println("Default constructor called for email service");
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via Email 📧✉️....");
    }
}
