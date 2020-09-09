public class Test{
	

	public static void main(String [] args){

		Pilot pilotOne = new Pilot();
		Pilot pilotTwo = new Pilot();
		Pilot pilotThree = new Pilot();
		Pilot pilotFour = new Pilot();
		Pilot pilotFive = new Pilot();

		Pilot Pilots[] = { pilotOne, pilotTwo, pilotThree, pilotFour, pilotFive};
			
		System.out.println("Pilotos de la carrera");			

		pilotOne.prueba("C. Munoz", "chasis");
		pilotTwo.prueba("Kobayashi", "motor");
		pilotThree.prueba("G. Chavez,", "aerodinamica");
		pilotFour.prueba("P. Wherlein,", "motor");
		pilotFive.prueba("D. Ricciardo", "chasis");
	
	}

	}
