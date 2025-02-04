package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		// Creamos los objetos p1, p2 y p3, que son puntos, obtenidos de la clase Punto, dandole las coordenadas con las que iniciars
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);
		
		// Mostramos las coordenadas de los 3 puntos
		System.out.println("Coordenadas del punto 1: (" + p1.coordenadaX + ", " + p1.coordenadaY + ")" );
		System.out.println("Coordenadas del punto 2: (" + p2.coordenadaX + ", " + p2.coordenadaY + ")" );
		System.out.println("Coordenadas del punto 3: (" + p3.coordenadaX + ", " + p3.coordenadaY + ")" );
		System.out.println();
		
		// Probamos operadores básicos con las coordenadas
		p1.coordenadaX += 2;
		p1.coordenadaY -= 2;
		
		p2.coordenadaX *= 5;
		p2.coordenadaY /= 5;
		
		p3.coordenadaX = (int) Math.sqrt(p3.coordenadaX);
		p3.coordenadaY %= 2;
		
		// Mostramos las coordenadas de los 3 puntos
		System.out.println("Coordenadas del punto 1: (" + p1.coordenadaX + ", " + p1.coordenadaY + ")" );
		System.out.println("Coordenadas del punto 2: (" + p2.coordenadaX + ", " + p2.coordenadaY + ")" );
		System.out.println("Coordenadas del punto 3: (" + p3.coordenadaX + ", " + p3.coordenadaY + ")" );
		
	}

}
