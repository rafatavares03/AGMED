package com.rafatavares03.AGMED.exception;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException() {
        super("The user you are trying to register is already registered.");
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }
}