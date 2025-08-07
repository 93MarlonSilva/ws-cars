package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void send(String message) {
        System.out.println("Email sent with message: " + message);
    }
}
