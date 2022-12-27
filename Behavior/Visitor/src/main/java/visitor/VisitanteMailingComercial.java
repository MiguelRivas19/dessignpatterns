package visitor;

import elements.EmpresaMadre;
import elements.EmpresaSinFilial;

public class VisitanteMailingComercial implements Visitante {
    @Override
    public void visita(EmpresaSinFilial empresa) {
        System.out.println("Envia un mail a " +
                empresa.getNombre() + " direccion: " + empresa.getEmail() +
                "Propuesta comercial para su empresa");
    }

    @Override
    public void visita(EmpresaMadre empresa) {
        System.out.println("Envia un mail a " +
                empresa.getNombre() + " direccion: " + empresa.getEmail() +
                " Propuesta comercial para su grupo");
        System.out.println("Impresion de un correo para " +
                empresa.getNombre() + " direccion: " +
                empresa.getDireccion() +
                " Propuesta comercial para su grupo");
    }
}
