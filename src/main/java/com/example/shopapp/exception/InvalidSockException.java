package com.example.shopapp.exception;

public class InvalidSockException extends RuntimeException {

    public InvalidSockException(String mssg){
        super(mssg);
    }
}
