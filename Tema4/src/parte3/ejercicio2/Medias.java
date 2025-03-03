package parte3.ejercicio2;

/**
 * La clase Medias proporciona métodos para calcular la media aritmética 
 * de dos o tres números enteros.
 */
public class Medias {

    /**
     * Calcula la media aritmética de dos números enteros.
     *
     * @param n1 el primer número entero
     * @param n2 el segundo número entero
     * @return la media aritmética de los dos números
     */
    static public double media(int n1, int n2) {
        return (double) (n1 + n2) / 2;
    }

    /**
     * Calcula la media aritmética de tres números enteros.
     *
     * @param n1 el primer número entero
     * @param n2 el segundo número entero
     * @param n3 el tercer número entero
     * @return la media aritmética de los tres números
     */
    static public double media(int n1, int n2, int n3) {
        return (double) (n1 + n2 + n3) / 3;
    }

}
