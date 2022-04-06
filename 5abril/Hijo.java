import java.util.ArrayList;

public class Hijo extends Persona{
    private String escuela;
    private String juegoFav;

    public Hijo(){
        this.escuela = null;
        this.juegoFav = null;
    }

    public Hijo(String escuelaIn, String juegoFavIn){
        this.escuela = escuelaIn;
        this.juegoFav = juegoFavIn;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela, String juegoFav) {
        this.escuela = escuela;
        this.juegoFav = juegoFav;
    }

    public String getJuegoFav() {
        return juegoFav;
    }

    public void setJuegoFav(String juegoFav) {
        this.juegoFav = juegoFav;
    }
}
