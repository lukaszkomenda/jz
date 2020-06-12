package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run(10);

        vehicle = new Car();
        vehicle.run(50);

        vehicle = new Truck();
        vehicle.run(100);

        Truck truck = new Truck();
        truck.addPackages(50,4);

        StyledCar styledCar = new StyledCar("kombi");


        ConvertibleCar convertibleCar = new ConvertibleCar(false);

        convertibleCar.openRoof();
        convertibleCar.closeRoof();

//        Car car = new Car();
//
//        vehicle.run(100);
//        car.addPassengers();
//        car.removePassangers();
//        car.run(120);
//
//        Truck truck = new Truck();
//        truck.run(120);
//        truck.run(80);

    }
}
