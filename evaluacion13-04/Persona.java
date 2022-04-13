public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private int telefono;

    public Persona(){
        this.nombre = "Claudia";
        this.apellido = "Geretti";
        this.edad = 12;
        this.dni = 22345123;
        this.telefono = 1145678900;
    }

    public Persona(String nombre, String apellido, int edad, int dni, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean esMayorDeEdad(){
        return this.getEdad() >= 18;
    }

    public boolean esAdultoJoven(){
        return this.getEdad() >= 18 && this.getEdad() <= 35;
    }
}
