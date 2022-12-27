package states;

import statemachine.Pedido;
import statemachine.Producto;

public class PedidoEntregado extends EstadoPedido {
    public PedidoEntregado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregaProducto(Producto producto) {

    }

    @Override
    public void borra() {

    }

    @Override
    public void suprimeProducto(Producto producto) {

    }

    @Override
    public EstadoPedido estadoSiguiente() {
        return this;
    }
}
