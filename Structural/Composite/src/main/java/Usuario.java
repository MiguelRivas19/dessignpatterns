import composite.Empresa;
import composite.EmpresaMadre;
import composite.EmpresaSinFilial;

public class Usuario {

    public static void main(String[] args) {
        Empresa empresa1 = new EmpresaSinFilial();
        empresa1.agregarVehiculo();

        Empresa empresa2 = new EmpresaSinFilial();
        empresa2.agregarVehiculo();
        empresa2.agregarVehiculo();

        Empresa grupo = new EmpresaMadre();
        grupo.agregaFilial(empresa1);
        grupo.agregaFilial(empresa2);
        grupo.agregarVehiculo();

        System.out.println("Coste de mantenimiento total del grupo: " + grupo.calculaCosteMantenimiento());
    }
}
