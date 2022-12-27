import constructor.ConstructorDocumentacionVehiculoHtml;
import constructor.ConstructorDocumentacionVehiculoPdf;
import constructor.ConstructorDocumentationVehiculo;
import director.Vendedor;
import product.Documentacion;

import java.util.Scanner;

public class ClienteVehiculo {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentationVehiculo constructor;
        System.out.println("Desea generar " +
                "documentation HTML (1) o PDF (2):");
        String seleccion = reader.next();
        if (seleccion.equals("1")) {
            constructor = new ConstructorDocumentacionVehiculoHtml();
        } else {
            constructor = new ConstructorDocumentacionVehiculoPdf();
        }

        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.construye("Martin");
        documentacion.imprime();
    }
}
