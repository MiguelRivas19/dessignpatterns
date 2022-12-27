package products;

public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "products.Scooter electrica de modelo: " +
                        modelo + " de color: " + color +
                " de potencia: " + potencia
        );
    }
}
