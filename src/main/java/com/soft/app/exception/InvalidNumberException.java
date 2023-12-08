package com.soft.app.exception;

/**
 * Exception class for InvalidNumberException class
 */
public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException(String message, Integer number, String value) {
        this(String.format(message, number, value));
    }
}
