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
		System.out.println();
		System.out.println("Probemos a cambiar las dos coordenadas del punto 1 con un solo método esta vez");
		System.out.println("La coordenada X:");
		coordenadaX = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Y ahora la Y:");
		coordenadaY = sc.nextInt();
		sc.nextLine();
		
		p1.setXY(coordenadaX, coordenadaY);
		System.out.println("Coordenadas del punto 1: (" + p1.getX() + ", " + p1.getY() + ")" );
		System.out.println();
		System.out.println("Ahora desplazaremos el punto, introduzca cuanto quiere sumar a la coordenada x y a la y");
		coordenadaX = sc.nextInt();
		sc.nextLine();
		coordenadaY = sc.nextInt();
		sc.nextLine();
		p1.desplaza(coordenadaX, coordenadaY);
		
		System.out.println();
		System.out.println("Ahora veamos la distancia del nuevo punto 1 con el punto 2");
		System.out.println(p1.distancia(p2));
		
		System.out.println("Finalmente, veamos por ultima vez las coordenadas del punto 1");
		System.out.println(p1.toString());
		
		// Cerramos el scaner
		sc.close();
		
	}

}
