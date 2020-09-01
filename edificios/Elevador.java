public class Elevador{
	public int currentFloor = 1;
	public int desiredFloor;
	public final int topFloor = 15;
	public final int minFloor = 1;
	public boolean doorOpen;
	public String serial;

	public void goUp(){
		System.out.println("Going up...");
		if(!doorOpen && currentFloor < topFloor)
				currentFloor++;	
	}

	public void goDown(){
		System.out.println("Going down...");
		if(!doorOpen && currentFloor > minFloor)
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
