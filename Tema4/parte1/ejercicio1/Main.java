package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
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
