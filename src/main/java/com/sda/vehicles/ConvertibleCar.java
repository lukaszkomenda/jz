package com.sda.vehicles;

public class ConvertibleCar extends Car {
    private boolean openCloseRoof;

    public boolean isOpenCloseRoof() {
        return openCloseRoof;
    }

    public ConvertibleCar(boolean openCloseRoof) {
        this.openCloseRoof = openCloseRoof;
    }

    public void openRoof(){
        if (openCloseRoof == false){
            openCloseRoof = true;
            System.out.println("The roof of car is already opened.");
        }
    }

    public void closeRoof(){
        if (openCloseRoof == true){
            openCloseRoof = false;
            System.out.println("The roof of car is already closed.");
        }
    }

}
