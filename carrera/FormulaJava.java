public class FormulaJava {
	public Piloto[] pilotos;
	public final Pista[] pistas;
	private final double bonoMotor = 0.4;
	private final double bonoChasis = 0.6;
	private final double bonoAerodinamica = 0.5;
	private final int maxPromedio = 70;
	private final int minPromedio = 67;

	public FormulaJava(Piloto[] pilotos, Pista[] pistas) {
		this.pilotos = pilotos;
		this.pistas = pistas;
	}

	public void simulacion() {
		if (!Utils.isValidArray(pilotos))
			System.out.println("Debe ingresar un arreglos de Pilotos");
		else if (!Utils.isValidArray(pistas))
			System.out.println("Debe ingresar un arreglos de Pistas");
		else {
			double bono = 0;
			for (Pista pistaActual : pistas) {
				System.out.print("Pista: " + pistaActual.nombre);
				System.out.println("Exigencia: Aerodinamica = " + pistaActual.aerodinamica+", Chasis = "+pistaActual.chasis+", Motor = "+pistaActual.motor);
				for (Piloto pilotoActual : pilotos) {
					bono = 0;
					System.out.print("Piloto: " + pilotoActual.getNombre());
					System.out.print(" | ");
					System.out.print("Bono Aerodinamica: ");
					bono += pistaActual.aerodinamica && pilotoActual.isBonoAerodinamica() ? bonoAerodinamica : 0;
					System.out.print(pistaActual.aerodinamica && pilotoActual.isBonoAerodinamica() ? bonoAerodinamica : 0);
					System.out.print(" | ");
					System.out.print("Bono Chasis: ");
					bono += pistaActual.chasis && pilotoActual.isBonoChasis() ? bonoChasis : 0;
					System.out.print(pistaActual.chasis && pilotoActual.isBonoChasis() ? bonoChasis : 0);
					System.out.print(" | ");
					System.out.print("Bono Motor: ");
					bono += pistaActual.motor && pilotoActual.isBonoMotor() ? bonoMotor : 0;
					System.out.print(pistaActual.motor && pilotoActual.isBonoMotor() ? bonoMotor : 0);
					System.out.print(" | ");

					System.out.println(
							"Tiempo Total: " + ((clasificacionPiloto(pilotoActual, pistaActual.vueltas) + bono)));
				}
				System.out.println("-----------------------------------------------");
			}
		}
	}

	private double clasificacionPiloto(Piloto piloto, int vueltas) {
		double puntaje = 0;
		for (int i = 0; i < vueltas; i++) {
			puntaje += (int) (Math.random() * (maxPromedio - minPromedio)) + minPromedio;
		}

		return puntaje;
	}

}