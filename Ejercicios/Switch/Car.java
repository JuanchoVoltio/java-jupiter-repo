public class Car{

	//int typeCar;
	public String motor;
	public String alloyWhell;
	public boolean backAipBags;

	public Car(){
		//this.typeCar = typeCar;

			}

	public void information(int typeCar, boolean alloy, boolean backAipBags){

		if (alloy = false) {
		alloyWhell = "No";
		}
		else{
		alloyWhell = "Si";	
		}

	switch (typeCar) {

		case 1:
		

		System.out.println("This car is of luxury, has alloy Whell: "+ alloyWhell);

		
		case 2:

		System.out.println("The car is the Standard");

		case 3:

		System.out.println("The car is the basic");


		}
	}

}