package com.sda.triangles;

import java.util.Scanner;

public class TrangleApp {
    public static void main(String[] args) {
        TriangleCalculation triangleCalculation = new TriangleCalculation();
        Scanner s = new Scanner(System.in);

        System.out.println("Press first number");
        double x = s.nextInt();

        System.out.println("Press second number");
        double y = s.nextInt();

        System.out.println("Press third number");
        double z = s.nextInt();

        triangleCalculation.calculateTriangleCircuit(x,y,z);

    }
}
