package com.anthony.email_service.core.exceptions;

public class EmailServiceException extends RuntimeException {
    public EmailServiceException(String msg) { super(msg); }

    public EmailServiceException(String msg, Throwable throwable) { super(msg, throwable); }
}
