package strategy;

public class VistaVehiculo {
    protected String description;

    public VistaVehiculo(String description) {
        this.description = description;
    }

    public void dibuja() {
        System.out.print(description);
    }
}
