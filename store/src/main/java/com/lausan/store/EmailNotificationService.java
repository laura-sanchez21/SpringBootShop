package com.lausan.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("email")
public class EmailNotificationService implements NotificationService{
    public void send(String message) {
        System.out.println("Sending email");
        System.out.println(message);
    }

}
