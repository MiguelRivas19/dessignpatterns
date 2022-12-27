import facade.WebServiceAuto;
import facade.WebServiceAutoImpl;

import java.util.List;

public class UsuarioWebService {

    public static void main(String[] args) {
        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));

        List<String> resultados = webServiceAuto.buscaVehiculos(6000, 1000);
        if (resultados.size() > 0) {
            System.out.println("Vehiculos cuyo precio esta comprometido entre 5000 y 7000");
            for(String resultado: resultados) {
                System.out.println("   " + resultado);
            }
        }
    }
}
