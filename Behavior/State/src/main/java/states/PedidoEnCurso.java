package states;

import statemachine.Pedido;
import statemachine.Producto;

public class PedidoEnCurso extends EstadoPedido{

    public PedidoEnCurso(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregaProducto(Producto producto) {
        pedido.getProductos().add(producto);
    }

    @Override
    public void borra() {
        pedido.getProductos().clear();
    }

    @Override
    public void suprimeProducto(Producto producto) {
        pedido.getProductos().remove(producto);
    }

    @Override
    public EstadoPedido estadoSiguiente() {
        return new PedidoValido(pedido);
    }
}
