import template.Pedido;
import template.PedidoEspana;
import template.PedidoLuxemburgo;

public class Usuario {

    public static void main (String[] args) {
        Pedido pedidoEspana = new PedidoEspana();
        pedidoEspana.setImporteSinIVA(1000);
        pedidoEspana.calculaPrecioConIVA();
        pedidoEspana.visualizacion();

        Pedido pedidoLuxemburgo = new PedidoLuxemburgo();
        pedidoLuxemburgo.setImporteSinIVA(1000);
        pedidoLuxemburgo.calculaPrecioConIVA();
        pedidoLuxemburgo.visualizacion();
    }
}
