package manager;

public abstract class ObjetoBasico {

    protected ObjetoBasico siguiente;

    private String descriptionPorDefecto() {
        return "descripcion por defecto";
    }

    protected abstract String getDescription();

    public String devuelveDescripcion() {
        String resultado;
        resultado = this.getDescription();
        if (resultado != null) {
            return resultado;
        }
        if (siguiente != null) {
            return siguiente.devuelveDescripcion();
        } else {
            return this.descriptionPorDefecto();
        }
    }

    public void setSiguiente(ObjetoBasico siguiente) {
        this.siguiente = siguiente;
    }
}
