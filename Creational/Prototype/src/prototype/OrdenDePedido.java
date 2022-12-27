package prototype;

public class OrdenDePedido extends Documento {
    @Override
    public void imprime() {
        System.out.println("Imprime la orden de pedido: " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra la orden de pedido: " + contenido);
    }
}
