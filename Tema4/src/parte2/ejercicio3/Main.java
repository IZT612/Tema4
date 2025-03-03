package parte2.ejercicio3;

import java.util.Scanner;

/**
 * Clase principal que permite la interacción con el usuario para crear y comparar objetos de la clase Alumno.
 */
public class Main {

    /**
     * Método principal que gestiona la entrada del usuario y la manipulación de objetos Alumno.
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        double notaMedia;
        
        // Creación del primer alumno
        System.out.println("Introduzca el nombre del primer alumno: ");
        nombre = sc.nextLine();
        
        System.out.println("\nIntroduzca la nota media del primer alumno");
        notaMedia = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer
        
        Alumno alumno1 = new Alumno(nombre, notaMedia);
        
        // Cambio del nombre del primer alumno
        System.out.println("\nCambiemos su nombre");
        nombre = sc.nextLine();
        alumno1.setNombre(nombre);
        System.out.println("\nSu nuevo nombre es: ");
        System.out.println(alumno1.getNombre());
        
        // Muestra los datos del primer alumno
        System.out.println("\nVeamos ahora sus datos");
        System.out.println(alumno1.toString());
        
        // Creación del segundo alumno para comparación
        System.out.println("\nProbaremos a compararlo con otro alumno, pero para esto necesitamos un segundo alumno:");
        System.out.println("\nIntroduzca el nombre del segundo alumno: ");
        nombre = sc.nextLine();
        
        System.out.println("\nIntroduzca la nota media del segundo alumno");
        notaMedia = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer
        
        Alumno alumno2 = new Alumno(nombre, notaMedia);
        
        // Comparación de los dos alumnos
        System.out.println("\nAhora comparemoslos:");
        if (alumno1.equals(alumno2)) {
            System.out.println("Ambos alumnos son iguales");
        } else {
            System.out.println("Los alumnos no son iguales");
        }
        
        sc.close();
    }
}