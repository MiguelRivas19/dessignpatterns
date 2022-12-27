package decorator;

import component.ComponenteGraficoVehiculo;

public class MarcaDecorator extends Decorator{

    public MarcaDecorator(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaLogo() {
        System.out.println("Logotipo de la marca");
    }

    @Override
    public void visualiza() {
        super.visualiza();
        this.visualizaLogo();
    }
}
