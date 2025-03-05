package parte4.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Articulo articulo = null;
		char opcion = 0;
		String nombre;
		double precio;
		int cantidad;
		
		do {
			
			System.out.println("Escoge una opción:");
			System.out.println("a. Mostrar listado");
			System.out.println("b. Dar de alta");
			System.out.println("c. Dar de baja");
			System.out.println("d. Modificar el precio");
			System.out.println("e. Entrada de mercancía");
			System.out.println("f. Salida de mercancía");
			System.out.println("g. Salir");
			opcion = sc.nextLine().charAt(0);
			System.out.println();
			
			switch (opcion) {
			
				case 'a' -> {
					
					ArticuloCRUD.listado();
					
				}
				
				case 'b' -> {
					
					System.out.println("Introduzca el nombre del artículo.");
					nombre = sc.nextLine();
					System.out.println("Ahora el precio.");
					precio = sc.nextDouble();
					sc.nextLine();
					articulo = new Articulo(nombre, precio);
					ArticuloCRUD.alta(articulo);
					
				}
				
				case 'c' -> {
					
					System.out.println("Introduzca el nombre del artículo a eliminar.");
					nombre = sc.nextLine();
					articulo = new Articulo(nombre);
					if (ArticuloCRUD.baja(articulo)) {
						
						System.out.println("Se ha eliminado el artículo correctamente.");
						
					} else {
						
						System.out.println("La acción no se ha completado por algún error.");
						
					}
					
				}
				
				case 'd' -> {
					
					System.out.println("Introduzca el nombre del artículo a modificar.");
					nombre = sc.nextLine();
					System.out.println("Y el nuevo precio a introducir.");
					precio = sc.nextDouble();
					sc.nextLine();
					articulo = new Articulo(nombre, precio);
					
					if (ArticuloCRUD.modificacion(articulo)) {
						
						System.out.println("Se ha modificado el precio del artículo correctamente.");
						
					} else {
						
						System.out.println("La acción no se ha completado por algún error.");
						
					}
					
				}
				
				case 'e' -> {
					
					System.out.println("Introduzca el nombre del artículo del que han llegado más existencias.");
					nombre = sc.nextLine();
					System.out.println("Y la cantidad de artículos que han llegado.");
					cantidad = sc.nextInt();
					sc.nextLine();
					articulo = new Articulo(nombre, cantidad);
					
					if (ArticuloCRUD.entradaMercancia(articulo)) {
						
						System.out.println("Se ha llevado a cabo correctamente.");
						
					} else {
						
						System.out.println("La acción no se ha completado por algún error.");
						
					}
					
				}
				
				case 'f' -> {
					
					System.out.println("Introduzca el nombre del artículo del que han salido existencias.");
					nombre = sc.nextLine();
					System.out.println("Y la cantidad de artículos que han salido.");
					cantidad = sc.nextInt();
					sc.nextLine();
					articulo = new Articulo(nombre, cantidad);
					
					if (ArticuloCRUD.salidaMercancia(articulo)) {
						
						System.out.println("Se ha llevado a cabo correctamente.");
						
					} else {
						
						System.out.println("La acción no se ha completado por algún error.");
						
					}
					
				}
			
			}
			
			System.out.println();
			
		} while (opcion != 'g');
		
		System.out.println("Saliendo del programa");
		
		sc.close();
		
	}

}
