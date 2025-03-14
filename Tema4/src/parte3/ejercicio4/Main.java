package parte3.ejercicio4;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa solicita al usuario que introduzca un número (0 o 1) o una cadena ("true" o "false")
 * y luego convierte dichos valores a un booleano utilizando la clase ParseToBoolean.
 * 
 * @author Iván
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     */
    public static void main(String[] args) {
    	
    	// Scanner
        Scanner sc = new Scanner(System.in);
        
        // Numero entero que debe ser 1 o 0 (true o false)
        int n;
        
        // Cadena donde escribiremos true o false
        String cadena;
        
        // Solicita al usuario que introduzca un 1 o un 0
        System.out.println("Introduce un 1 o un 0");
        n = sc.nextInt();
        sc.nextLine();
        
        // Verifica si el número introducido es 0 o 1 y lo convierte a booleano
        if (n == 0 || n == 1) {
            System.out.println(ParseToBoolean.parseToBoolean(n));
        } else {
            System.out.println("El número debe ser 1 o 0");
        }
        
        // Solicita al usuario que introduzca 'true' o 'false'
        System.out.println("Introduce un 'true' o un 'false'");
        cadena = sc.nextLine();
        
        // Verifica si la cadena introducida es 'true' o 'false' y la convierte a booleano
        if (cadena.equals("true") || cadena.equals("false")) {
        	
            System.out.println(ParseToBoolean.parseToBoolean(cadena));
            
        } else {
        	
            System.out.println("El valor debe ser 'true' o 'false'");
            
        }

		// Cerramos el scanner
		sc.close();
		
	}

}
