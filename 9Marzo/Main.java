public class Main extends persona{
    public static void main(String[] args){
        
    }

    public static Persona crearPersona(){
        System.out.println("Ingrese su nombre: ");
        Scanner nombre_scanner = new Scanner(System.in);
        String nombre = nombre_scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        Scanner edad_scanner = new Scanner(System.in);
        int edad = edad_scanner.nextInt();

        System.out.println("Ingrese su telefono: ");
        Scanner tel_scanner = new Scanner(System.in);
        int telefono = tel_scanner.nextInt();

        System.out.println("Ingrese su dni: ");
        Scanner dni_scanner = new Scanner(System.in);
        int dni = dni_scanner.nextInt();

        System.out.println("Ingrese su direccion: ");
        Scanner dir_scanner = new Scanner(System.in);
        String direccion = dir_scanner.nextLine();
    }
}