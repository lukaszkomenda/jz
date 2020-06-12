package com.sda.zadaniaPoboczne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Imiona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();

        addNames(s, nameList);
        removeNames(s, nameList);
        sortAndPrint(nameList);


    }

    private static void sortAndPrint(List<String> nameList) {
        Collections.sort(nameList);
        System.out.println(nameList);
    }

    private static void removeNames(Scanner s, List<String> nameList) {
        System.out.println("Which remove:");
        String choose = s.nextLine();
        for (int i = 0; i < nameList.size(); i++) {
            String name = nameList.get(i);
            if(name.equals(choose)){
                nameList.remove(i);
            }
        }
    }

    private static void addNames(Scanner s, List<String> nameList) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Press a name: " + (i+1));
            String name = s.nextLine();
            nameList.add(name);
        }
        System.out.println(nameList);
    }



    /*
    Napisz program, który najpierw poprosi o 5 imion.
    Wyswietli je i zapyta, który skasowac, po czym
    wyswietli liste po skasowaniu, posortuje ja i
    wyswitli ponownie i po skasowaniu i zakonczy dzialanie.
     */
}
