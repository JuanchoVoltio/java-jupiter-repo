public class Piloto {
	private String nombre;
	private boolean bonoMotor;
	private boolean bonoChasis;
	private boolean bonoAerodinamica;

	public Piloto(String nombre, boolean bonoMotor, boolean bonoChasis, boolean bonoAerodinamica) {
		this.nombre = nombre;
		this.bonoMotor = bonoMotor;
		this.bonoChasis = bonoChasis;
		this.bonoAerodinamica = bonoAerodinamica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isBonoMotor() {
		return bonoMotor;
	}

	public void setBonoMotor(boolean bonoMotor) {
		this.bonoMotor = bonoMotor;
	}

	public boolean isBonoChasis() {
		return bonoChasis;
	}

	public void setBonoChasis(boolean bonoChasis) {
		this.bonoChasis = bonoChasis;
	}

	public boolean isBonoAerodinamica() {
		return bonoAerodinamica;
	}

	public void setBonoAerodinamica(boolean bonoAerodinamica) {
		this.bonoAerodinamica = bonoAerodinamica;
	}

}