package template;

public class PedidoLuxemburgo extends Pedido {
    @Override
    protected void calculaIVA() {
        importeIVA = importeSinIVA * 0.15;
    }
}
