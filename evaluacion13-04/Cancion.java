public class Cancion {
    //Attributes
    private String nombre;
    private Integer duracionEnSegundos;

    //Constructors
    public Cancion() {
        this.nombre = null;
        this.duracionEnSegundos = -1;
    }

    public Cancion(String nombreIn, Integer duracionEnSegundosIn){
        this.nombre = nombreIn;
        this.duracionEnSegundos = duracionEnSegundosIn;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(Integer duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    //Methods
    public boolean esUnaCancionLarga(){
        return this.duracionEnSegundos >= 240;
    }
}
