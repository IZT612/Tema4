package parte2.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		String genero;
		int cantidad;
		
		System.out.println("Introduzca el titulo del libro.");
		titulo = sc.nextLine();
		
		System.out.println("Introduzca el autor del libro.");
		autor = sc.nextLine();
		
		System.out.println("Introduzca cuantos ejemplares tiene.");
		ejemplares = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca cuantos ejemplares tiene prestados.");
		prestados = sc.nextInt();
		sc.nextLine();
		
		System.out.println("De qué género es el libro?");
		genero = sc.nextLine();
		
		Libro libro1 = new Libro(titulo, autor, ejemplares, prestados, genero);
		
		System.out.println("El título actual del libro es: '" + libro1.getTitulo() + "'. ¡Pero vamos a cambiarlo! Introduzca el nuevo titulo.");
		titulo = sc.nextLine();
		libro1.setTitulo(titulo);
		System.out.println("El nuevo titulo es: " + libro1.getTitulo());
		System.out.println("\nEs hora de hacer un préstamo, ¿cuántos libros quiere prestar?");
		cantidad = sc.nextInt();
		sc.nextLine();

		if (libro1.prestamo(cantidad)) {
			
			System.out.println("Se han prestado " + cantidad + " libros.");
			
		} else {
			
			System.out.println("Algo ha ido mal, debe introducir una cantidad menor o igual a la cantidad de libros que tiene y que sea positivo.");
			
		}
		
		System.out.println("\nParece que ya te han devuelto algunos, ¿cuántos han devuelto?");
		cantidad = sc.nextInt();
		sc.nextLine();
		
		if (libro1.devolucion(cantidad)) {
			
			System.out.println("Se te han devuelto " + cantidad + " libros.");
			
		} else {
			
			System.out.println("Algo ha ido mal, te deben haber devuelto menos o los mismos libros que has prestado y debe ser positivo.");
			
		}
		
		System.out.println("\nVeamos los datos del primer libro: ");
		System.out.println(libro1.toString());
		System.out.println("\nY por último, crearemos otro libro para poder compararlo con el primero:");
		System.out.println("Introduzca el titulo del libro.");
		titulo = sc.nextLine();
		
		System.out.println("Introduzca el autor del libro.");
		autor = sc.nextLine();
		
		System.out.println("Introduzca cuantos ejemplares tiene.");
		ejemplares = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca cuantos ejemplares tiene prestados.");
		prestados = sc.nextInt();
		sc.nextLine();
		
		System.out.println("De qué género es el libro?");
		genero = sc.nextLine();
		
		Libro libro2 = new Libro(titulo, autor, ejemplares, prestados, genero);
		
		System.out.println("\n¡Ahora comparemos los libros!");
		
		if (libro1.equals(libro2)) {
			
			System.out.println("¡Ambos libros son iguales!");
			
		} else {
			
			System.out.println("Los libros son distintos.");
			
		}
		
		sc.close();
		
	}

}
