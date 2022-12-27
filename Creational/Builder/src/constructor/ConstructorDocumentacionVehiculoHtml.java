package constructor;

import product.DocumentacionHtml;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentationVehiculo {

    public ConstructorDocumentacionVehiculoHtml() {
        documentation = new DocumentacionHtml();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "<HTML>";
        documentation.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatricula(String nombreSolicitante) {
        String documento;
        documento = "<HTML>Solicitud de matricula Cliente: " + nombreSolicitante + "<HTML>";
        documentation.agregaDocumento(documento);
    }
}
