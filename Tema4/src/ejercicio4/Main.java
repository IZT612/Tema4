package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos el nombre y precio del articulo
		String nombre;
		double precio;	
		
		// Pedimos los datos y los guardamos
		System.out.println("Introduzca un nombre para el artículo");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca un precio para el artículo");
		precio = sc.nextDouble();
		sc.nextLine();
		
		// Si hay algun dato incorrecto informamos al usuario
		if (nombre.isEmpty() || precio <= 0) {
			
			System.out.println("Alguno de los datos introducidos es incorrecto");
			System.out.println();
		}
		
		// Creamos el objeto articulo dado el nombre y precio introducidos
		Articulo articulo = new Articulo(nombre, precio);
		
		// Mostramos todos sus atributos
		System.out.println("Nombre del artículo: " + articulo.getNombre());
		System.out.println("Precio: " + articulo.getPrecio() + "€");
		System.out.println("IVA: " + articulo.getIVA() + "%");
		// El PVP lo obtenemos llamando a la función "precioPublico" de la clase "Articulo" dando nuestro articulo
		System.out.println("PVP: " + articulo.precioPublico(articulo));
		System.out.println();
		
		System.out.println("Probemos ahora a cambiar el nombre del artículo:");
		nombre = sc.nextLine();
		
		articulo.setNombre(nombre);
		System.out.println("Nombre del artículo: " + articulo.getNombre());
		
		
		sc.close();
	}

}
