package com.sda.calc;

public class Exportation implements MathematicalOperation {
    @Override
    public double calculate(double x, double y) {
        return Math.pow(x,y);
    }
}
