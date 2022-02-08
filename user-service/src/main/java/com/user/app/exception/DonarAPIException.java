package com.user.app.exception;

import org.springframework.http.HttpStatus;

public class DonarAPIException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public DonarAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public DonarAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
