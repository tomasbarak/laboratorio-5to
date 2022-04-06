import java.util.ArrayList;
public class Madre extends Persona{
    private String nombreEmpresaQueTrabaja;
    private ArrayList<Hijo> hijos;

    public Madre(){
        this.nombreEmpresaQueTrabaja = "";
        this.hijos = new ArrayList<>();
    }

    public Madre(String nombreEmpresa, ArrayList<Hijo> hijos){
        this.nombreEmpresaQueTrabaja = nombreEmpresa;
        this.hijos = hijos;
    }

    public ArrayList<Hijo> getHijosMenores(){
        ArrayList<Hijo> menoresDeEdad = new ArrayList<>();
        for(Hijo hijo: this.hijos){
            if(!hijo.esMayorDeEdad(hijo.getEdad())){
                menoresDeEdad.add(hijo);
            }
        }
        return menoresDeEdad;
    }

    public String getNombreEmpresaQueTrabaja() {
        return nombreEmpresaQueTrabaja;
    }

    public void setNombreEmpresaQueTrabaja(String nombreEmpresaQueTrabaja) {
        this.nombreEmpresaQueTrabaja = nombreEmpresaQueTrabaja;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Hijo> hijos) {
        this.hijos = hijos;
    }
}
