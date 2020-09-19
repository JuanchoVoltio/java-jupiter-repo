
public class TestEmsambleCarro {

	public static void main(String[] agrs) {

		String versionAutos = "FULL";
		Automovil myCar;

		switch (versionAutos.toUpperCase()) {
		case "FULL":
			myCar = new Automovil(true, true, true, true);
			break;

		case "STANDART":
			myCar = new Automovil(true, true, false, false);
			break;

		case "BASIC":
			myCar = new Automovil(true);
			break;

		default:
			myCar = new Automovil(true);
		}

		System.out.println("Versión de vehículo: "+versionAutos);
		System.out.println("||***Caracteristicas***||");
		System.out.println("Motor: "+ myCar.getMotor());
		System.out.println("Aire Acondicionado: "+ myCar.isAireacondicionado());
		System.out.println("Bolsa de aire piloto:"+ myCar.isBolsaPiloto());
		System.out.println("Bolsa de aire copiloto: "+ myCar.isBolsaCopiloto());
		System.out.println("Bolsa de aire plaza posterior: "+ myCar.isABS());
		System.out.println("ABS: "+ myCar.isABS());
		System.out.println("Rines de aleación: "+ myCar.isRinesAleacion());
	}
}
