package parte3.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidad;
		int minimo;
		int maximo;
		int opcion;
		
		System.out.println("Escoja una opción");
		System.out.println("1. Mostrar 'n' números aleatorios entre 0 y 1.");
		System.out.println("2. Mostrar 'n' numeros aleatorios entre 0 y 'b'.");
		System.out.println("3. Mostrar 'n' números aleatorios entre 'b' y 'c'.");
		opcion = sc.nextInt();
		sc.nextLine();
		
		switch (opcion) {
		
			case 1 -> {
				
				System.out.println("\nIntroduzca la cantidad.");
				cantidad = sc.nextInt();
				Funciones.numerosAleatorios(cantidad);
				
				
			}
			
			case 2 -> {
				
				System.out.println("\nIntroduzca la cantidad y máximo.");
				cantidad = sc.nextInt();
				sc.nextLine();
				maximo = sc.nextInt();	
				Funciones.numerosAleatorios(cantidad, maximo);
				
			}
			
			case 3 -> {
				
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
