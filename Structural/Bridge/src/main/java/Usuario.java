import Implementation.FormAppletImpl;
import Implementation.FormHtmlImpl;
import clases.FormularioMatriculacionEspana;
import clases.FormularioMatriculacionPortugal;

public class Usuario {

    public static void main(String[] args) {
        FormularioMatriculacionPortugal formulario1 = new FormularioMatriculacionPortugal(new FormHtmlImpl());
        formulario1.visualiza();

        if (formulario1.administraZona())
            formulario1.generaDocumento();
        System.out.println();

        FormularioMatriculacionEspana formulario2 = new FormularioMatriculacionEspana(new FormAppletImpl());
        formulario2.visualiza();

        if(formulario2.administraZona())
            formulario2.generaDocumento();
    }
}
