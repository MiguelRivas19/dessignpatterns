package element;

import mediator.Formulario;

public abstract class Control {
    protected String valor = "";
    public Formulario director;
    public String nombre;

    public Control(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDirector(Formulario director) {
        this.director = director;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public Formulario getDirector() {
        return director;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void informa();

    protected void modifica() {
        getDirector().controlModificado(this);
    }
}
