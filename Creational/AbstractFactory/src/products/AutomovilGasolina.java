package products;

public class AutomovilGasolina extends Automovil {

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "products.Automovil de gasolina de model: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de espacio: " + espacio
        );
    }
}
