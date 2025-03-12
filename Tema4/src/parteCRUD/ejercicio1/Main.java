package parteCRUD.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nombre;
		double nota;
		int opcion;
		
		do  {
			
			System.out.println("Introduzca una opción:");
			System.out.println("1. Mostrar listado.");
			System.out.println("2. Crear nuevo alumno.");
			System.out.println("3. Modificar nota de un alumno.");
			System.out.println("4. Borrar alumno.");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
				case 1 -> {
					
					AlumnoCRUD.listado();
					
				}
				
				case 2 -> {
					
					System.out.println("Introduzca el nombre del alumno");
					nombre = sc.nextLine();
					System.out.println("Ahora su nota");
					nota = sc.nextDouble();
					sc.nextLine();
					AlumnoCRUD.crearAlumno(nombre, nota);
					
				}
				
				case 3 -> {
					
					System.out.println("Introduzca el nombre del alumno");
					nombre = sc.nextLine();
					System.out.println("Ahora su nueva nota");
					nota = sc.nextDouble();
					sc.nextLine();
					AlumnoCRUD.modificar(nombre, nota);
					
				}
				
				case 4 -> {
					
					System.out.println("Introduzca el nombre del alumno");
					nombre = sc.nextLine();
					AlumnoCRUD.borrar(nombre);
					
				}
			
			}
			
			System.out.println();
			
		} while (opcion != 5);
		
		System.out.println("Saliendo del programa");
		
		sc.close();
		
	}

}
