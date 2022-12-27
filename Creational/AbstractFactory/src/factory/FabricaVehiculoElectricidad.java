package factory;

import products.Automovil;
import products.AutomovilElectricidad;
import products.Scooter;
import products.ScooterElectricidad;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {
    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return  new AutomovilElectricidad(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color, potencia);
    }
}
