package creator;

import product.Pedido;
import product.PedidoCredito;

public class ClienteCredito extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}
