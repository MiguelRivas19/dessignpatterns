package template;

public class PedidoEspana extends Pedido {
    @Override
    protected void calculaIVA() {
        importeIVA = importeSinIVA * 0.21;
    }
}
