package prototype;

public class CertificadoCesion extends Documento {
    @Override
    public void imprime() {
        System.out.println("Imprime la orden de cesion: " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra la orden de cesion: " + contenido);
    }
}
