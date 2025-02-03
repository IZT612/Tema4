package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos los objetos "persona1" y "persona2" de la clase Persona
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		// Bucle para pedir los datos de ambas personas
		for (int i = 1; i <= 2; i++) {
			
			// Pedimos el dni
			System.out.println("Introduzca el dni de la persona número " + i);
			
			// Según la persona lo guardamos en el ".dni" correspondiente
			if (i == 1) {
				
				persona1.dni = sc.nextLine();
				
			} else {
				
				persona2.dni = sc.nextLine();
				
			}
			
			// Pedimos el nombre
			System.out.println("Introduzca el nombre de la persona número " + i);
			
			// Según la persona lo guardamos en el ".nombre" correspondiente
			if (i == 1) {
				
				persona1.nombre = sc.nextLine();
				
			} else {
				
				persona2.nombre = sc.nextLine();
				
			}
			
			// Pedimos los apellidos
			System.out.println("Introduzca los apellidos de la persona número " + i);
			
			// Segun la persona lo guardamos en el ".apellidos" correspondiente
			if (i == 1) {
				
				persona1.apellidos = sc.nextLine();
				
			} else {
				
				persona2.apellidos = sc.nextLine();
				
			}
			
			// Pedimos la edad
			System.out.println("Introduzca la edad de la persona número " + i);
			
			// Segun la persona lo guardamos en el ".edad" correspondiente
			if (i == 1) {
				
				persona1.edad = sc.nextInt();
				
			} else {
				
				persona2.edad = sc.nextInt();
				
			}
			
			// Limpiamos el scanner
			sc.nextLine();
			
		}
		
		// Mostramos los datos de la persona 1
		System.out.print(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni);
		// Operador ternario para poner añadir "no" si no es mayor de edad
		System.out.print(persona1.edad >= 18 ? " " : " no ");
		System.out.println("es mayor de edad.");

		// Mostramos los datos de la persona 2
		System.out.print(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni);
		// Operador ternario para poner añadir "no" si no es mayor de edad
		System.out.print(persona2.edad >= 18 ? " " : " no ");
		System.out.println("es mayor de edad.");	
		
		// Cerramos el scanner
		sc.close();
	}

}
