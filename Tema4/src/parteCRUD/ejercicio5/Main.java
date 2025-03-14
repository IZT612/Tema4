package parteCRUD.ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Declaramos una variable para almacenar la cuenta corriente
        CuentaCorriente cuenta = null;

        // Variables para capturar la información de la cuenta
        String nombre;
        String dni;
        double saldo;
        String nacionalidad;
        int opcion;

        // Menú de opciones para interactuar con las cuentas corrientes
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

            // Controlamos las opciones a elegir
            switch (opcion) {

                case 1 -> {
                    // Mostrar todas las cuentas existentes
                    CuentaCorrienteCRUD.mostrarLista();
                }

                case 2 -> {
                    // Crear una nueva cuenta
                    System.out.println("Introduzca un DNI");
                    dni = sc.nextLine();

                    System.out.println("Introduzca un nombre");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca un saldo");
                    saldo = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Introduzca una nacionalidad");
                    nacionalidad = sc.nextLine();
                    // Creamos la nueva cuenta con los datos introducidos
                    cuenta = new CuentaCorriente(dni, nombre, saldo, nacionalidad);
                    // Añadimos la nueva cuenta al conjunto de cuentas
                    CuentaCorrienteCRUD.añadirCuenta(cuenta);
                    System.out.println("Se ha añadido la cuenta correctamente.");
                }

                case 3 -> {
                    // Eliminar una cuenta por su DNI
                    System.out.println("Introduzca un DNI");
                    dni = sc.nextLine();
                    cuenta = new CuentaCorriente(dni);
                    // Eliminamos la cuenta con el DNI proporcionado
                    CuentaCorrienteCRUD.eliminarCuenta(cuenta);
                }

                case 4 -> {
                    // Actualizar la cuenta de una persona por su DNI
                    System.out.println("Introduzca el dni de la cuenta a actualizar.");
                    dni = sc.nextLine();
                    cuenta = new CuentaCorriente(dni);
                    // Buscamos la cuenta con el DNI y la devolvemos
                    cuenta = CuentaCorrienteCRUD.devolverCuenta(cuenta);

                    // Menú para elegir qué datos se actualizarán
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

                        // Opciones para actualizar la cuenta
                        switch (opcion) {

                            case 1 -> {
                                // Cambiar el nombre de la cuenta
                                System.out.println("Introduzca el nuevo nombre.");
                                nombre = sc.nextLine();
                                cuenta.setNombre(nombre);
                            }

                            case 2 -> {
                                // Cambiar el saldo de la cuenta
                                System.out.println("Introduzca el nuevo saldo.");
                                saldo = sc.nextDouble();
                                sc.nextLine();
                                cuenta.setSaldo(saldo);
                            }

                            case 3 -> {
                                // Cambiar la nacionalidad de la cuenta
                                System.out.println("Introduzca la nueva nacionalidad.");
                                nacionalidad = sc.nextLine().toLowerCase();
                                cuenta.setNacionalidad(nacionalidad);
                            }
                        }

                    } while (opcion != 4);

                    // Actualizamos la cuenta en el conjunto
                    CuentaCorrienteCRUD.actualizarCuenta(cuenta);
                }

                case 5 -> {
                    // Ver información de una cuenta específica por su DNI
                    System.out.println("Introduzca el DNI de la cuenta a mostrar.");
                    dni = sc.nextLine();
                    cuenta = new CuentaCorriente(dni);
                    // Mostramos la cuenta con el DNI proporcionado
                    CuentaCorrienteCRUD.verCuenta(cuenta);
                }

            }

            System.out.println();

        } while (opcion != 6);

        // Mensaje de salida del programa
        System.out.println("Saliendo del programa.");

        // Cerramos el scanner al finalizar
        sc.close();

    }

}
