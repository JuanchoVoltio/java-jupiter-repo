public class Piloto{
	public static String nombre;
	public static float bonoMotor;
	public static float bonoChasis;
	public static float bonoAerodinamica;
	
	private Piloto(String nombre, float bonoMotor, float bonoChasis, float  bonoAerodinamica) {
		this.nombre = nombre;
		this.bonoMotor = bonoMotor;
		this.bonoChasis = bonoChasis;
		this.bonoAerodinamica = bonoAerodinamica;		
	}
}