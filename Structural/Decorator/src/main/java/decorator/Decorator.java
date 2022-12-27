package decorator;

import component.ComponenteGraficoVehiculo;

public abstract class Decorator implements ComponenteGraficoVehiculo {

    ComponenteGraficoVehiculo componente;

    public Decorator(ComponenteGraficoVehiculo componente) {
        this.componente = componente;
    }

    @Override
    public void visualiza() {
        componente.visualiza();
    }
}
