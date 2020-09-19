package com.heading.app.examples.elevator;

public class Elevator{
    public int currentFloor = 1;
    public int topFloor = 15;
    public boolean doorOpen;
    public final String BRAND = "Mitsubishi";
    public int loadCapacity = 200;

    public Elevator(){
    }

    public void goUp(){
        System.out.println("Going up...");
        if(!doorOpen) {
            this.currentFloor++;
        }
    }

    public void goDown(){
        int x = 0;
        System.out.println("Going down...");
        if(!doorOpen) {
            currentFloor--;
        }
    }

    public void openDoor(){
        System.out.println("Opening door...");
        doorOpen = true;
    }

    public void closeDoor(){
        System.out.println("Closing door...");
        doorOpen = false;
    }

    public void goToDesiredFloor(int desiredFloor){
        int x;
        while (currentFloor != desiredFloor && doorOpen == false){
            if(currentFloor > desiredFloor){
                goDown();
            }else{
                goUp();
            }
        }

        tellMeWhereIAm();
    }

    public void tellMeWhereIAm(){
        System.out.println("Current floor is " + currentFloor);
    }
}

//Code outside the class
