import factory.FabricaVehiculo;
import factory.FabricaVehiculoElectricidad;
import factory.FabricaVehiculoGasolina;
import products.Automovil;
import products.Scooter;

import java.util.Scanner;

public class Catalogo {

    public static int nAutos = 3;
    public static int nScooters = 2;

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabricaVehiculo;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];

        System.out.println("Desea utilizar " +
                "vehiculos electricos (1) o a gasolina (2):");
        String eleccion = reader.next();
        if (eleccion.equals("1")) {
            fabricaVehiculo = new FabricaVehiculoElectricidad();
        } else {
            fabricaVehiculo = new FabricaVehiculoGasolina();
        }

        for (int index = 0; index < nAutos; index++) {
            autos[index] = fabricaVehiculo.creaAutomovil("estandar", "amarillo", 6 + index, 3.2);
        }
        for (int index = 0; index < nScooters; index++) {
            scooters[index] = fabricaVehiculo.creaScooter("estandar", "amarillo", 2 + index);
        }

        for (Automovil auto: autos) {
            auto.mostrarCaracteristicas();
        }
        for (Scooter scooter: scooters) {
            scooter.mostrarCaracteristicas();
        }
    }
}
