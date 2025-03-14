package parte4.ejercicio1;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa permite al usuario crear una hora y realizar operaciones
 * como mostrar la hora o incrementarla en segundos.
 * 
 * @author Iván
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Solicita al usuario que introduzca una hora y permite realizar
     * operaciones como mostrar la hora o incrementarla en segundos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Hora horita;
        
        int hora;
        int minuto;
        int segundo;
        int veces;
        int opcion;
        
        // Solicita al usuario que introduzca la hora, minutos y segundos
        System.out.println("Introduzca la hora:");
        hora = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el minuto:");
        minuto = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el segundo:");
        segundo = sc.nextInt();
        sc.nextLine();
        horita = new Hora(hora, minuto, segundo);
        
        // Menú de opciones para el usuario
        do {
            System.out.println("Introduzca una opción.");
            System.out.println("1. Mostrar la hora.");
            System.out.println("2. Incrementar la hora.");
            System.out.println("3. Salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch (opcion) {
                case 1 -> {
                    // Muestra la hora actual
                    System.out.println(horita);
                }
                
                case 2 -> {
                    // Incrementa la hora en la cantidad de segundos especificada
                    System.out.println("¿Cuántos segundos quiere incrementar?");
                    veces = sc.nextInt();
                    sc.nextLine();
                    
                    for (int i = 0; i < veces; i++) {
                        horita.incrementarSegundo();
                    }
                }
            }
            
            System.out.println();
            
         // Sale del programa si el usuario elige la opción 3
        } while (opcion != 3); 
        
        System.out.println("Saliendo del programa.");
        
        sc.close();
    }
}