package parte3.ejercicio2;

import java.util.Scanner;

/**
 * La clase Main contiene el método principal que permite al usuario calcular 
 * la media aritmética de dos o tres números introducidos por teclado.
 */
public class Main {

    /**
     * Método principal que solicita al usuario la cantidad de números para calcular la media, 
     * recibe los valores y muestra el resultado en la consola utilizando la clase Medias.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int cantidad;

        // Solicita al usuario la cantidad de números para calcular la media
        System.out.println("¿De cuántos números quieres hacer la media?");
        cantidad = sc.nextInt();

        // Solicita el primer número
        System.out.println("Introduzca el primer número:");
        n1 = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea sobrante

        // Solicita el segundo número
        System.out.println("Introduzca el segundo número:");
        n2 = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea sobrante

        // Si el usuario desea calcular la media de tres números
        if (cantidad == 3) {
            System.out.println("Introduzca el tercer número:");
            n3 = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea sobrante

            // Calcula y muestra la media de tres números
            System.out.println("Resultado: " + Medias.media(n1, n2, n3));
        } else {
            // Calcula y muestra la media de dos números
            System.out.println("Resultado: " + Medias.media(n1, n2));
        }

        sc.close(); // Cierra el scanner
    }
}
