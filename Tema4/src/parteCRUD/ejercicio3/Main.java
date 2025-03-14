package parteCRUD.ejercicio3;

import java.util.Scanner;

/**
 * Clase principal que maneja la interacción con el usuario para gestionar el sistema de pizzas.
 */
public class Main {

    /**
     * Método principal que maneja el flujo del programa.
     * Permite al usuario elegir entre diferentes opciones de gestión de pizzas.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pizza pizza = null;

        int codigo;
        String tamaño;
        String tipo;
        int opcion;

        do {
            // Presentación del menú al usuario
            System.out.println("Introduzca una opción:");
            System.out.println("1. Listado de pizzas");
            System.out.println("2. Nuevo pedido");
            System.out.println("3. Pizza servida");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Elección de la opción
            switch (opcion) {
                case 1 -> {
                    // Mostrar listado de pizzas
                    PizzaCRUD.listado();
                }

                case 2 -> {
                    // Crear nuevo pedido
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
                    // Marcar pizza como servida
                    System.out.println("Introduzca el código de la pizza");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    pizza = new Pizza(codigo, null, null);
                    if (PizzaCRUD.pizzaServida(pizza)) {
                        System.out.println("Pizza servida con exito");
                    } else {
                        System.out.println("Ha ocurrido algún error");
                    }
                }
            }

            System.out.println();

        } while (opcion != 4); // Continuar hasta que el usuario seleccione salir

        System.out.println("Saliendo del programa");
        
        sc.close();
    }

}

