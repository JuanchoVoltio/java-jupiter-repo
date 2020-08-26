public class EdificiosTest{

	public static void main(String args[]){
				
		int nivelesElevador = 12;		
		Elevador elevadoUno = new Elevador();
		elevadoUno.setNiveles(nivelesElevador);
		Elevador elevadoDos = new Elevador();
		elevadoDos.setNiveles(nivelesElevador);
		Elevador elevadoTres = new Elevador();
		elevadoTres.setNiveles(nivelesElevador);
		
		Elevador elevadores[] = { elevadoUno, elevadoDos, elevadoTres };
		
		Edificio edificioUno = new Edificio();
		
		edificioUno.setElevadores(elevadores);
		
		Edificio edificioDos = new Edificio();
		
		edificioDos.setElevadores(elevadores);
		
		System.out.println("Cantidad elevadores Edificio Uno "+edificioUno.getElevadores().length);
		
		System.out.println("Cantidad elevadores Edificio Dos "+edificioDos.getElevadores().length);

		
	}

}
