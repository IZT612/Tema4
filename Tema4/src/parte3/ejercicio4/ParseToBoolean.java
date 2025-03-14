package parte3.ejercicio4;

/**
 * Clase que proporciona métodos estáticos para convertir un número entero o una cadena
 * en un valor booleano.
 * 
 * @author Iván
 */
public class ParseToBoolean {

    /**
     * Convierte un número entero (1) en un valor booleano.
     * Si el número es 1, devuelve true de lo contrario, devuelve false
     * 
     * @param n El número entero a convertir. Debe ser 1 para devolver true
     * @return true si el número es 1, false en cualquier otro caso.
     */
    static public boolean parseToBoolean(int n) {
        boolean b = false;
        
        if (n == 1) {
            b = true;
        }
        
        return b;
    }
    
    /**
     * Convierte una cadena ("true") en un valor booleano.
     * Si la cadena es "true", devuelve true de lo contrario, devuelve false
     * 
     * @param cadena La cadena a convertir. Debe ser "true" para devolver true
     * @return true si la cadena es "true", false en cualquier otro caso.
     */
    static public boolean parseToBoolean(String cadena) {
        boolean b = false;
        
        if (cadena.equals("true")) {
            b = true;
        }
        
        return b;
    }
}

