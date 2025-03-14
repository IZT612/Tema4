package parte4.ejercicio2;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa permite al usuario interactuar con un contador, pudiendo
 * incrementarlo, decrementarlo y mostrar su valor actual.
 * 
 * @author Iván
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Solicita al usuario que introduzca un valor inicial para el contador
     * y permite realizar operaciones como incrementar, decrementar o mostrar el contador.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contador contador;

        int cont;
        int veces;
        int opcion;

        // Solicita al usuario que introduzca el valor inicial del contador
        System.out.println("Introduzca el cont:");
        cont = sc.nextInt();
        sc.nextLine();
        contador = new Contador(cont);

        // Menú de opciones para el usuario
        do {
            System.out.println("Introduzca una opción.");
            System.out.println("1. Mostrar el contador.");
            System.out.println("2. Incrementar el contador.");
            System.out.println("3. Decrementar el contador.");
            System.out.println("4. Salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1 -> {
                    // Muestra el valor actual del contador
                    System.out.println(contador);
                }

                case 2 -> {
                    // Incrementa el contador la cantidad de veces especificada
                    System.out.println("¿Cuántas veces quiere incrementar?");
                    veces = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < veces; i++) {
                        contador.incrementar();
                    }
                }

                case 3 -> {
                    // Decrementa el contador la cantidad de veces especificada
                    System.out.println("¿Cuántas veces quiere decrementar?");
                    veces = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < veces; i++) {
                        contador.decrementar();
                    }
                }
            }

            System.out.println();

         // Sale del programa si el usuario elige la opción 4
        } while (opcion != 4); 

        System.out.println("Saliendo del programa.");

        sc.close();
    }
}
