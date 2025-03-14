package parte3.ejercicio6;

import parte3.ejercicio3.SumasEnteros;

/**
 * Clase que proporciona métodos estáticos para realizar operaciones matemáticas,
 * como el sumatorio, la potencia y la serie de Fibonacci.
 * 
 * @author Iván
 */
public class FuncionesMatematicas {

    /**
     * Calcula el sumatorio de un número de forma recursiva.
     * 
     * @param numero El número para el cual se calculará el sumatorio.
     * @return El resultado del sumatorio.
     */
    static public int sumatorio(int numero) {
        int resultado = 0;

        if (numero != 1) {
            resultado = (numero + SumasEnteros.sumaEnteros(numero - 1)); // Llamada recursiva
        } else {
            resultado += 1; // Caso base: cuando n es 1
        }

        return resultado;
    }
    
    /**
     * Calcula la potencia de un número de forma recursiva.
     * 
     * @param a La base de la potencia.
     * @param n El exponente de la potencia.
     * @return El resultado de elevar 'a' a la potencia 'n'.
     */
    static public double potencia(double a, int n) {
        double resultado = 0;
        
        if (n != 0) {
            resultado = a * FuncionesMatematicas.potencia(a, n - 1);
        } else {
            resultado = 1;
        }
        
        return resultado;
    }
    
    /**
     * Calcula el valor de la serie de Fibonacci para un número dado de forma recursiva.
     * 
     * @param numero El número para el cual se calculará la serie de Fibonacci.
     * @return El valor de la serie de Fibonacci para el número dado.
     */
    static public int serieFibonacci(int numero) {
        int resultado = 0;
        
        if (numero == 0 || numero == 1) {
            resultado = 1;
        } else {
            resultado = FuncionesMatematicas.serieFibonacci(numero - 1) + FuncionesMatematicas.serieFibonacci(numero - 2);
        }
        
        return resultado;
    }
}
