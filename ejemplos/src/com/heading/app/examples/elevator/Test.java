package com.heading.app.examples.elevator;

public class Test {

    public static void main(String[] args) {
        Elevator myElevator = new Elevator();
        int desiredFloor = 5;
        int maxLoad = 250;

        myElevator.tellMeWhereIAm();


        boolean passTest1 = should_not_move_if_door_is_open(myElevator);
/*
        //GIVEN
        myElevator.currentFloor = 1;
		myElevator.topFloor = 60;
        myElevator.closeDoor();

        //WHEN
        myElevator.goToDesiredFloor(desiredFloor);

        //THEN
        if(myElevator.currentFloor == desiredFloor){
            System.out.println("---- VALIDATION 3 ---\nOk");
        }
        else{
            System.out.println("---- VALIDATION 3 ---\nNot Ok - The elevator is not in desired floor");
        }*/

//		myElevator.goToDesiredFloor(desiredFloor);
//
//		modifyMaxLoad(myElevator, maxLoad);
//		System.out.println("before: " + myElevator.loadCapacity);
//
//		myElevator.loadCapacity = maxLoad;
//		System.out.println("after: " + myElevator.loadCapacity);
    }

	private static boolean should_not_move_if_door_is_open(Elevator myElevator) {
		//GIVEN
		myElevator.currentFloor = 1;
		myElevator.openDoor();
		boolean answer;

		//WHEN
		myElevator.goUp();

		//THEN
		return myElevator.currentFloor == 1;
	}

	private static void modifyMaxLoad(Elevator myElevator, int maxLoad) {
    	maxLoad += 20;
    	myElevator.loadCapacity = maxLoad;
	}
}
