package parte2.ejercicio4;

import java.util.Scanner;

/**
 * Clase principal que permite la creación y comparación de pizzas.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * Permite al usuario ingresar datos para crear y comparar dos pizzas.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        String tamaño;
        String tipo;
        String estado;
        
        // Creación de la primera pizza
        System.out.println("Probemos a crear una pizza... Introduzca el código:");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ahora su tamaño:");
        tamaño = sc.nextLine().toLowerCase();
        System.out.println("Y por último su tipo:");
        tipo = sc.nextLine().toLowerCase().trim();
        
        Pizza pizza1 = new Pizza(codigo, tamaño, tipo);
        
        // Definir estado de la pizza
        System.out.println("\n¿La pizza está pedida o servida?");
        estado = sc.nextLine().toLowerCase();
        pizza1.setEstado(estado);
        System.out.println("Verificación, este es el estado actual de la pizza:");
        System.out.println(pizza1.getEstado());
        
        // Mostrar información de la primera pizza
        System.out.println("\nVeamos todos los datos de la pizza:");
        System.out.println(pizza1.toString());
        
        // Creación de la segunda pizza
        System.out.println("\nBien, ahora creemos otra más para poder compararlas.");
        System.out.println("Introduzca el código:");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ahora su tamaño:");
        tamaño = sc.nextLine().toLowerCase();
        System.out.println("Y por último su tipo:");
        tipo = sc.nextLine().toLowerCase().trim();
        
        Pizza pizza2 = new Pizza(codigo, tamaño, tipo);
        
        // Comparación de pizzas
        System.out.println("\nHora de compararlas:");
        if (pizza1.equals(pizza2)) {
            System.out.println("Ambas pizzas son la misma");
        } else {
            System.out.println("Son distintas pizzas");
        }
        
        sc.close();
    }
}