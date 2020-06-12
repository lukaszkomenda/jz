package com.sda.postOffice;


import java.util.Scanner;

public class PostOfficeApp {


    public static void main(String[] args) {

        createNewPackage();

    }

    static void createNewPackage() {

        String inputText;

        for (; ; ) {
            System.out.println("Choose contens");

            Scanner s = new Scanner(System.in);

            String contens = s.nextLine();

            Package pack = new Package(contens);

            for (PackageStatus packageStatus : PackageStatus.values()) {
                System.out.print(packageStatus + ", ");
            }

            System.out.println("\nChoose description:");
            getDescription1();
            //get description

            System.out.println("Choose status");

            inputText = s.nextLine();

            try {
                pack.changeStatus(PackageStatus.valueOf(inputText.toUpperCase()));
                System.out.println("Status: " + inputText.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (inputText.toUpperCase().equals("DELIVERED") ||
                    inputText.toUpperCase().equals("RETURNED") ||
                    inputText.toUpperCase().equals("LOST")){
                break;
            }


        }


    }

    static void getDescription1() {

        String option;
        Scanner s = new Scanner(System.in);

        option = s.nextLine();

        switch (option.toUpperCase()) {
            case "SENT":
                System.out.println(PackageStatus.SENT.getDescription());
                break;
            case "COURIER":
                System.out.println(PackageStatus.COURIER.getDescription());
                break;
            case "DELIVERED":
                System.out.println(PackageStatus.DELIVERED.getDescription());
                break;
            case "LOST":
                System.out.println(PackageStatus.LOST.getDescription());
                break;
            case "RETURNED":
                System.out.println(PackageStatus.RETURNED.getDescription());
                break;
            case "TRAVELLING":
                System.out.println(PackageStatus.TRAVELLING.getDescription());
                break;
            default:
                System.out.println("You choose wrong.");

        }
    }


}
