package com.sda.calc;

import java.util.Scanner;

public class MathUtils {
    public static void main(String[] args) {
        parseNumber();

    }

    public static void parseNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("Press a tekst with number:");
        String text = s.nextLine();

        try {
            Integer number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        } catch (NumberFormatException exception){
            System.out.println("Cannot create number");
        }
    }
}
