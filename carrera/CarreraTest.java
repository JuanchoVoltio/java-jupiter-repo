public class CarreraTest{	
	public static void main(String[] agrs) {			
		Piloto pilotoUno = new Piloto("C. Muñoz", false, true, false);
		Piloto pilotoDos = new Piloto("Kobayashi", true, false, false);
		Piloto pilotoTres = new Piloto("G. Chavez", false, false, true);
		Piloto pilotoCuatro = new Piloto("P. Wherlein", true, false, false);
		Piloto pilotoCinco = new Piloto("D. Ricciardo", false, true, false);
		
		Pista pistaUno = new Pista("Long Beach", true, false, true, 100);
		Pista pistaDos = new Pista("Interlagos", true, true, false, 100);
		Pista pistaTres = new Pista("Suzuka", true, false, true, 100);
		Pista pistaCuatro = new Pista("Silverstone", false, true, true, 100);
		
		Piloto[] pilotos= {pilotoUno, pilotoDos, pilotoTres, pilotoCuatro, pilotoCinco};
		Pista[] pista = {pistaUno, pistaDos, pistaTres, pistaCuatro};
		
		FormulaJava formulaJava = new FormulaJava(pilotos, pista);
		
		formulaJava.simulacion();
		
	}
}