public class Test{
	

	public static void main(String [] args){

		Pilot[] Pilots = new Pilot[5];
		Track[] Tracks = new Track[4];
		Simulator SimuClassifi = new Simulator();


		Pilots[0] = new Pilot("C. Munoz", "chasis");
		Pilots[1] = new Pilot("Kobayashi", "motor");
		Pilots[2] = new Pilot("G. Chavez,", "aerodinamica");
		Pilots[3] = new Pilot("P. Wherlein,", "motor");
		Pilots[4] = new Pilot("D. Ricciardo", "chasis");

		Tracks[0] = new Track("Long Beach", "chasis","aerodinamica");
		Tracks[1] = new Track("Interlagos", "motor","chasis");
		Tracks[2] = new Track("Suzuka", "aerodinamica","chasis");
		Tracks[3] = new Track("Silverstone", "motor","aerodinamica");

		//given

		SimuClassifi.Classification(Pilots,Tracks,"Long Beach");


	
	}
	}
