package com.anthony.email_service.core;

public interface IEmailSenderService {
    void sendEmail(String to, String subject, String body);
}
