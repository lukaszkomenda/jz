package com.sda.geometry;

public abstract class PointApp {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        FlatShape flatShape = new FlatShape(4,5);


        System.out.println(point3D.pointX);
        System.out.println(point3D.pointY);
        System.out.println(point3D.pointZ);

        printDimensions(flatShape);
    }

    private static void printDimensions(FlatShape flatShape) {
        System.out.println(flatShape.getClass().getCanonicalName());
        System.out.println("Width: " + flatShape.getWidth());
        System.out.println("Height: " + flatShape.getHeight());

    }

    double getArea(FlatShape flatShape){
        return flatShape.getWidth() * flatShape.getHeight();
    }

    
}
