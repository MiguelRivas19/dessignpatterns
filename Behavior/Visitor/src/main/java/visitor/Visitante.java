package visitor;

import elements.EmpresaMadre;
import elements.EmpresaSinFilial;

public interface Visitante {
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}
