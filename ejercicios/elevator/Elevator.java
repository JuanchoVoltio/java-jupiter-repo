public class Elevator{
	public int currentFloor = 1;
	public int desiredFloor;
	public int topFloor = 15;
	public boolean doorOpen;

	public void goUp(){
		System.out.println("Going up...");
		if(!doorOpen)			
			currentFloor++;	
	}

	public void goDown(){
		System.out.println("Going down...");
		currentFloor--;	
	}
	
	public void openDoor(){
		System.out.println("Opening door...");
		doorOpen = true;
	}
	
	public void closeDoor(){
		System.out.println("Closing door...");
		doorOpen = false;	
	}
}
