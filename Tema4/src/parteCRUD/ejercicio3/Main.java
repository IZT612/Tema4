package parteCRUD.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pizza pizza = null;
		
		int codigo;
		String tamaño;
		String tipo;
		int opcion;
		
		do {
			
			System.out.println("Introduzca una opción:");
			System.out.println("1. Listado de pizzas");
			System.out.println("2. Nuevo pedido");
			System.out.println("3. Pizza servida");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opcion) {
			
				case 1 -> {
					
					PizzaCRUD.listado();
					
				}
				
				case 2 -> {
					
					System.out.println("Introduzca el código de la pizza");
					codigo = sc.nextInt();
					sc.nextLine();
					System.out.println("Introduzca el tamaño de la pizza");
					tamaño = sc.nextLine();
					System.out.println("Y ahora el tipo");
					tipo = sc.nextLine();
					pizza = new Pizza(codigo, tamaño, tipo);
					PizzaCRUD.nuevoPedido(pizza);
					
				}
				
				case 3 -> {
					
					System.out.println("Introduzca el código de la pizza");
					codigo = sc.nextInt();
					sc.nextLine();
					pizza = new Pizza(codigo, null, null);
					if(PizzaCRUD.pizzaServida(pizza)) {
						
						System.out.println("Pizza servida con exito");
						
					} else {
						
						System.out.println("Ha ocurrido algún error");
						
					}
					
				}
				
			}
			
			System.out.println();
			
		} while (opcion != 4);
		
		System.out.println("Saliendo del programa");

	}

}
