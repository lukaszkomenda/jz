package com.sda.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsApp {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        try {

            List<String> list = new ArrayList<>();

            list.add("Alla");
            list.add("Melania");
            list.add("Tomek");

            System.out.println("Choose number");
            String text = s.nextLine();

            int index = Integer.parseInt(text);

            System.out.print(list.get(index));


        } catch (IndexOutOfBoundsException exception) {
            System.out.print("Wrong number");
        } catch (NumberFormatException exception) {
            System.out.print("Not a number");
        } finally {
            System.out.print(".");
        }

        System.out.println("\nPass the name: ");
        String text = s.nextLine();


        greet(text);

        divide1(5,0);
        divide(5,0);


    }

    static void greet(String who) throws InvalidException {

        if (who == null || who.isBlank()) {
            throw new InvalidException(who);
        } else {
            System.out.println("\nHello, " + who);

        }

    }

    static void divide (double x, double y) throws IllegalArgumentException{

        if (y == 0){
            throw new IllegalArgumentException("Don't divide by 0");
        } else {
            double result = x / y;
            System.out.println(result);

        }

    }

    static void divide1 (double x, double y) throws UncheckedException{

        if (y == 0){
            throw new UncheckedException(x, y);
        } else {
            double result = x / y;
            System.out.println(result);

        }

    }

}
