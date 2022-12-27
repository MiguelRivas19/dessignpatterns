import component.VistaVehiculo;
import decorator.MarcaDecorator;
import decorator.ModeloDecorator;

public class VistaCatalogo {

    public static void main(String[] args) {
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorator modeloDecorator = new ModeloDecorator(vistaVehiculo);
        MarcaDecorator marcaDecorator = new MarcaDecorator(modeloDecorator);

        marcaDecorator.visualiza();
    }
}
