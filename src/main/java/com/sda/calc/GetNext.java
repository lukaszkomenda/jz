package com.sda.calc;

public class GetNext implements Series {
    @Override
    public int series(int one, int two, int... numbers) {
        return two;
    }
}
