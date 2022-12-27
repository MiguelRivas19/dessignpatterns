package products;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "products.Automovil electrico de model: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de espacio: " + espacio
        );
    }
}
