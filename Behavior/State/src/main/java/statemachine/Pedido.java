package statemachine;

import states.EstadoPedido;
import states.PedidoEnCurso;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    protected List<Producto> productos = new ArrayList<>();
    protected EstadoPedido estadoPedido;

    public Pedido() {
        this.estadoPedido = new PedidoEnCurso(this);
    }

    public void agregaProducto(Producto producto) {
        estadoPedido.agregaProducto(producto);
    }

    public void suprimeProducto(Producto producto) {
        estadoPedido.suprimeProducto(producto);
    }

    public void borra() {
        estadoPedido.borra();
    }

    public void estadoSiguiente() {
        estadoPedido = estadoPedido.estadoSiguiente();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void visualiza() {
        System.out.println("Contenido del pedido");
        for(Producto producto: productos) {
            producto.visualiza();
        }
    }
}
