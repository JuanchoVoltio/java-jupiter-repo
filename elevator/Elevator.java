public class Elevator{
	public int currentFloor = 1;
	public int desiredFloor;
	public int topFloor;

	public void goUp(){
		System.out.println("Going up...");
		currentFloor++;	
	}

	public void goDown(){
		System.out.println("Going down...");
		currentFloor--;	
	}
	
}
