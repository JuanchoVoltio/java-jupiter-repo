public class Car{

	//int typeCar;
	public String motor;
	public String alloyWhell;
	public String backAirBags;
	public String frontAirBags;
	public String tiers;


	
	public Car(){
		this.motor = "Si";
		this.tiers = "Si";
		this.frontAirBags = "Si";



			}

	public void information(String type){


		switch (type) {

		case "luxury":
		
		alloyWhell = "Si";
		backAirBags = "Si";

		System.out.println("This car is "+type+"it has:"); 
		System.out.println("alloy Whell: " + alloyWhell);
		System.out.println("backAirBags : " + backAirBags);
		System.out.println("motor : " + motor);
		System.out.println("tiers : " + tiers);
		System.out.println("frontAirBags : " +frontAirBags);
		System.out.println("Building Car "+type+ " ...");

		break;
		
		case "standard":

		alloyWhell = "No";
		backAirBags = "No";

		System.out.println("This car is "+type+", it has:");
		System.out.println("Alloy Whell: " + alloyWhell);
		System.out.println("BackAirBags : " + backAirBags);
		System.out.println("Motor : " + motor);
		System.out.println("Tiers : " + tiers);
		System.out.println("FrontAirBags : " +frontAirBags);
		System.out.println("Building Car "+type+ " ...");

		break;


		case "basic":

		alloyWhell = "No";
		backAirBags = "No";
		frontAirBags = "No";

		System.out.println("This car is "+type+", it has:");
		System.out.println("alloy Whell: " + alloyWhell);
		System.out.println("backAirBags : " + backAirBags);
		System.out.println("motor : " + motor);
		System.out.println("tiers : " + tiers);
		System.out.println("frontAirBags : " +frontAirBags);
		System.out.println("Building Car "+type+ " ...");

		}
	}

}