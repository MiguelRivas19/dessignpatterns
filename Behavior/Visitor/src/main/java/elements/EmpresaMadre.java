package elements;

import visitor.Visitante;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa {

    private List<Empresa> filiales = new ArrayList<>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }

    @Override
    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
        for (Empresa filial : filiales)
            filial.aceptaVisitante(visitante);
    }
}
