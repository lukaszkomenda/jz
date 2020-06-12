package com.sda.exceptions;

public class InvalidException extends Exception {
    public InvalidException (String name){
        super(name + " is invalid.");
    }
}
