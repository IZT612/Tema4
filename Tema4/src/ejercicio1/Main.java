package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables enteras donde guardaremos las coordenadas a introducir
		int coordenadaX;
		int coordenadaY;
		
		// Creamos los objetos p1, p2 y p3, que son puntos, obtenidos de la clase Punto, dandole las coordenadas con las que iniciars
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);
		
		// Mostramos las coordenadas de los 3 puntos
		System.out.println("Coordenadas del punto 1: (" + p1.getX() + ", " + p1.getY() + ")" );
		System.out.println("Coordenadas del punto 2: (" + p2.getX() + ", " + p2.getY() + ")" );
		System.out.println("Coordenadas del punto 3: (" + p3.getX() + ", " + p3.getY() + ")" );
		System.out.println();
		
		// Volvemos a pedir las coordenadas del punto y las guardamos, para cambiar las coordenadas con las funciones "setX" y "setY"
		System.out.println("Vamos a cambiar las coordenadas del punto 1");
		System.out.println("Introduzca la nueva coordenada X");
		coordenadaX = sc.nextInt();
		p1.setX(coordenadaX);
		System.out.println("Introduzca ahora la nueva coordenada Y");
		coordenadaY = sc.nextInt();
		p1.setY(coordenadaY);
		
		
		
		// Mostramos las coordenadas del punto 1
		System.out.println("Coordenadas del punto 1: (" + p1.getX() + ", " + p1.getY() + ")" );
		System.out.println("Coordenadas del punto 2: (" + p2.getX() + ", " + p2.getY() + ")" );
		System.out.println("Coordenadas del punto 3: (" + p3.getX() + ", " + p3.getY() + ")" );
	
		// Cerramos el scaner
		sc.close();
		
	}

}
