package parte4.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hora horita;
		
		int hora;
		int minuto;
		int segundo;
		int veces;
		int opcion;
		
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
				
				System.out.println(horita);
				
			}
			
			case 2 -> {
				
				System.out.println("¿Cuántos segundos quiere incrementar?");
				veces = sc.nextInt();
				sc.nextLine();
				
				for(int i = 0; i < veces; i++) {
					
					horita.incrementarSegundo();
					
				}
			}
			
			}
			
			System.out.println();
			
		} while (opcion != 3);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();
		
	}

}
