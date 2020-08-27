public class EdificiosTest{

	public static void main(String args[]){
				
		Elevador elevadoUno = new Elevador();
		elevadoUno.serial = "**Elevador 1 - Edificio 1**";
		Elevador elevadoDos = new Elevador();
		elevadoDos.serial = "**Elevador 2 - Edificio 1**";
		Elevador elevadoTres = new Elevador();
		elevadoTres.serial = "**Elevador 3 - Edificio 1**";
		
		Elevador elevadores[] = { elevadoUno, elevadoDos, elevadoTres };
		
		Elevador elevadoresDos[] = new Elevador[elevadores.length]; 
		
		for(int i = 0; i < elevadores.length; i++){
			elevadoresDos[i] = (Elevador)elevadores[i].clone();
			elevadoresDos[i].serial = "**Elevador "+(i+1)+" - Edificio 2**";
		}
		
		{
			Edificio edificioUno = new Edificio();
			
			edificioUno.setElevadores(elevadores);
			
			Edificio edificioDos = new Edificio();
			
			edificioDos.setElevadores(elevadoresDos);
			
			edificioUno.getElevadores()[0].goUp();
			edificioUno.getElevadores()[0].goUp();
			edificioUno.getElevadores()[0].goUp();
			edificioUno.getElevadores()[0].goUp();
			
			System.out.println("Elevadores Edificio Uno, serial = "+edificioUno.getElevadores()[0].serial+" piso actual = "+edificioUno.getElevadores()[0].currentFloor);
			
			System.out.println("Elevadores Edificio Dos, serial = "+edificioDos.getElevadores()[0].serial+" piso actual = "+edificioDos.getElevadores()[0].currentFloor);
		}
	}

}
