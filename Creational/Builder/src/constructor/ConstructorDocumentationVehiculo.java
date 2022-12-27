package constructor;

import product.Documentacion;

public abstract class ConstructorDocumentationVehiculo {

    protected Documentacion documentation;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolicitudMatricula(String nombreSolicitante);

    public Documentacion resultado() {
        return documentation;
    }
}
