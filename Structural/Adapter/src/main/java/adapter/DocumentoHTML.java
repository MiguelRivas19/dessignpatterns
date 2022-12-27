package adapter;

public class DocumentoHTML implements Documento {

    protected String contenido;

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void dibuja() {
        System.out.println("Dibuja el documento HTML: " + contenido);
    }

    @Override
    public void imprime() {
        System.out.println("Imprime el documento HTML: " + contenido);
    }
}
