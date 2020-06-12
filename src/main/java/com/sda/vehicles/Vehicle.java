package com.sda.vehicles;

public class Vehicle {

    public Vehicle(){
        System.out.println("Constructor VEHICLE");
    }

    public Vehicle(int numberOfWheels){
        System.out.println("Vehicle with " + numberOfWheels + " wheels.");
    }

    public void run (double velocity){
        System.out.println("Vehicle running at speed " + velocity);
    }


}
