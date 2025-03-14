package parte3.ejercicio5;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa permite al usuario generar números aleatorios en diferentes rangos
 * según la opción seleccionada.
 * 
 * @author Iván
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Solicita al usuario que seleccione una opción para generar números aleatorios
     * y llama a los métodos correspondientes de la clase Funciones.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidad;
        int minimo;
        int maximo;
        int opcion;
        
        // Muestra las opciones disponibles al usuario
        System.out.println("Escoja una opción");
        System.out.println("1. Mostrar 'n' números aleatorios entre 0 y 1.");
        System.out.println("2. Mostrar 'n' numeros aleatorios entre 0 y 'b'.");
        System.out.println("3. Mostrar 'n' números aleatorios entre 'b' y 'c'.");
        opcion = sc.nextInt();
        sc.nextLine();
        
        // Ejecuta la opción seleccionada por el usuario
        switch (opcion) {
        
            case 1 -> {
                // Genera números aleatorios entre 0 y 1
                System.out.println("\nIntroduzca la cantidad.");
                cantidad = sc.nextInt();
                Funciones.numerosAleatorios(cantidad);
            }
            
            case 2 -> {
                // Genera números aleatorios entre 0 y un máximo especificado
                System.out.println("\nIntroduzca la cantidad y máximo.");
                cantidad = sc.nextInt();
                sc.nextLine();
                maximo = sc.nextInt();    
                Funciones.numerosAleatorios(cantidad, maximo);
            }
            
            case 3 -> {
                // Genera números aleatorios entre un mínimo y un máximo especificados
                System.out.println("\nIntroduzca la cantidad, mínimo y máximo.");
                cantidad = sc.nextInt();
                sc.nextLine();
                minimo = sc.nextInt();    
                sc.nextLine();
                maximo = sc.nextInt();
                Funciones.numerosAleatorios(cantidad, minimo, maximo);
            }
        }
        
        sc.close();
    }
}
