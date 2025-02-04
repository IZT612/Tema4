package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		// Creamos los dos rectangulos
		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();
		
		// Le ponemos las coordenadas a "rectangulo1"
		rectangulo1.x1 = 0;
		rectangulo1.y1 = 0;
		rectangulo1.x2 = 5;
		rectangulo1.y2 = 5;
		
		// Le ponemos las coordenadas a "rectangulo2"
		rectangulo2.x1 = 7;
		rectangulo2.y1 = 9;
		rectangulo2.x2 = 2;
		rectangulo2.y2 = 3;
		
		// Mostramos el perimetro y area de cada uno, llamando a las funciones dandoles como perímetro el rectangulo que corresponde
		System.out.println("El perímetro del rectangulo 1 es: " + Rectangulo.perimetro(rectangulo1));
		System.out.println("El área del rectangulo 1 es: " + Rectangulo.area(rectangulo1));
		System.out.println();		
		System.out.println("El perímetro del rectangulo 2 es: " + Rectangulo.perimetro(rectangulo2));
		System.out.println("El área del rectangulo 2 es: " + Rectangulo.area(rectangulo2));
		System.out.println();
		
		// Cambiamos las coordenadas de "rectangulo1"
		rectangulo1.x1 = -2;
		rectangulo1.y1 = 9;
		rectangulo1.x2 = 2;
		rectangulo1.y2 = 8;
		
		// Cambiamos las coordenadas de "rectangulo2"
		rectangulo2.x1 = 0;
		rectangulo2.y1 = 1;
		rectangulo2.x2 = 8;
		rectangulo2.y2 = -4;
		
		// Volvemos a mostrar los perimetros y areas
		System.out.println("El perímetro del rectangulo 1 ahora es: " + Rectangulo.perimetro(rectangulo1));
		System.out.println("El área del rectangulo 1 ahora es: " + Rectangulo.area(rectangulo1));
		System.out.println();		
		System.out.println("El perímetro del rectangulo 2 ahora es: " + Rectangulo.perimetro(rectangulo2));
		System.out.println("El área del rectangulo 2 ahora es: " + Rectangulo.area(rectangulo2));
	}

}
