package com.anthony.email_service.application;

import com.anthony.email_service.adapter.IEmailSenderGateway;
import com.anthony.email_service.core.IEmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailSenderService implements IEmailSenderService {
    private final IEmailSenderGateway senderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        senderGateway.sendEmail(to, subject, body);
    }
}
