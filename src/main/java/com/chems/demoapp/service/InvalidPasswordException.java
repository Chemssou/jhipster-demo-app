package com.chems.demoapp.service;

public class InvalidPasswordException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super("Incorrect password");
    }
}
