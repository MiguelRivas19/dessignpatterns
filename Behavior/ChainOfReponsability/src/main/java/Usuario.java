import manager.Marca;
import manager.Modelo;
import manager.ObjetoBasico;
import manager.Vehiculo;

public class Usuario {

    public static void main(String[] args) {
        ObjetoBasico vehiculo1 = new Vehiculo("Auto++ KT500 Vehiculo de ocasion en buen estado");
        System.out.println(vehiculo1.devuelveDescripcion());

        ObjetoBasico modelo1 = new Modelo("Vehiculo amplio y confortable", "KT400");
        ObjetoBasico vehiculo2 = new Vehiculo(null);
        vehiculo2.setSiguiente(modelo1);
        System.out.println(vehiculo2.devuelveDescripcion());

        ObjetoBasico marca1 = new Marca("Marca del automovil", "de gran calidad", "Auto++");
        ObjetoBasico modelo2 = new Modelo(null, "KT700");
        modelo2.setSiguiente(marca1);
        ObjetoBasico vehiculo3 = new Vehiculo(null);
        vehiculo3.setSiguiente(modelo2);
        System.out.println(vehiculo3.devuelveDescripcion());

        ObjetoBasico vehiculo4 = new Vehiculo(null);
        System.out.println(vehiculo4.devuelveDescripcion());
    }
}
