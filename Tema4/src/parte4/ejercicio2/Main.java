package parte4.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Contador contador;

		int cont;
		int veces;
		int opcion;


		System.out.println("Introduzca el cont:");
		cont = sc.nextInt();
		sc.nextLine();
		contador = new Contador(cont);

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

				System.out.println(contador);

			}

			case 2 -> {

				System.out.println("¿Cuántas veces quiere incrementar?");
				veces = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < veces; i++) {

					contador.incrementar();

				}
			}
			
			case 3 -> {

				System.out.println("¿Cuántas veces quiere decrementar?");
				veces = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < veces; i++) {

					contador.decrementar();

				}
			}

			}

			System.out.println();

		} while (opcion != 4);

		System.out.println("Saliendo del programa.");

		sc.close();

	}

}
