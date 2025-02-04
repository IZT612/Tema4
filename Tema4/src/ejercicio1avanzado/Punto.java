package ejercicio1avanzado;

import java.util.Scanner;

/**
 * Clase Punto que guarda funciones para operar con puntos y los atributos de los propios puntos
 */
public class Punto {
	
	// Creamos el scanner
	static Scanner sc = new Scanner(System.in);

	// Creamos el atributo de la clase "Punto" coordenadaX
	int coordenadaX;
	
	// Creamos el atributo de la clase "Punto" coordenadaY
	int coordenadaY;
	
	/**
	 * Función que recibe un punto y pide 2 numeros para sumarlos a sus coordenadas
	 * 
	 * @param punto = Un punto introducido por el usuario
	 */
	public static void suma(Punto punto) {
		
		// Pedimos ambos números
		System.out.println("Introduzca un número para sumar a la coordenada X");
		int sumaX = sc.nextInt();
		
		System.out.println("Ahora introduzca un número para sumar a la coordenada Y");
		int sumaY = sc.nextInt();
		
		// Los sumamos a las coordenadas
		punto.coordenadaX += sumaX;
		punto.coordenadaY += sumaY;
		
	}
	
	/**
	 * Función que recibe un punto y pide 2 numeros para restarle a sus coordenadas
	 * 
	 * @param punto = Un punto introducido por el usuario
	 */
	public static void resta (Punto punto) {
		
		// Pedimos los 2 numeros
		System.out.println("Introduzca un número para restar a la coordenada X");
		int restaX = sc.nextInt();
		
		System.out.println("Ahora introduzca un número para restar a la coordenada Y");
		int restaY = sc.nextInt();
		
		// Se los restamos a las coordenadas
		punto.coordenadaX -= restaX;
		punto.coordenadaY -= restaY;
		
	}
	
	/**
	 * Función que pide 2 numeros y multiplica las coordenadas del punto por estos
	 * 
	 * @param punto = Un punto introducido por el usuario
	 */
	public static void multiplicacion (Punto punto) {
		
		// Pedimos los 2 numeros
		System.out.println("Introduzca un número para multiplicar a la coordenada X");
		int multX = sc.nextInt();
		
		System.out.println("Ahora introduzca un número para multiplicar a la coordenada Y");
		int multY = sc.nextInt();
		
		// Los multiplicamos a las coordenadas
		punto.coordenadaX *= multX;
		punto.coordenadaY *= multY;
		
	}
	
	/**
	 * Función que pide 2 numeros para dividir las coordenadas del punto recibido por parámetros
	 * 
	 * @param punto = Un punto introducido por el usuario
	 */
	public static void division (Punto punto) {
		
		// Pedimos los 2 numeros
		System.out.println("Introduzca un número para dividir a la coordenada X");
		int divX = sc.nextInt();
		
		System.out.println("Introduzca un número para dividir a la coordenada Y");
		int divY = sc.nextInt();
		
		// Se los dividimos a las coordenadas
		punto.coordenadaX /= divX;
		punto.coordenadaY /= divY;
	}
	
	/**
	 * Función que suma las coordenadas del punto 2 al punto 1 recibidos por parámetro
	 * 
	 * @param punto1 = Un punto introducido por el usuario
	 * @param punto2 = Un punto introducido por el usuario
	 */
	public static void sumarCoordenadas (Punto punto1, Punto punto2) {
		
		// Sumamos las coordenadas del punto 2 a las del punto 1
		punto1.coordenadaX += punto2.coordenadaX;
		punto1.coordenadaY += punto2.coordenadaY;

	}
	
	/**
	 * Función que compara las coordenadas de los 2 puntos recibidos por parámetro
	 *
	 * @param punto1 = Un punto introducido por el usuario
	 * @param punto2 = Un punto introducido por el usuario
	 */
	public static void compararCoordenadas (Punto punto1, Punto punto2) {
		
		// Vemos todas las opciones e indicamos cual es mayor segun estas
		if (punto1.coordenadaX > punto2.coordenadaX) {
			
			System.out.println("La coordenada X del punto 1 es mayor");
			
		} else if (punto2.coordenadaX > punto1.coordenadaX) {
			
			System.out.println("La coordenada X del punto 2 es mayor");
			
		} else {
			
			System.out.println("Ambas coordenadas X son iguales");
			
		}
		
		if (punto1.coordenadaY > punto2.coordenadaY) {
			
			System.out.println("La coordenada Y del punto 1 es mayor");
			
		} else if (punto2.coordenadaY > punto1.coordenadaY) {
			
			System.out.println("La coordenada Y del punto 2 es mayor");
			
		} else {
			
			System.out.println("Ambas coordenadas Y son iguales");
			
		}
		
	}
	
	/**
	 * Función que muestra las coordenadas de los 3 puntos
	 * 
	 * @param p1 = p1 del Main
	 * @param p2 = p2 del Main
	 * @param p3 = p3 del Main
	 */
	public static void mostrarPuntos(Punto p1, Punto p2, Punto p3) {
		
		// Mostramos las coordenadas de los 3 puntos
		System.out.println("Coordenadas del punto 1: (" + p1.coordenadaX + ", " + p1.coordenadaY + ")" );
		System.out.println("Coordenadas del punto 2: (" + p2.coordenadaX + ", " + p2.coordenadaY + ")" );
		System.out.println("Coordenadas del punto 3: (" + p3.coordenadaX + ", " + p3.coordenadaY + ")" );
		
	}

}
