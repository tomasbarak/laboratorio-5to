import java.util.ArrayList;
public class SistemaDeCantantes {
    private ArrayList<Cantante> cantantes;

    //Constructors
    public SistemaDeCantantes(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    //Getters and Setters

    public ArrayList<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    //Methods

    public ArrayList<Cantante> obtenerCantantesJovenes(){
        ArrayList<Cantante> cantantesJovenes = new ArrayList<>();

        for (Cantante cantante : this.cantantes){
            if(cantante.esAdultoJoven()){
                cantantesJovenes.add(cantante);
            }
        }

        return cantantesJovenes;
    }

    public void agregarCancion(String nombreArtistico, String nombreCancion, Integer duracionEnSegundos){
        for(Cantante cantante : this.cantantes){
            if(cantante.getNombreArtistico() == nombreArtistico){
                cantante.agregarCancion(nombreCancion, duracionEnSegundos);
            }
        }
    }
}
