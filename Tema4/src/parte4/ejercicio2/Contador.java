package parte4.ejercicio2;

/**
 * Clase que representa un contador con operaciones para incrementar, decrementar
 * y obtener o modificar su valor.
 * 
 * @author Iván
 */
public class Contador {

    private int cont;

    /**
     * Constructor de la clase Contador.
     * Inicializa el contador con el valor proporcionado, siempre que sea mayor o igual a 0.
     * 
     * @param cont El valor inicial del contador (debe ser mayor o igual a 0).
     */
    public Contador(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        }
    }

    /**
     * Obtiene el valor actual del contador.
     * 
     * @return El valor actual del contador.
     */
    public int getCont() {
        return this.cont;
    }

    /**
     * Establece un nuevo valor para el contador, siempre que sea mayor o igual a 0.
     * 
     * @param cont El nuevo valor para el contador (debe ser mayor o igual a 0).
     * @return true si el valor se estableció correctamente, false en caso contrario.
     */
    public boolean setCont(int cont) {
        boolean conseguido = false;

        if (cont >= 0) {
            this.cont = cont;
            conseguido = true;
        }

        return conseguido;
    }

    /**
     * Incrementa el valor del contador en 1.
     */
    public void incrementar() {
        this.cont++;
    }

    /**
     * Decrementa el valor del contador en 1, siempre que el contador no sea 0.
     */
    public void decrementar() {
        if (this.cont != 0) {
            this.cont--;
        }
    }

    /**
     * Devuelve el valor del contador en formato de cadena.
     * 
     * @return El valor del contador como una cadena.
     */
    @Override
    public String toString() {
        return Integer.toString(this.cont);
    }
}