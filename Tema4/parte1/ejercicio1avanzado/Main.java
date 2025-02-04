package ejercicio1avanzado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable entera para guardar la opcion que escoge el usuario
		int opcion;
		
		// Variables enteras para guardar los puntos que escoge el usuario según la funcion escogida
		int puntoId1;
		int puntoId2;
		
		// Creamos los objetos p1, p2 y p3, que son puntos, obtenidos de la clase Punto
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		// Les damos valores a las coordenadas de los puntos
		p1.coordenadaX = 5;
		p1.coordenadaY = 0;
		
		p2.coordenadaX = 10;
		p2.coordenadaY = 10;
		
		p3.coordenadaX = -3;
		p3.coordenadaY = 7;
		
		// Bucle do-while para mostrar un menú
		do {
			
			// Mostramos las opciones y recogemos la opcion escogida en "opcion"
			System.out.println("Introduzca una opción: ");
			System.out.println("1. Sumar números a las coordenadas de un punto.");
			System.out.println("2. Restar números a las coordenadas de un punto.");
			System.out.println("3. Multiplicar números a las coordenadas de un punto.");
			System.out.println("4. Dividir las coordenadas de un punto entre números.");
			System.out.println("5. Sumar las coordenadas de un punto con las de otro.");
			System.out.println("6. Comparar dos coordenadas.");
			System.out.println("7. Mostrar coordenadas.");
			System.out.println("8. Salir.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			// Hacemos un switch según "opcion"
			switch (opcion) {
			
			// Si es la 1, quiere sumar
			case 1 -> {
				
				// Pedimos el punto
				System.out.println("¿A las coordenadas de qué punto quieres sumar números?");
				puntoId1 = sc.nextInt();
				sc.nextLine();
				
				// Según el punto escogido llamamos la función con el indicado con este switch
				switch (puntoId1) {
				
				case 1 -> {
					
					Punto.suma(p1);
					
				} case 2 -> {
					
					Punto.suma(p2);
					
				} default -> {
					
					Punto.suma(p3);
					
				}
				
				}
				
			}
			
			// Si es la 2, quiere restar
			case 2 -> {
				
				// Pedimos el punto
				System.out.println("¿A las coordenadas de qué punto quieres restarle números?");
				puntoId1 = sc.nextInt();
				sc.nextLine();
				
				// Según el punto escogido llamamos la función con el indicado con este switch
				switch (puntoId1) {
				
				case 1 -> {
					
					Punto.resta(p1);
					
				} case 2 -> {
					
					Punto.resta(p2);
					
				} default -> {
					
					Punto.resta(p3);
					
				}
				
				}
				
			}
			
			// Si es la 3 quiere multiplicar
			case 3 -> {
				
				// Pedimos el punto
				System.out.println("¿A las coordenadas de qué punto quieres multiplicar números?");
				puntoId1 = sc.nextInt();
				sc.nextLine();
				
				// Según el punto escogido llamamos la función con el indicado con este switch
				switch (puntoId1) {
				
				case 1 -> {
					
					Punto.multiplicacion(p1);
					
				} case 2 -> {
					
					Punto.multiplicacion(p2);
					
				} default -> {
					
					Punto.multiplicacion(p3);
					
				}
				
				}
				
			}
			
			// Si es la 4 quiere dividir
			case 4 -> {
				
				// Pedimos el punto
				System.out.println("¿A las coordenadas de qué punto quieres dividirle números?");
				puntoId1 = sc.nextInt();
				sc.nextLine();
				
				// Según el punto escogido llamamos la función con el indicado con este switch
				switch (puntoId1) {
				
				case 1 -> {
					
					Punto.division(p1);
					
				} case 2 -> {
					
					Punto.division(p2);
					
				} default -> {
					
					Punto.division(p3);
					
				}
				
				}
				
			}
			
			// Si es la 5 quiere sumar 2 puntos
			case 5 -> {
				
				// Pedimos el primer punto
				System.out.println("¿A las coordenadas de qué punto quieres sumarle las de otro punto?");
				puntoId1 = sc.nextInt();
				sc.nextLine();
				
				// Pedimos el segundo punto
				System.out.println("¿Y las coordenadas de qué punto quiere usar para sumar al primero?");
				puntoId2 = sc.nextInt();
				sc.nextLine();
				
				// Damos a la función los parametros que correspondan según los puntos escogidos
				if (puntoId1 == 1 && puntoId2 == 1) {
					
					Punto.sumarCoordenadas(p1, p1);
					
				} else if (puntoId1 == 2 && puntoId2 == 1) {
					
					Punto.sumarCoordenadas(p2, p1);
					
				} else if (puntoId1 == 3 && puntoId2 == 1) {
					
					Punto.sumarCoordenadas(p3, p1);
					
				} else if (puntoId1 == 1 && puntoId2 == 2) {
					
					Punto.sumarCoordenadas(p1, p2);
					
				} else if (puntoId1 == 2 && puntoId2 == 2) {
					
					Punto.sumarCoordenadas(p2, p2);
					
				} else if (puntoId1 == 3 && puntoId2 == 2) {
					
					Punto.sumarCoordenadas(p3, p2);
					
				} else if (puntoId1 == 1 && puntoId2 == 3) {
					
					Punto.sumarCoordenadas(p1, p3);
					
				} else if (puntoId1 == 2 && puntoId2 == 3) {
					
					Punto.sumarCoordenadas(p2, p3);
					
				} else {
					
					Punto.sumarCoordenadas(p2, p1);
					
				}
				
				
			}
			
			// Si es la 6, quiere comparar
			case 6 -> {
				
				// Pedimos el punto 1
				System.out.println("¿Cuál es el primer punto que quiere comparar?");
				puntoId1 = sc.nextInt();
				sc.nextLine();
				
				// Pedimos el punto 2
				System.out.println("¿Y el segundo?");
				puntoId2 = sc.nextInt();
				sc.nextLine();
				
				// Damos a la función los parametros que correspondan según los puntos escogidos
				if (puntoId1 == 1 && puntoId2 == 1) {
					
					Punto.compararCoordenadas(p1, p1);
					
				} else if (puntoId1 == 2 && puntoId2 == 1) {
					
					Punto.compararCoordenadas(p2, p1);
					
				} else if (puntoId1 == 3 && puntoId2 == 1) {
					
					Punto.compararCoordenadas(p3, p1);
					
				} else if (puntoId1 == 1 && puntoId2 == 2) {
					
					Punto.compararCoordenadas(p1, p2);
					
				} else if (puntoId1 == 2 && puntoId2 == 2) {
					
					Punto.compararCoordenadas(p2, p2);
					
				} else if (puntoId1 == 3 && puntoId2 == 2) {
					
					Punto.compararCoordenadas(p3, p2);
					
				} else if (puntoId1 == 1 && puntoId2 == 3) {
					
					Punto.compararCoordenadas(p1, p3);
					
				} else if (puntoId1 == 2 && puntoId2 == 3) {
					
					Punto.compararCoordenadas(p2, p3);
					
				} else {
					
					Punto.compararCoordenadas(p2, p1);
					
				}
				
			}
			
			// Si es la 7, quiere ver los puntos
			case 7 -> {
				
				Punto.mostrarPuntos(p1, p2, p3);
				
			}
			
			
			}
			
			// Sale del bucle en cuanto escoja la opcion 8
		} while (opcion != 8);
		
		// Al finalizar el programa mostramos los puntos por ultima vez
		System.out.println("Saliendo del programa, los puntos quedan como: ");
		Punto.mostrarPuntos(p1, p2, p3);
		
		// Cerramos el scanner
		sc.close();
	}

}
