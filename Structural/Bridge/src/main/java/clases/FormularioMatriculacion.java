package clases;

import Implementation.FormularioImpl;

public abstract class FormularioMatriculacion {

    protected String contenido;
    protected FormularioImpl implementation;

    public FormularioMatriculacion(FormularioImpl implementation) {
        this.implementation = implementation;
    }

    public void visualiza(){
        implementation.dibujaTexto("Numero de matricula existente: ");
    }

    public void generaDocumento() {
        implementation.dibujaTexto("solicitud de matriculacion");
        implementation.dibujaTexto("numero de matriculacion: " + contenido);
    }

    public boolean administraZona() {
        contenido = implementation.administrationZonaIndicada();
        return this.controlZona(contenido);
    }

    protected abstract boolean controlZona(String matricula);
}
