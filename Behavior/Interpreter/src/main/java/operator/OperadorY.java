package operator;

import expression.Expresion;

public class OperadorY extends OperadorBinario {

    public OperadorY(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    @Override
    public boolean evaluan(String descripcion) {
        return operandoIzquierdo.evaluan(descripcion)&& operandoDerecho.evaluan(descripcion);
    }

    public static Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = Expresion.parsea();
        while ((pieza != null) && (pieza.equals("y"))) {
            siguientePieza();
            resultadoDerecho = Expresion.parsea();
            resultadoIzquierdo = new OperadorY(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
}
