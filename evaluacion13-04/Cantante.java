import java.util.ArrayList;

public class Cantante extends Persona{
    //Attributes
    private String nombreArtistico;
    private ArrayList<Cancion> canciones;

    //Constructor
    public Cantante(){
        this.nombreArtistico = null;
        this.canciones = new ArrayList<>();
    }

    //Getters and Setters

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    //Methods
    public ArrayList<Cancion> obtenerCancionesMasLargas(){
        ArrayList<Cancion> cancionesMasLargas= new ArrayList<>();

        for(Cancion cancion : this.canciones){
            if(cancion.esUnaCancionLarga()){
                cancionesMasLargas.add(cancion);
            }
        }
        return cancionesMasLargas;
    }

    public void agregarCancion(String nombre, Integer duracionEnSegundos){
        this.canciones.add(new Cancion(nombre, duracionEnSegundos));
    }
}
