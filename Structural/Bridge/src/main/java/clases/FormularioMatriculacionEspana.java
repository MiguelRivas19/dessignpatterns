package clases;

import Implementation.FormularioImpl;

public class FormularioMatriculacionEspana extends FormularioMatriculacion {

    public FormularioMatriculacionEspana(FormularioImpl implementation) {
        super(implementation);
    }


    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 7;
    }
}
