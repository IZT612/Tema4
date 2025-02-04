package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		String dni;
		String nombre;
		String apellidos;
		int edad;
			
			// Pedimos el dni y lo guardamos en "dni"
			System.out.println("Introduzca el dni de la persona número 1");
			dni = sc.nextLine();
			
			// Pedimos el nombre y lo guardamos en "nombre"
			System.out.println("Introduzca el nombre de la persona número 1");
			nombre = sc.nextLine();
			
			// Pedimos los apellidos y los guardamos en "apellidos"
			System.out.println("Introduzca los apellidos de la persona número 1");
			apellidos = sc.nextLine();
			
			// Pedimos la edad y la guardamos en "edad"
			System.out.println("Introduzca la edad de la persona número 1");
			edad = sc.nextInt();
			System.out.println();
			
			// Limpiamos el scanner
			sc.nextLine();
				
			Persona persona1 = new Persona(dni, nombre, apellidos, edad);
			
			// Pedimos el dni y lo guardamos en "dni"
			System.out.println("Introduzca el dni de la persona número 2");
			dni = sc.nextLine();
			
			// Pedimos el nombre y lo guardamos en "nombre"
			System.out.println("Introduzca el nombre de la persona número 2");
			nombre = sc.nextLine();
			
			// Pedimos los apellidos y los guardamos en "apellidos"
			System.out.println("Introduzca los apellidos de la persona número 2");
			apellidos = sc.nextLine();
			
			// Pedimos la edad y la guardamos en "edad"
			System.out.println("Introduzca la edad de la persona número 2");
			edad = sc.nextInt();
			System.out.println();
			
			// Limpiamos el scanner
			sc.nextLine();
			
			Persona persona2 = new Persona(dni, nombre, apellidos, edad);
		
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
