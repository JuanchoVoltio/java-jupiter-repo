
public class Automovil {
	private final String motor;
	private final boolean aireAcondicionado;
	private boolean rinesAleacion;
	private boolean bolsasPosteriores;
	private boolean bolsaPiloto;
	private boolean bolsaCopiloto;
	private boolean ABS;

	public Automovil() {
		this.motor= "K7M 1.6 Turbo";
		this.aireAcondicionado = true;
	}
	
	public Automovil(boolean bolsaPiloto) {
		this();
		this.bolsaPiloto = bolsaPiloto;
	}
	
	public Automovil(boolean bolsaCopiloto, boolean ABS, boolean bolsasPosteriores, boolean rinesAleacion) {
		this(true);
		this.bolsaCopiloto = bolsaCopiloto;
		this.ABS = ABS;
		this.bolsasPosteriores = bolsasPosteriores;
		this.rinesAleacion = rinesAleacion;
	}
	
	

	public boolean isRinesAleacion() {
		return rinesAleacion;
	}

	public void setRinesAleacion(boolean rinesAleacion) {
		this.rinesAleacion = rinesAleacion;
	}

	public boolean isBolsasPosteriores() {
		return bolsasPosteriores;
	}

	public void setBolsasPosteriores(boolean bolsasPosteriores) {
		this.bolsasPosteriores = bolsasPosteriores;
	}

	public boolean isBolsaPiloto() {
		return bolsaPiloto;
	}

	public void setBolsaPiloto(boolean bolsaPiloto) {
		this.bolsaPiloto = bolsaPiloto;
	}

	public boolean isBolsaCopiloto() {
		return bolsaCopiloto;
	}

	public void setBolsaCopiloto(boolean bolsaCopiloto) {
		this.bolsaCopiloto = bolsaCopiloto;
	}

	public boolean isABS() {
		return ABS;
	}

	public void setABS(boolean aBS) {
		ABS = aBS;
	}

	public String getMotor() {
		return motor;
	}

	public boolean isAireacondicionado() {
		return aireAcondicionado;
	}
}
