package object;

import memento.Memento;
import memento.MementoImpl;

import java.util.ArrayList;
import java.util.List;

public class CarritoOpciones {

    protected List<OpcionVehiculo> opciones = new ArrayList<>();

    public Memento agregaOpcion(OpcionVehiculo opcionVehiculo) {
        MementoImpl resultado = new MementoImpl();
        resultado.setEstado(opciones);
        opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());
        opciones.add(opcionVehiculo);
        return resultado;
    }

    public void anula(Memento memento) {
        MementoImpl mementoInstance;
        try {
            mementoInstance = (MementoImpl) memento;
        } catch (ClassCastException e) {
            return;
        }
        opciones = mementoInstance.getEstado();
    }

    public void visualiza() {
        System.out.println("Contenido del carrito de opciones");
        for(OpcionVehiculo opcion: opciones) {
            opcion.visualiza();
        }
    }
}
