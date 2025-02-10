package parte1.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos el nombre y precio del articulo
		String nombre;
		double precio;	
		int descuento;
		int cantidad;
		
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
		System.out.println(articulo.toString());
		// El PVP lo obtenemos llamando a la función "precioPublico" de la clase "Articulo" dando nuestro articulo
		System.out.println("PVP: " + articulo.getPVP());
		System.out.println();
		
		System.out.println("Probemos ahora a cambiar el nombre del artículo:");
		nombre = sc.nextLine();
		
		articulo.setNombre(nombre);
		System.out.println("Nombre del artículo: " + articulo.getNombre());
		System.out.println();
		System.out.println("Introduzca el porcentaje de un descuento para obtener el nuevo precio del articulo");
		descuento = sc.nextInt();
		sc.nextLine();
		System.out.println(articulo.getPVPDescuento(descuento));
		
		System.out.println("¿Cuánta cantidad del artículo intenta vender?");
		cantidad =  sc.nextInt();
		sc.nextLine();
		System.out.println(articulo.vender(cantidad));
		System.out.println();
		System.out.println("¿Y cuánto intenta almacenar?");
		cantidad =  sc.nextInt();
		sc.nextLine();
		articulo.almacenar(cantidad);
		System.out.println();
		
		
		sc.close();
	}

}
