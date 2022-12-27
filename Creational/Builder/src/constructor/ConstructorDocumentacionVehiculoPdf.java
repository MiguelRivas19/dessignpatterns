package constructor;

import product.DocumentacionPdf;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentationVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        documentation = new DocumentacionPdf();

    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "<PDF>";
        documentation.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatricula(String nombreSolicitante) {
        String documento;
        documento = "<PDF>Solicitud de matricula Cliente: " + nombreSolicitante + "<PDF>";
        documentation.agregaDocumento(documento);
    }
}
