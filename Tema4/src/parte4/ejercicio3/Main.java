package parte4.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fecha fecha;
		
		int dia;
		int mes;
		int año;
		int opcion;
		
		System.out.println("Introduzca el día.");
		dia = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca el mes.");
		mes = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca el año.");
		año = sc.nextInt();
		sc.nextLine();
		
		fecha = new Fecha(dia, mes, año);
		
		do {
			
			System.out.println("Introduzca una opción.");
			System.out.println("1. Ver fecha.");
			System.out.println("2. Ver si el año es bisiesto.");
			System.out.println("3. Comprobar fecha.");
			System.out.println("4. Próximo día.");
			System.out.println("5. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
			case 1 -> {
				
				System.out.println(fecha);
				
			}
			
			case 2 -> {
				
				if (fecha.esBisiesto()) {
					
					System.out.println("El año es bisiesto.");
					
				} else {
					
					System.out.println("El año no es bisiesto.");
					
				}
				
			}
			
			case 3 -> {
				
				if (fecha.fechaCorrecta()) {
					
					System.out.println("La fecha es correcta.");
					
				} else {
					
					System.out.println("La fecha es incorrecta.");
					
				}
				
			}
			
			case 4 -> {
				
				fecha.diaSiguiente();
				
			}
			
			}
			
			System.out.println();
 			
		} while (opcion != 5);

		sc.close();
		
	}

}
