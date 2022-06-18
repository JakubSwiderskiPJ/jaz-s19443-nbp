package com.example.jazzaliczenie.exceptionhandler;

import org.springframework.http.HttpStatus;

public class ApiError {

    private final HttpStatus httpStatus;
    private final String cause;

    public ApiError(HttpStatus httpStatus, String cause) {
        this.httpStatus = httpStatus;
        this.cause = cause;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getCause() {
        return cause;
    }
}
