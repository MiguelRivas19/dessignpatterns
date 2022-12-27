package statemachine;

public class Producto {

    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void visualiza() {
        System.out.println("statemachine.Producto: " + nombre);
    }
}
