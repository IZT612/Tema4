package parte4.ejercicio4;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa permite al usuario trabajar con fracciones, realizando operaciones
 * como sumar, restar, multiplicar, dividir y simplificar.
 * 
 * @author Iván
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Solicita al usuario que introduzca una fracción y permite realizar
     * operaciones como cambiar el numerador o denominador, sumar, restar,
     * multiplicar, dividir y simplificar fracciones.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Fraccion fraccion;
        
        int numerador;
        int denominador;
        int opcion;
        
        // Solicita al usuario que introduzca el numerador y denominador de la fracción
        System.out.println("Introduzca el numerador de la fracción con la que trabajaremos.");
        numerador = sc.nextInt();
        sc.nextLine();
        System.out.println("Ahora el denominador.");
        denominador = sc.nextInt();
        sc.nextLine();
        
        fraccion = new Fraccion(numerador, denominador);
        
        // Menú de opciones para el usuario
        do {
            System.out.println("Introduzca una opción:");
            System.out.println("1. Mostrar fracción.");
            System.out.println("2. Cambiar el numerador.");
            System.out.println("3. Cambiar el denominador.");
            System.out.println("4. Sumar con otra fracción.");
            System.out.println("5. Restar con otra fracción.");
            System.out.println("6. Multiplicar con otra fracción.");
            System.out.println("7. Dividir con otra fracción.");
            System.out.println("8. Simplificar fracción.");
            System.out.println("9. Salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch (opcion) {
                case 1 -> {
                    // Muestra la fracción actual
                    System.out.println(fraccion);
                }
                
                case 2 -> {
                    // Cambia el numerador de la fracción
                    System.out.println("Introduzca el nuevo numerador.");
                    numerador = sc.nextInt();
                    sc.nextLine();
                    fraccion.setNumerador(numerador);
                }
                
                case 3 -> {
                    // Cambia el denominador de la fracción
                    System.out.println("Introduzca el nuevo denominador.");
                    denominador = sc.nextInt();
                    sc.nextLine();
                    fraccion.setDenominador(denominador);
                }
                
                case 4 -> {
                    // Suma la fracción actual con otra fracción
                    System.out.println("Introduzca el numerador de la nueva fracción.");
                    numerador = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ahora el denominador.");
                    denominador = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Resultado: " + fraccion.suma(new Fraccion(numerador, denominador)));
                }
                
                case 5 -> {
                    // Resta la fracción actual con otra fracción
                    System.out.println("Introduzca el numerador de la nueva fracción.");
                    numerador = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ahora el denominador.");
                    denominador = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Resultado: " + fraccion.resta(new Fraccion(numerador, denominador)));
                }
                
                case 6 -> {
                    // Multiplica la fracción actual con otra fracción
                    System.out.println("Introduzca el numerador de la nueva fracción.");
                    numerador = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ahora el denominador.");
                    denominador = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Resultado: " + fraccion.multiplica(new Fraccion(numerador, denominador)));
                }
                
                case 7 -> {
                    // Divide la fracción actual con otra fracción
                    System.out.println("Introduzca el numerador de la nueva fracción.");
                    numerador = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ahora el denominador.");
                    denominador = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Resultado: " + fraccion.divide(new Fraccion(numerador, denominador)));
                }
                
                case 8 -> {
                    // Simplifica la fracción actual
                    fraccion.simplifica();
                    System.out.println("Fracción simplificada.");
                }
            }
            
            System.out.println();
            
        } while (opcion != 9); // Sale del programa si el usuario elige la opción 9
        
        System.out.println("Saliendo del programa.");
        
        sc.close();
    }
}