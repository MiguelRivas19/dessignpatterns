package director;

import constructor.ConstructorDocumentationVehiculo;
import product.Documentacion;

public class Vendedor {
    protected ConstructorDocumentationVehiculo constructor;

    public Vendedor(ConstructorDocumentationVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye (String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatricula(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
