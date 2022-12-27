import adapter.Documento;
import adapter.DocumentoHTML;
import adapter.DocumentoPdf;

public class ServidorWeb {

    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHTML();
        documento1.setContenido("Hello");
        documento1.dibuja();
        System.out.println();

        documento2 = new DocumentoPdf();
        documento2.setContenido("Hola");
        documento2.dibuja();
    }
}
