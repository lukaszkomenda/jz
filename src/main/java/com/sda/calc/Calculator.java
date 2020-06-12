package com.sda.calc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        multiplyNumbers(2, 10, 3);
        multiplyNumbers(5, 8, 1);

        System.out.println("");

        multiplyNumbers(2, 10);
        multiplyNumbers(5, 8);

        System.out.println("");

        multiplyNumber(10);
        multiplyNumber(8);

        ByTwos byTwos = new ByTwos();
        Scanner s = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        addNumber(s, numberList);
        System.out.println(numberList);

//        numberList = byTwos.setStart();
//        numberList = byTwos.getNext();
//        numberList = byTwos.reset();


    }

    private static void addNumber(Scanner s, List<Integer> numberList) {
        while (true) {
            System.out.println("Add number");
            int x = s.nextInt();
            if (x == 0) {
                break;
            } else {
                numberList.add(x);
            }

        }
    }

    static void multiplyNumbers(int start, int end, int step) {
        int multiply = 1;

        for (int i = start; i < end; i += step) {
            multiply *= i;
        }
        System.out.println(multiply);
    }

    static void multiplyNumbers(int start, int end) {
        int multiply = 1;
        int step = 1;

        for (int i = start; i < end; i += step) {
            multiply *= i;
        }
        System.out.println(multiply);

    }

    static void multiplyNumber(int end) {
        int multiply = 1;
        int step = 1;
        int start = 1;

        for (int i = start; i < end; i += step) {
            multiply *= i;
        }
        System.out.println(multiply);


    }
}
