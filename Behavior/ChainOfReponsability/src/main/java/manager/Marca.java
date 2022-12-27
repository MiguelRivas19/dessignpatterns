package manager;

public class Marca extends ObjetoBasico {
    protected String descripcion1, descripcion2;
    protected String nombre;

    public Marca(String descripcion1, String descripcion2, String nombre) {
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.nombre = nombre;
    }

    @Override
    protected String getDescription() {
        if ((descripcion1 != null) && (descripcion2 != null))
            return "Marca " + nombre + " : " + descripcion1 + " " + descripcion2;
        else if (descripcion1 != null)
            return "Marca " + nombre + " : " + descripcion1;
        else
            return null;
    }
}
