public class CarroTest {
    public static void main(String[] args) {
        Carro carroLujo = Carro.obtenerEdicion("lujo");
        if(carroLujo.isRinesAleacion()) {
            System.out.println("Edicion de lujo exitosa");
        }
        Carro carroStandard = Carro.obtenerEdicion("standard");
        if(!carroStandard.isRinesAleacion() && carroStandard.isAbs()) {
            System.out.println("Edicion standard exitosa");
        }
        Carro carroBasico = Carro.obtenerEdicion("basica");
        if(!carroBasico.isRinesAleacion() && !carroBasico.isAbs() && carroBasico.isBolsasDeAireConductor()) {
            System.out.println("Edicion basica exitosa");
        }
    }
}