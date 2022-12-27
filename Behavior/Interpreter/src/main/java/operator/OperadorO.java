package operator;

import expression.Expresion;

public class OperadorO extends OperadorBinario {
    public OperadorO(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    @Override
    public boolean evaluan(String descripcion) {
        return operandoIzquierdo.evaluan(descripcion) || operandoDerecho.evaluan(descripcion);
    }

    public static Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = OperadorY.parsea();
        while ((pieza != null) && (pieza.equals("o"))) {
            siguientePieza();
            resultadoDerecho = OperadorY.parsea();
            resultadoIzquierdo = new OperadorO(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
}
