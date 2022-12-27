package Implementation;

import java.util.Scanner;

public class FormHtmlImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    @Override
    public void dibujaTexto(String texto) {
        System.out.println("HTML: " + texto);
    }

    @Override
    public String administrationZonaIndicada() {
        return reader.next();
    }
}
