package com.sda.arrays;

public class Arrays {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak parametru w konsoli");
            System.exit(0);
        }

        for (char znak : args[0].toCharArray()) {
            if (!Character.isDigit(znak)) {
                System.out.println("Bledny wartosc w konsoli");
                System.exit(0);
            }
        }

        int[] tablica = new int[Integer.valueOf(args[0])];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (int) Math.floor(Math.random() * 100 + 1);
        }

        int suma = 0;
        for (int wartos : tablica) {
            suma = suma + wartos;
        }

        System.out.println("Suma elementow tablicy o rozmiarze " + tablica.length + " wynosi " + suma);
    }
}
