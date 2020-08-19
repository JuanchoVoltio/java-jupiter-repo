public class ElevatorTest{

	public static void main(String args[]){
		//GIVEN
		Elevator myElevator = new Elevator();
		
		//WHEN
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();

		//THEN
		if(myElevator.currentFloor <= myElevator.topFloor){
			System.out.println("---- VALIDATION 1---\nOk");
		}
		else{
			System.out.println("---- VALIDATION 1 ---\nNot Ok - The elevator is over the topFloor");		
		}

		//GIVEN
		myELevator.currentFloor = 1;
		myElevator.openDoor();

		//WHEN
		myElevator.goUp();

		//THEN
		if(myElevator.currentFloor == 1){
			System.out.println("---- VALIDATION 2 ---\nOk");
		}
		else{
			System.out.println("---- VALIDATION 2 ---\nNot Ok - The elevator moves with the door open");		
		}

		
	}

}
