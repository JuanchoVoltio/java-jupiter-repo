
public class Elevator{
    public int currentFloor = 1;
    public int desiredFloor;
    public final int topFloor = 15;
    public boolean doorOpen;
    public final String BRAND = "Mitsubishi";

    public void goUp(){
        System.out.println("Going up...");
        if(!doorOpen) {
            currentFloor++;
        }
    }

    public void goDown(){
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

    public void goToDesiredFloor(){

            if (desiredFloor < topFloor) {
        while (currentFloor != desiredFloor){
             
                
             
            if(currentFloor > desiredFloor) {
                
                     
                 
                goDown();
            }else{
                goUp();
            }
        
        }

        }else{
            System.out.println("No existe el piso solicitado");
        }
    }
}

