import expression.Expresion;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        Expresion expresionConsulta = null;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su consulta: ");
        String consulta = reader.nextLine();
        try {
            expresionConsulta = Expresion.analiza(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            expresionConsulta = null;
        }
        if (expresionConsulta != null) {
            System.out.println("Introduzca la descripcion de un vehiculo: ");
            String description = reader.nextLine();
            if (expresionConsulta.evaluan(description))
                System.out.println("La descripcion responde a la consulta");
            else
                System.out.println("La descripcion no responde a la consulta");
        }
    }
}
