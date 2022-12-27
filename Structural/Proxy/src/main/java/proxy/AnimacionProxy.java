package proxy;

import subject.Animacion;
import subject.Video;

public class AnimacionProxy implements Animacion {

    private Video video = null;
    protected String foto = "mostrar la foto";
    @Override
    public void dibuja() {
        if (video != null) {
            video.dibuja();
        } else {
            dibuja(foto);
        }
    }

    @Override
    public void clic() {
        if (video == null) {
            video = new Video();
            video.cargar();
        }
        video.reproduce();
    }

    public void dibuja(String foto) {
        System.out.println(foto);
    }
}
