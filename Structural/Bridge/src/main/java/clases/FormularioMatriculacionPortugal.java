package clases;

import Implementation.FormularioImpl;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion {

    public FormularioMatriculacionPortugal(FormularioImpl implementation) {
        super(implementation);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 6;
    }
}
