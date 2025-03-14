package parte3.ejercicio6;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa permite al usuario probar diferentes funciones matemáticas,
 * como el sumatorio, la potencia y la serie de Fibonacci.
 * 
 * @author Iván
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Solicita al usuario que introduzca valores para probar las funciones
     * de sumatorio, potencia y serie de Fibonacci.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int a;
        
        // Prueba la función sumatorio
        System.out.println("Probemos el sumatorio, introduce un numero");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println(FuncionesMatematicas.sumatorio(numero));
        
        // Prueba la función potencia
        System.out.println("Probemos ahora la potencia, introduce el número y luego la potencia");
        a = sc.nextInt();
        sc.nextLine();
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println(FuncionesMatematicas.potencia(a, numero));
        
        // Prueba la función serie de Fibonacci
        System.out.println("Ahora probemos la serie de Fibonacci, introduce un número");
        numero = sc.nextInt();
        System.out.println(FuncionesMatematicas.serieFibonacci(numero));
        
        sc.close();
    }
}