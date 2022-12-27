import prototype.CertificadoCesion;
import prototype.OrdenDePedido;
import prototype.SolicitudMatriculacion;

public class Usuario {

    public static void main (String[] args) {
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());

        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");

        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}
