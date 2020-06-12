package com.sda.triangles;

public class TriangleCalculation {
    public double calculateTriangleCircuit(double x, double y, double z) {
        if (cannotBuildTriangleException(x, y, z) == true) {
            double result = x + y + z;
            return result;
        } else {
            String message = "Cannot build triange";
            System.out.println(message);
            return 0;
        }
    }

    public static boolean cannotBuildTriangleException(double x, double y, double z) {
        if ((Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(z, 2)) {
            return true;
        } else {
            return false;
        }
    }
}
