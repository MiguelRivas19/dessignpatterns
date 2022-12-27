package facade;

import components.Catalogo;
import components.ComponentGestionDeDocumentos;
import components.ComponenteCatalogo;
import components.GestionDeDocumentos;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto{

    private Catalogo catalogo = new ComponenteCatalogo();
    private GestionDeDocumentos gestionDeDocumentos = new ComponentGestionDeDocumentos();

    @Override
    public String documento(int indice) {
        return gestionDeDocumentos.document(indice);
    }

    @Override
    public List<String> buscaVehiculos(int precioMedio, int desviacionMax) {
        return catalogo.buscaVehiculos(precioMedio - desviacionMax, precioMedio + desviacionMax);
    }
}
