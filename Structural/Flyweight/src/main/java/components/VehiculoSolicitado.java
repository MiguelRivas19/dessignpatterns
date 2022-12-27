package components;

import Flyweight.FabricaOpcion;
import Flyweight.OpcionVehiculo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoSolicitado {

    protected List<OpcionVehiculo> opciones = new ArrayList<>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<>();

    public void agregaOpciones(String nombre, int precioVenta, FabricaOpcion fabricaOpcion) {
        opciones.add(fabricaOpcion.getOpcion(nombre));
        precioDeVentaOpciones.add(precioVenta);
    }

    public void muestraOpciones() {
        int indice, tamano;
        tamano = opciones.size();
        for (indice = 0; indice < tamano; indice++) {
            opciones.get(indice).visualiza(
            precioDeVentaOpciones.get(indice));
            System.out.println();
        }
    }
}
