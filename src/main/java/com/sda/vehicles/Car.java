package com.sda.vehicles;

public class Car extends Vehicle {
    int passengers = 0;

    public Car() {
        super(4);
        System.out.println("Constructor CAR");
        super.run(10);
    }

    void addPassengers() {
        if (passengers <= 4) {
            ++passengers;
            System.out.println("Add new passenger " + passengers);
        } else {
            System.out.println("Cannot add new passanger.");
        }

    }

    void removePassangers() {
        --passengers;
        System.out.println("Remove passenger " + passengers);
    }

}
