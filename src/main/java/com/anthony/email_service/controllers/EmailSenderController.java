package com.anthony.email_service.controllers;

import com.anthony.email_service.core.EmailRequest;
import com.anthony.email_service.core.IEmailSenderService;
import com.anthony.email_service.core.exceptions.EmailServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/email")
public class EmailSenderController {
    private final IEmailSenderService emailSenderService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        try {
            emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("Email sent successfully.");
        } catch (EmailServiceException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email.");
        }
    }

}
