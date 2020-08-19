public class ElevatorTest{

	public static void main(String args[]){
		Elevator myElevator = new Elevator();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		System.out.println("The Elevator is on floor " + myElevator.currentFloor);
		myElevator.goDown();
		System.out.println("The Elevator is on floor " + myElevator.currentFloor);
	}

}
