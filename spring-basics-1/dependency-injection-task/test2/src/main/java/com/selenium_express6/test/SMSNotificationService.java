package com.selenium_express6.test;

public class SMSNotificationService implements NotificationService{

    void SMSNotificationService(){
        System.out.println("Default constructor called for sms service");
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via SMS 💬💬💬💬💬💬💬");
    }
}
