package product;

public class PedidoContado extends Pedido {

    public PedidoContado(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.println(
                "El pago del pedido por importe de: " + importe +
                        " se ha realizado."
        );
    }
}
