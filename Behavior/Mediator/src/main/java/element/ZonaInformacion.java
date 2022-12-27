package element;

import java.util.Scanner;

public class ZonaInformacion extends Control {

    Scanner reader = new Scanner(System.in);
    public ZonaInformacion(String nombre) {
        super(nombre);
    }

    @Override
    public void informa() {
        System.out.println("Informacion de: " + nombre);
        setValor(reader.nextLine());
        this.modifica();
    }
}
