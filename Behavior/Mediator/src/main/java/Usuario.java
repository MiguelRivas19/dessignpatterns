import element.Boton;
import element.PopupMenu;
import element.ZonaInformacion;
import mediator.Formulario;

public class Usuario {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.agregaControl(new ZonaInformacion("Nombre"));
        formulario.agregaControl(new ZonaInformacion("Apellidos"));

        PopupMenu menu = new PopupMenu("Coprestatario");
        menu.agregaOpcion("sin coprestatario");
        menu.agregaOpcion("con coprestatario");
        formulario.agregaControl(menu);
        formulario.setMenuCoprestatario(menu);

        Boton boton = new Boton("Ok");
        formulario.agregaControl(boton);
        formulario.setBotonOk(boton);
        formulario.agregaControlCoprestatario(new ZonaInformacion("Nombre del coprestatario"));
        formulario.agregaControlCoprestatario(new ZonaInformacion("Apellido del coprestatario"));
        formulario.informa();
    }
}
