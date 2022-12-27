package states;

import statemachine.Pedido;
import statemachine.Producto;

public class PedidoValido extends EstadoPedido {
    public PedidoValido(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregaProducto(Producto producto) {

    }

    @Override
    public void borra() {
        pedido.getProductos().clear();
    }

    @Override
    public void suprimeProducto(Producto producto) {

    }

    @Override
    public EstadoPedido estadoSiguiente() {
        return new PedidoEntregado(pedido);
    }
}
