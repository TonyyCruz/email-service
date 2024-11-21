package com.anthony.email_service.adapter;

public interface IEmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
