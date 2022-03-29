package persona;
public class persona{
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", 11, 1241, 1241111432, "so");
        Persona p2 = new Persona("Maier", 2, 4, 123, "Gordolandia");
        Persona p3 = new Persona("no se", 33, 412, 11656334, "caja");
    
        p1.set_data(p1.nombre, p1.edad * 2, p1.dni, p1.telefono, p1.direccion);
        p2.set_data(p2.nombre, p2.edad, p2.dni, 892342, p2.direccion);
        p3.get_data();
    }
    

    public static class Persona{
        // Constructs
        public Persona(){
            this.nombre = "Marta";
            this.edad = 99;
            this.dni = -1;
            this.telefono = 1111111111;
            this.direccion = "Balcarce 50, C1064 CABA";
        }

        public Persona(String nombre){
            this.nombre = nombre;
            this.edad = 99;
            this.dni = -1;
            this.telefono = 1111111111;
            this.direccion = "Balcarce 50, C1064 CABA";
        }

        public Persona(String nombre, int edad, int dni, int telefono, String direccion){
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        // Defs
        public boolean esMayorDeEdad(){
            return this.edad > 18;
        }

        public boolean sonLaMismaPersona(Persona tgt1){
            return this.dni == tgt1.dni;
        }

        public boolean tienenLaMismaEdad(Persona tgt1){
            return this.edad == tgt1.edad;
        }

        public void set_data(String nombre, int edad, int dni, int telefono, String direccion){
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        public void get_data(){
            System.out.println(this.nombre);
            System.out.println(this.edad);
            System.out.println(this.dni);
            System.out.println(this.telefono);
            System.out.println(this.direccion);
        }

        // Var
        private String nombre;
        private int edad;
        private int dni;
        private int telefono;
        private String direccion;
    }
}