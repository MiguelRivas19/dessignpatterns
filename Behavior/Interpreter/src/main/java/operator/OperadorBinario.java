package operator;

import expression.Expresion;

public abstract class OperadorBinario extends Expresion {

    protected Expresion operandoIzquierdo, operandoDerecho;

    public OperadorBinario(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        this.operandoIzquierdo = operandoIzquierdo;
        this.operandoDerecho = operandoDerecho;
    }
}
