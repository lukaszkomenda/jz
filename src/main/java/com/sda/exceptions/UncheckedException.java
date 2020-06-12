package com.sda.exceptions;

public class UncheckedException extends Exception {
    public UncheckedException (double x, double y){
        super("Error when dividing " + x + " by " + y + ". Division by zero is forbidden");
    }

    //“Error when dividing [x] by [y]. Division by zero is forbidden.”

}
