package Flyweight;

public class OpcionVehiculo {
    protected String nombre;
    protected String descripcion;
    protected int precioStandar;

    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
        this.descripcion = "descripcion: " + nombre;
        this.precioStandar = 100;
    }

    public void visualiza(int precioVenta) {
        System.out.println("Opcion");
        System.out.println("nombre: " + nombre);
        System.out.println("descripcion: " + descripcion);
        System.out.println("precio estandar: " + precioStandar);
        System.out.println("precio venta: " + precioVenta);
    }
}
