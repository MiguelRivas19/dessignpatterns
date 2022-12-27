package template;

public abstract class Pedido {

    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;

    protected abstract void calculaIVA();

    public void calculaPrecioConIVA() {
        this.calculaIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }

    public void setImporteSinIVA(double importeSinIVA) {
        this.importeSinIVA = importeSinIVA;
    }

    public void visualizacion () {
        System.out.println("Pedido");
        System.out.println("Impote sin IVA " + importeSinIVA);
        System.out.println("Importe con IVA " + importeConIVA);
    }
}
