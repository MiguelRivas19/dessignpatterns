package creator;

import product.Pedido;
import product.PedidoContado;

public class ClienteContado extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}
