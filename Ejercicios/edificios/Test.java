

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Test {

    public static void main(String[] args) {
        Elevator myElevator = new Elevator();
        myElevator.currentFloor = 1;
        myElevator.desiredFloor = 16;


	    //THEN
		if(myElevator.currentFloor <= myElevator.topFloor){
			System.out.println("---- VALIDATION 1---\nOk");
		}
		else{
			System.out.println("---- VALIDATION 1 ---\nNot Ok - The elevator is over the topFloor");
		}

		//GIVEN
		myElevator.currentFloor = 1;
		myElevator.openDoor();

		//WHEN
		myElevator.goUp();

		//THEN
		if(myElevator.currentFloor == 1){
			System.out.println("---- VALIDATION 2 ---\nOk \n----");
		}
		else{
			System.out.println("---- VALIDATION 2 ---\nNot Ok - The elevator moves with the door open \n----");
		}

        //GIVEN
        myElevator.currentFloor = 1;
		//myElevator.topFloor = 60;
        myElevator.closeDoor();

        //WHEN
        myElevator.goToDesiredFloor();

        //THEN
        if(myElevator.currentFloor == myElevator.desiredFloor){
            System.out.println("---- VALIDATION 3 ---\nOk");
        }
        else{
            System.out.println("---- VALIDATION 3 ---\nNot Ok - The elevator is not in desired floor");
        }
    }
}
