package mediator;

import element.Boton;
import element.Control;
import element.PopupMenu;

import java.util.ArrayList;
import java.util.List;

public class Formulario {

    protected List<Control> controles = new ArrayList<>();
    protected List<Control> controlesCoprestatario = new ArrayList<>();
    protected PopupMenu menuCoprestatario;
    Boton botonOk;
    protected boolean enCurso = true;

    public void agregaControl(Control control) {
        controles.add(control);
        control.setDirector(this);
    }

    public void agregaControlCoprestatario(Control control) {
        controlesCoprestatario.add(control);
        control.setDirector(this);
    }

    public void setMenuCoprestatario(PopupMenu menuCoprestatario) {
        this.menuCoprestatario = menuCoprestatario;
    }

    public void setBotonOk(Boton botonOk) {
        this.botonOk = botonOk;
    }

    public void controlModificado(Control control) {
        if (control == menuCoprestatario) {
            if (control.getValor().equals("con coprestatario")){
                for (Control elementoCoprestatario: controlesCoprestatario) {
                    elementoCoprestatario.informa();
                }
            }
        }
        if (control == botonOk) {
            enCurso = false;
        }
    }

    public void informa() {
        while (true) {
            for(Control control: controles) {
                control.informa();
                if (!enCurso)
                    return;
            }
        }
    }
}
