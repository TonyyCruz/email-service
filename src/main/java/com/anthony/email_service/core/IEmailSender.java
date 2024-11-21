package com.anthony.email_service.core;

public interface IEmailSender {
    void sendEmail(String to, String subject, String body);
}
