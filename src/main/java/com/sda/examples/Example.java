package com.sda.examples;

public class Example {
    private int ex1;
    private int ex2;
    private int ex3;

    public Example(int ex1, int ex2, int ex3) {
        this.ex1 = ex1;
        this.ex2 = ex2;
        this.ex3 = ex3;
    }

    public int getEx1() {
        return ex1;
    }

    public int getEx2() {
        return ex2;
    }

    public int getEx3() {
        return ex3;
    }

    @Override
    public String toString() {
        return "Example{" +
                "ex1=" + ex1 +
                ", ex2=" + ex2 +
                ", ex3=" + ex3 +
                '}';
    }
}
