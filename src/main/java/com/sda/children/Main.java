package com.sda.children;


import java.util.*;

public class Main {

    private static Scanner S;
    private static List<String> NAMELIST = new ArrayList<>();

    public static void main(String[] args) {
        listOfChildren();
        menu();
        S = new Scanner(System.in);

        while (true) {
            System.out.println("\nWybierz właściwą opcję:");
            int option = S.nextInt();

            switch (option) {
                case 1:
                    addNewChild();
                    break;
                case 2:
                    printListOfChildren(NAMELIST);
                    break;
                case 3:
                    sortListOfChildren(NAMELIST);
                    break;
                case 4:
                    eliminateDuplicateInListOfChildren(NAMELIST);
                    break;
                case 5:
                    uppercaseListOfChildren(NAMELIST);
                    break;
                case 6:
                    lowercaseListOfChildren(NAMELIST);
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję.");
            }
        }

    }

    private static void lowercaseListOfChildren(List<String> namelist) {
        namelist.replaceAll(String::toLowerCase);
    }

    private static void uppercaseListOfChildren(List<String> namelist) {
        namelist.replaceAll(String::toUpperCase);
    }

    private static void eliminateDuplicateInListOfChildren(List<String> namelist) {
        Set<String> set = new LinkedHashSet<>();
        set.addAll(namelist);
        namelist.clear();
        namelist.addAll(set);
    }

    private static void sortListOfChildren(List<String> namelist) {
        Collections.sort(namelist);
    }

    private static void addNewChild() {
        S = new Scanner(System.in);

        System.out.println("Press name of student");
        String student = S.nextLine();

        NAMELIST.add(student);
        System.out.println("Dodano: " + student);


    }

    private static List<String> listOfChildren() {
        NAMELIST.add("Lukasz");
        NAMELIST.add("Zuzia");
        NAMELIST.add("Zuzia");
        NAMELIST.add("Tomek");
        return NAMELIST;
    }

    private static void printListOfChildren(List<String> nameList) {
        System.out.println(nameList);
    }

    private static void menu() {
        System.out.println("Dziennik klasy A!\nCo mogę dla ciebie zrobić? \n\n" +
                "1) Dodaj dziecko do listy \n" +
                "2) Wyświetl listę dzieci \n" +
                "3) Posortuj listę dzieci \n" +
                "4) Wyczyść z duplikatów listę dzieci \n" +
                "5) Zamień wszystkie litery imion na duże \n" +
                "6) Zamień wszystkie litery imion na małe.");
    }
}
