package manager;

public class Modelo extends ObjetoBasico {

    protected String descripcion;
    protected String nombre;

    public Modelo(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    @Override
    protected String getDescription() {
        if (descripcion != null) {
            return "Modelo " + nombre + " : " + descripcion;
        } else {
            return null;
        }
    }
}
