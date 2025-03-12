package parte4.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CuentaCorriente cuenta = null;

		String nombre;
		String dni;
		double saldo;
		String nacionalidad;
		int opcion;

		do {

			System.out.println("Escoja una opción:");
			System.out.println("1. Mostrar lista.");
			System.out.println("2. Crear nueva cuenta.");
			System.out.println("3. Eliminar cuenta.");
			System.out.println("4. Actualizar cuenta.");
			System.out.println("5. Ver cuenta específica.");
			System.out.println("6. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opcion) {

			case 1 -> {

				CuentaCorrienteCRUD.mostrarLista();

			}

			case 2 -> {

				System.out.println("Introduzca un DNI");
				dni = sc.nextLine();

				System.out.println("Introduzca un nombre");
				nombre = sc.nextLine();
				System.out.println("Introduzca un saldo");
				saldo = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduzca una nacionalidad");
				nacionalidad = sc.nextLine();
				cuenta = new CuentaCorriente(dni, nombre, saldo, nacionalidad);
				CuentaCorrienteCRUD.añadirCuenta(cuenta);
				System.out.println("Se ha añadido la cuenta correctamente.");

			}

			case 3 -> {

				System.out.println("Introduzca un DNI");
				dni = sc.nextLine();
				cuenta = new CuentaCorriente(dni);
				CuentaCorrienteCRUD.eliminarCuenta(cuenta);

			}

			case 4 -> {
				
				System.out.println("Introduzca el dni de la cuenta a actualizar.");
				dni = sc.nextLine();
				cuenta = new CuentaCorriente(dni);
				cuenta = CuentaCorrienteCRUD.devolverCuenta(cuenta);

				do {

					System.out.println();

					System.out.println("Escoja una opción:");
					System.out.println("1. Cambiar nombre.");
					System.out.println("2. Cambiar saldo.");
					System.out.println("3. Cambiar nacionalidad.");
					System.out.println("4. Salir del menú de actualización.");
					opcion = sc.nextInt();
					sc.nextLine();
					System.out.println();

					switch (opcion) {

					case 1 -> {

						System.out.println("Introduzca el nuevo nombre.");
						nombre = sc.nextLine();
						cuenta.setNombre(nombre);

					}

					case 2 -> {

						System.out.println("Introduzca el nuevo saldo.");
						saldo = sc.nextDouble();
						sc.nextLine();
						cuenta.setSaldo(saldo);
							
					}

					case 3 -> {

						System.out.println("Introduzca la nueva nacionalidad.");
						nacionalidad = sc.nextLine().toLowerCase();
						cuenta.setNacionalidad(nacionalidad);

					}

					}

				} while (opcion != 4);

				CuentaCorrienteCRUD.actualizarCuenta(cuenta);

			}

			case 5 -> {

				System.out.println("Introduzca el DNI de la cuenta a mostrar.");
				dni = sc.nextLine();
				cuenta = new CuentaCorriente(dni);
				CuentaCorrienteCRUD.verCuenta(cuenta);

			}

			}

			System.out.println();

		} while (opcion != 6);

		System.out.println("Saliendo del programa.");

		sc.close();

	}

}
