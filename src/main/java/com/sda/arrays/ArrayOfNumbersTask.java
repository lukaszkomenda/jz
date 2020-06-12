package com.sda.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfNumbersTask implements IArrayOfNumbers {

    @Override
    public void getSum() {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose size of array");
        int choose = s.nextInt();

        int[] array = new int[choose];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100 + 1);
        }

        int summary = 0;
        for (int value : array) {
            summary += value;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(summary);
    }
}
