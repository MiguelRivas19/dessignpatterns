package components;

public class ComponentGestionDeDocumentos implements GestionDeDocumentos{
    @Override
    public String document(int indice) {
        return "Document numero " + indice;
    }
}
