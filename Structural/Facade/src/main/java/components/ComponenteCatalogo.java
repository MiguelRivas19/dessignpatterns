package components;

import java.util.ArrayList;
import java.util.List;

public class ComponenteCatalogo implements Catalogo {

    protected Object[] descripcionVehiculo = {
            "Berline 5 puertas", 6000, "Compacto 3 puertas", 4000,
            "Espace 5 puertas", 8000, "Break puertas", 7000,
            "Coupe 2 puertas", 9000, "Utilitario 3 puertas", 5000
    };

    @Override
    public List<String> buscaVehiculos(int precioMin, int precioMax) {
        int indice, tamano;
        List<String> resultado = new ArrayList<>();
        tamano = descripcionVehiculo.length / 2;
        for (indice = 0; indice < tamano; indice++) {
            int precio = (Integer) descripcionVehiculo[2 * indice + 1];
            if ((precio >= precioMin) && (precio <= precioMax)) {
                resultado.add((String) descripcionVehiculo[2 * indice]);
            }
        }
        return resultado;
    }
}
