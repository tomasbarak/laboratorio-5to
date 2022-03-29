import java.util.Scanner;
import persona;
public class ej2{
    public static void main(String[] args) {
        Persona created_person = crearPersona();

        System.out.println(created_person.nombre);
        System.out.println(created_person.edad);
        System.out.println(created_person.dni);
        System.out.println(created_person.telefono);
        System.out.println(created_person.direccion);
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

        Persona new_person = new Persona(nombre, edad, dni, telefono, direccion);

        return new_person;
    }
}