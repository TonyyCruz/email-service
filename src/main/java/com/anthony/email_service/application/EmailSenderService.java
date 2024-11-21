package com.anthony.email_service.application;

import com.anthony.email_service.adapter.EmailSenderGateway;
import com.anthony.email_service.core.IEmailSender;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmailSenderService implements IEmailSender {
    private final EmailSenderGateway senderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        senderGateway.sendEmail(to, subject, body);
    }
}
