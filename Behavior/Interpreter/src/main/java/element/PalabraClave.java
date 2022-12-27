package element;

import expression.Expresion;

public class PalabraClave extends Expresion {

    protected String palabraClave;

    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean evaluan(String descripcion) {
        return descripcion.indexOf(palabraClave) != -1;
    }

    public static Expresion parsea() throws Exception {
        Expresion resultado;
        resultado = new PalabraClave(pieza);
        siguientePieza();
        return resultado;
    }
}
