package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Le ponemos las coordenadas a "rectangulo1"
		int x1;
		int y1;
		int x2;
		int y2;
		
		// Pedimos las coordenadas y las vamos guardando
		System.out.println("Introduzca la coordenada x1");
		x1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca la coordenada y1");
		y1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca la coordenada x2");
		x2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca la coordenada y2");
		y2 = sc.nextInt();
		sc.nextLine();
		
		// Vemos si los datos son correctos para informar o no al usuario
		if (x1 <= 0 || y1 <= 0 || x2 <= 0 || y2 <= 0) {
			
			System.out.println("Alguna de las coordenadas es incorrecta");
			
		}
		
		// Creamos el objeto "rectangulo" dando las coordenadas
		Rectangulo rectangulo = new Rectangulo(x1, y1, x2, y2);
		
		// Mostramos el perimetro y area de cada uno, llamando a las funciones dandoles como perímetro el rectangulo que corresponde
		System.out.println("El perímetro del rectangulo es: " + rectangulo.getPerimetro());
		System.out.println("El área del rectangulo es: " + rectangulo.getArea());
		System.out.println();	
		
		System.out.println("Recordemos las coordenadas del rectangulo:");
		System.out.println(rectangulo.toString());
		System.out.println();
		System.out.println("Probemos a cambiar ahora la coordenada x1:");
		x1 = sc.nextInt();
		sc.nextLine();
		rectangulo.setX1(x1);
		
		System.out.println("Nuevas coordenadas:");
		System.out.println(rectangulo.toString());
		System.out.println();
		System.out.println("Probemos a cambiar las 2 primeras coordenadas en un solo método:");
		x1 = sc.nextInt();
		sc.nextLine();
		y1 = sc.nextInt();
		sc.nextLine();
		rectangulo.setX1Y1(x1, y1);
		System.out.println("Nuevas coordenadas:");
		System.out.println(rectangulo.toString());
		System.out.println();
		System.out.println("Por último cambiemos todas a la vez");
		x1 = sc.nextInt();
		sc.nextLine();
		y1 = sc.nextInt();
		sc.nextLine();		
		x2 = sc.nextInt();
		sc.nextLine();
		y2 = sc.nextInt();
		sc.nextLine();
		rectangulo.setAll(x1, y1, x2, y2);
		System.out.println("Nuevas coordenadas:");
		System.out.println(rectangulo.toString());
		
		// Cerramos el scanner
		sc.close();
	}

}
