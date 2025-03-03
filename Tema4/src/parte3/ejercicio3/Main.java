package parte3.ejercicio3;

import java.util.Scanner;

/**
 * La clase Main contiene el método principal que permite al usuario introducir
 * un número entero y calcular la suma de los números naturales utilizando la
 * clase SumasEnteros.
 */
public class Main {

	/**
	 * Método principal que solicita al usuario un número entero, calcula la suma de
	 * los números enteros utilizando SumasEnteros.sumaEnteros(n) y muestra el
	 * resultado en la consola.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		// Solicita al usuario que introduzca un número entero
		System.out.println("Introduzca el número:");
		n = sc.nextInt();
		sc.nextLine(); // Consumir la nueva línea sobrante

		// Calcula y muestra la suma de los primeros n números naturales
		System.out.println(SumasEnteros.sumaEnteros(n));

		sc.close(); // Cierra el scanner para liberar recursos
	}
}
