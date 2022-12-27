package prototype;

public abstract class Documento implements Cloneable {

    protected String contenido = new String();

    public Documento duplica() {
        Documento ressultado;
        try {
            ressultado = (Documento) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return ressultado;
    }

    public void rellena (String informacion) {
        contenido = informacion;
    }

    public abstract void imprime();
    public abstract void visualiza();
}
