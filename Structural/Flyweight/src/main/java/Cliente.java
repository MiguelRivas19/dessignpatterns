import Flyweight.FabricaOpcion;
import components.VehiculoSolicitado;

public class Cliente {

    public static void main(String[] args) {
        FabricaOpcion fabricaOpcion = new FabricaOpcion();
        VehiculoSolicitado vehiculoSolicitado = new VehiculoSolicitado();

        vehiculoSolicitado.agregaOpciones("air bag", 80, fabricaOpcion);
        vehiculoSolicitado.agregaOpciones("direccion asistida", 90, fabricaOpcion);
        vehiculoSolicitado.agregaOpciones("elevaluna electrico", 85, fabricaOpcion);

        vehiculoSolicitado.muestraOpciones();
    }
}
