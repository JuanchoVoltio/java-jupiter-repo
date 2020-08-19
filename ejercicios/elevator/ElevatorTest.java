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
			System.out.println("---- VALIDATION ---\nOk");
		}
		else{
			System.out.println("---- VALIDATION ---\nNot Ok - The elevator is over the topFloor");		
		}
	}

}
