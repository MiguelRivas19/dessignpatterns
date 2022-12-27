package elements;

import visitor.Visitante;

public abstract class Empresa {

    protected String nombre, email, direccion;

    public Empresa(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public abstract boolean agregaFilial(Empresa filial);
    public abstract void aceptaVisitante(Visitante visitante);
}
