package com.aurionpro.model;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super("Invalid Cell Location");
    }
}
