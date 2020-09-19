public class CarroTest {
    public static void main(String[] args) {
        Carro carroLujo = Carro.obtenerEdicion("lujo");
        if(carroLujo.isRinesAlineacion()) {
            System.out.println("Edicion de lujo exitosa");
        }
        Carro carroStandard = Carro.obtenerEdicion("standard");
        if(!carroStandard.isRinesAlineacion() && carroStandard.isAbs()) {
            System.out.println("Edicion standard exitosa");
        }
        Carro carroBasico = Carro.obtenerEdicion("basica");
        if(!carroBasico.isRinesAlineacion() && !carroBasico.isAbs() && carroBasico.isBolsaDeAireConductor()) {
            System.out.println("Edicion basica exitosa");
        }
    }
}