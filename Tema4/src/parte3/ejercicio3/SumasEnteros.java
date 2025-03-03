package parte3.ejercicio3;

/**
 * La clase SumasEnteros proporciona un método para calcular la suma de los 
 * numeros comenzando desde el 1 hasta el número introducido por el usuario.
 */
public class SumasEnteros {

    /**
     * Calcula la suma de los primeros números enteros de manera recursiva.
     * Utiliza la fórmula: sum(n) = n + sum(n-1), con el caso base de n = 1.
     *
     * @param n = el número hasta el cual se desea calcular la suma
     * @return la suma de los números enteros hasta n
     */
    static public int sumaEnteros(int n) {
        int resultado = 0;

        if (n != 1) {
            resultado = (n + SumasEnteros.sumaEnteros(n - 1)); // Llamada recursiva
        } else {
            resultado += 1; // Caso base: cuando n es 1
        }

        return resultado;
    }
}
