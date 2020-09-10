public class CarreraTest{	
	public static void main(String[] agrs) {
		Piloto[] pilotos= new Piloto[10];
		Pista[] pista;
		
		float bonoMotor = 0.4;
		float bonoChasis = 0.6;
		float bonoAerodinamica = 0.5;
		
		Piloto pilotoUno = new Piloto("C. Muñoz", 0, bonoChasis, 0);
		Piloto pilotoUno = new Piloto("Kobayashi", bonoMotor, 0, 0);
		Piloto pilotoUno = new Piloto("G. Chavez", 0, 0, bonoAerodinamica);
		Piloto pilotoUno = new Piloto("P. Wherlein", bonoMotor, 0, 0);
		Piloto pilotoUno = new Piloto("D. Ricciardo", 0, bonoChasis, 0);
		
		Pista pistaUno = new Pista("Long Beach", true, false, true);
		Pista pistaDos = new Pista("Interlagos", true, true, false);
		Pista pistaTres = new Pista("Suzuka", true, false, true);
		Pista pistaCuatro = new Pista("Silverstone", false, true, true);
		
		pista = {pistaUno, pistaDos, pistaTres, pistaCuatro};
		
		FormulaJava formulaJava = new Carrera(pilotos, pista); 
	}
}