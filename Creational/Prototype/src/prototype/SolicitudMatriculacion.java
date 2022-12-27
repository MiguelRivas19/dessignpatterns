package prototype;

public class SolicitudMatriculacion extends Documento {
    @Override
    public void imprime() {
        System.out.println("Imprime la orden de matriculacion: " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra la orden de matriculacion: " + contenido);
    }
}
