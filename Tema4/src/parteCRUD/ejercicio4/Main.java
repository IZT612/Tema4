package parteCRUD.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Disco disco = null;
		
		int codigo;
		String autor;
		String titulo;
		int duracion;
		String genero;
		int opcion;
		
		do {
			
			System.out.println("Escoge una opción.");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Borrar disco");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
				case 1 -> {
					
					DiscoCRUD.listado();
					
				}
				
				case 2 -> {
					
					System.out.println("Introduzca el código");
					codigo = sc.nextInt();
					sc.nextLine();
					System.out.println("Introduzca el autor");
					autor = sc.nextLine();
					System.out.println("Introduzca el titulo");
					titulo = sc.nextLine();
					System.out.println();
					System.out.println("¿Quiere seguir introduciendo datos?");
					System.out.println("1. Sí");
					System.out.println("2. No");
					opcion = sc.nextInt();
					sc.nextLine();
					System.out.println();
					switch (opcion) {
					
						case 1 -> {
							
							System.out.println("Introduzca el género");
							genero = sc.nextLine();
							System.out.println("Introduzca la duración");
							duracion = sc.nextInt();
							sc.nextLine();
							
							disco = new Disco(codigo, autor, titulo, genero, duracion);
							
						}
						
						case 2 -> {
							
							disco = new Disco(codigo, autor, titulo);
							
						}
					
					}
					
					DiscoCRUD.crearDisco(disco);
					
				}
				
				case 3 -> {
					
					System.out.println("Introduzca el código del disco");
					codigo = sc.nextInt();
					sc.nextLine();
					disco = new Disco(codigo, null, null);
					if(DiscoCRUD.borrarDisco(disco)) {
						
						System.out.println("Se ha borrado correctamente");
						
					} else {
						
						System.out.println("Ha ocurrido algún error");
						
					}
					
				}
			
			}
			
			System.out.println();
			
		} while(opcion != 4);

		sc.close();
		
	}

}
