package com.anthony.email_service.core;

public record EmailRequest(String to, String subject, String body) {
}
