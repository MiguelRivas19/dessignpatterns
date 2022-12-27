package subject;

public class Video implements Animacion{
    @Override
    public void dibuja() {
        System.out.println("Mostrar el video");
    }

    @Override
    public void clic() {

    }

    public void cargar() {
        System.out.println("Cargar el video");
    }

    public void reproduce() {
        System.out.println("Reproducir el video");
    }
}
