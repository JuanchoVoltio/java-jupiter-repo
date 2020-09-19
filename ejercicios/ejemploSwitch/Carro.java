public class Carro {

    private boolean motor;
    private boolean aireAcondicionado;
    private boolean rinesAleacion;
    private boolean bolsasDeAirePosteriores;
    private boolean bolsasDeAireConductor;
    private boolean bolsasDeAirePiloto;
    private boolean abs;

    public Carro() {
        this.motor = true;
        this.aireAcondicionado = true;
    }

    public void inicializarBasico() {
        this.bolsasDeAireConductor = true;
    }

    public void inicializarStandard() {
        this.bolsasDeAireConductor = true;
        this.bolsasDeAirePiloto = true;
        this.abs = true;
    }

    public void inicializarLujo() {
        this.rinesAleacion = true;
        this.bolsasDeAirePosteriores = true;
        this.bolsasDeAireConductor = true;
        this.bolsasDeAirePiloto = true;
        this.abs = true;
    }

    public static Carro obtenerEdicion(String edicion) {
        Carro carro = new Carro();
        switch (edicion) {
            case "lujo":
                carro.inicializarLujo();
                break
            case "standard":
                carro.inicializarStandard();
                break
            case "basica":
                carro.inicializarBasico();
                break
            default:
                System.out.println("Error");
                break
        }
        return carro;
    }

    public boolean isMotor() {
        return this.motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isAireAcondicionado() {
        return this.aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isRinesAleacion() {
        return this.rinesAleacion;
    }

    public void setRinesAleacion(boolean rinesAleacion) {
        this.rinesAleacion = rinesAleacion;
    }

    public boolean isBolsasDeAirePosteriores() {
        return this.bolsasDeAirePosteriores;
    }

    public void setBolsasDeAirePosteriores(boolean bolsasDeAirePosteriores) {
        this.bolsasDeAirePosteriores = bolsasDeAirePosteriores;
    }

    public boolean isBolsasDeAireConductor() {
        return this.bolsasDeAireConductor;
    }

    public void setBolsasDeAireConductor(boolean bolsasDeAireConductor) {
        this.bolsasDeAireConductor = bolsasDeAireConductor;
    }

    public boolean isBolsasDeAirePiloto() {
        return this.bolsasDeAirePiloto;
    }

    public void setBolsasDeAirePiloto(boolean bolsasDeAirePiloto) {
        this.bolsasDeAirePiloto = bolsasDeAirePiloto;
    }

    public boolean isAbs() {
        return this.abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

}