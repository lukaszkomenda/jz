package com.sda.vehicles;

public class Truck extends Vehicle {

    public Truck() {
        System.out.println("Constructor TRUCK");
    }

    @Override
    public void run(double velocity) {
        if (velocity > 80) {
            velocity = 80;
            System.out.println("Cannot run over than: " + velocity);
        } else {
            System.out.println("Velocity: " + velocity);

        }

    }

    public void addPackages(double velocity, int pack) {

        // velocity: 50, pack 6
        // 60

        if ((pack * 10) < velocity) {
            velocity -= (pack * 10);
            System.out.println("Velocity: " + velocity);
        } else {
            System.out.println("Packages are too many");
        }

    }
}
