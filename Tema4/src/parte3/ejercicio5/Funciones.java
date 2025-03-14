package parte3.ejercicio5;

import java.util.Random;

/**
 * Clase que proporciona métodos estáticos para generar números aleatorios en diferentes rangos.
 * 
 * @author Iván
 */
public class Funciones {
    
    static Random rand = new Random();
    
    /**
     * Genera una cantidad específica de números aleatorios entre 0 y 1.
     * 
     * @param cantidad La cantidad de números aleatorios a generar.
     */
    static public void numerosAleatorios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(rand.nextDouble(0, 1) + " ");
        }
    }
    
    /**
     * Genera una cantidad específica de números aleatorios entre 0 y un máximo especificado.
     * 
     * @param cantidad La cantidad de números aleatorios a generar.
     * @param maximo El valor máximo (inclusive) para los números aleatorios.
     */
    static public void numerosAleatorios(int cantidad, int maximo) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(rand.nextInt(0, maximo + 1) + " ");
        }
    }
    
    /**
     * Genera una cantidad específica de números aleatorios entre un mínimo y un máximo especificados.
     * 
     * @param cantidad La cantidad de números aleatorios a generar.
     * @param minimo El valor mínimo (inclusive) para los números aleatorios.
     * @param maximo El valor máximo (inclusive) para los números aleatorios.
     */
    static public void numerosAleatorios(int cantidad, int minimo, int maximo) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(rand.nextInt(minimo, maximo + 1) + " ");
        }
    }
}
