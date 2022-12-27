package element;

import java.util.Scanner;

public class Boton extends Control {

    Scanner reader = new Scanner(System.in);
    public Boton(String nombre) {
        super(nombre);
    }

    @Override
    public void informa() {
        System.out.println("Desea activar el boton " + nombre + " ?");
        String respuesta = reader.nextLine();
        if (respuesta.equals("si"))
            this.modifica();
    }
}
