package com.lausan.store;

import org.springframework.stereotype.Service;

//@Service("SMS")
public class SMSNotificationService implements NotificationService{
    public void send(String message) {
        System.out.println("Sending SMS");
        System.out.println(message);
    }
}
