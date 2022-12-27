package object;

import java.util.ArrayList;
import java.util.List;

public class OpcionVehiculo {

    protected String nombre;
    protected List<OpcionVehiculo> opcionesIncompatibles = new ArrayList<>();

    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
    }

    public void agregaOpcionIncompatible(OpcionVehiculo opcionIncompatible) {
        if (!opcionesIncompatibles.contains(opcionIncompatible)) {
            opcionesIncompatibles.add(opcionIncompatible);
            opcionIncompatible.agregaOpcionIncompatible(this);
        }
        this.opcionesIncompatibles = opcionesIncompatibles;
    }

    public List<OpcionVehiculo> getOpcionesIncompatibles() {
        return opcionesIncompatibles;
    }

    public void visualiza() {
        System.out.println("opcion: " + nombre);
    }
}
