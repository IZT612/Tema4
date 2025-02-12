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
		
	}

}
