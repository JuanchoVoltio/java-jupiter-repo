public class Elevador implements Cloneable{
	public int currentFloor = 1;
	public int desiredFloor;
	public int topFloor = 15;
	public boolean doorOpen;
	public String serial;

	public void goUp(){
		System.out.println("Going up...");
		if(!doorOpen)			
			currentFloor++;	
	}

	public void goDown(){
		System.out.println("Going down...");
		if(!doorOpen)
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
	
	public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }

}
