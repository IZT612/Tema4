package parteCRUD.ejercicio4;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase encargada de gestionar los discos, como listado, creación y eliminación.
 */
public class DiscoCRUD {

    // Conjunto para almacenar los discos, evitando duplicados.
    private static Set<Disco> discos = new HashSet<Disco>();

    /**
     * Muestra un listado de todos los discos almacenados.
     */
    static public void listado() {
        // Iterar y mostrar los discos
        for (Disco disco : discos) {
            System.out.println(disco);
        }
    }

    /**
     * Añade un nuevo disco a la base de datos de discos.
     *
     * @param objeto El disco que se va a añadir.
     */
    static public void crearDisco(Disco objeto) {
        discos.add(objeto);
    }

    /**
     * Borra un disco basado en su código.
     *
     * @param objeto El disco que se desea borrar.
     * @return true si el disco fue encontrado y eliminado, false en caso contrario.
     */
    static public boolean borrarDisco(Disco objeto) {
        boolean conseguido = false;

        // Buscar el disco por su código
        for (Disco disco : discos) {
            if (objeto.getCodigo() == disco.getCodigo()) {
                objeto = disco; // Establecer el disco que coincide
            }
        }

        // Intentar eliminar el disco
        if (discos.remove(objeto)) {
            conseguido = true;
        }

        return conseguido;
    }
}
