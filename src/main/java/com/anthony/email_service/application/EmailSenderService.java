package com.anthony.email_service.application;

import com.anthony.email_service.adapter.IEmailSenderGateway;
import com.anthony.email_service.core.IEmailSender;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmailSenderService implements IEmailSender {
    private final IEmailSenderGateway senderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        senderGateway.sendEmail(to, subject, body);
    }
}
