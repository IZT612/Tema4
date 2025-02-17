package parte2.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		double notaMedia;
		
		System.out.println("Introduzca el nombre del primer alumno: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca la nota media del primer alumno");
		notaMedia = sc.nextDouble();
		sc.nextLine();
		
		Alumno alumno1 = new Alumno(nombre, notaMedia);
		
		
		
	}

}
