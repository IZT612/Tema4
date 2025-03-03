package parte3.ejercicio1;

import java.util.Scanner;

/**
 * La clase Main contiene el método principal para ejecutar la suma de dos números
 * introducidos por el usuario.
 */
public class Main {

    /**
     * Método principal que solicita al usuario dos números, los suma utilizando la clase
     * Sumas y muestra el resultado en la consola.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;

        // Solicita al usuario que introduzca dos números
        System.out.println("Introduzca números para sumar:");
        n1 = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer
        n2 = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer

        // Muestra el resultado de la suma
        System.out.println("Resultado: " + Sumas.suma(n1, n2));

        sc.close(); // Cierra el scanner
    }
}
