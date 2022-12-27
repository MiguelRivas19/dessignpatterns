package decorator;

import component.ComponenteGraficoVehiculo;

public class ModeloDecorator extends Decorator{

    public ModeloDecorator(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaInformacionTecnica() {
        System.out.println("Informacion tecnica del modelo");
    }

    @Override
    public void visualiza() {
        super.visualiza();
        this.visualizaInformacionTecnica();
    }
}
