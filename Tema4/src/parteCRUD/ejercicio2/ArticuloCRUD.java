package parteCRUD.ejercicio2;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que maneja las operaciones CRUD de los artículos.
 * Permite agregar, listar, eliminar y modificar artículos, así como 
 * gestionar la entrada y salida de mercancía en el inventario.
 * 
 * @author Iván
 */
public class ArticuloCRUD {

    private static Set<Articulo> articulos = new HashSet<>();

    /**
     * Añade un nuevo artículo al inventario.
     * 
     * @param objeto El artículo a dar de alta.
     */
    public static void alta(Articulo objeto) {
        articulos.add(objeto);
    }

    /**
     * Muestra un listado de todos los artículos registrados.
     */
    public static void listado() {
        for (Articulo articulo : articulos) {
            System.out.println(articulo.toString());
        }
    }

    /**
     * Elimina un artículo del inventario si existe.
     * 
     * @param objeto El artículo a eliminar.
     * @return true si el artículo se eliminó correctamente, false si no se encontró.
     */
    public static boolean baja(Articulo objeto) {
        return articulos.removeIf(articulo -> articulo.getNombre().equals(objeto.getNombre()));
    }

    /**
     * Modifica el precio de un artículo si se encuentra en el inventario.
     * 
     * @param objeto El artículo con el nuevo precio.
     * @return true si se modificó correctamente, false si no se encontró o el precio no es válido.
     */
    public static boolean modificacion(Articulo objeto) {
        for (Articulo articulo : articulos) {
            if (objeto.getPrecio() > 0 && objeto.getNombre().equals(articulo.getNombre())) {
                articulo.setPrecio(objeto.getPrecio());
                return true;
            }
        }
        return false;
    }

    /**
     * Añade más unidades de un artículo al inventario.
     * 
     * @param objeto El artículo con la cantidad a sumar.
     * @return true si se actualizó correctamente, false si el artículo no existe.
     */
    public static boolean entradaMercancia(Articulo objeto) {
        for (Articulo articulo : articulos) {
            if (objeto.getNombre().equals(articulo.getNombre())) {
                articulo.setCantidad(articulo.getCantidad() + objeto.getCantidad());
                return true;
            }
        }
        return false;
    }

    /**
     * Reduce la cantidad de unidades de un artículo en el inventario.
     * 
     * @param objeto El artículo con la cantidad a restar.
     * @return true si la operación fue exitosa, false si el artículo no existe o no hay suficiente stock.
     */
    public static boolean salidaMercancia(Articulo objeto) {
        for (Articulo articulo : articulos) {
            if (objeto.getNombre().equals(articulo.getNombre()) && objeto.getCantidad() <= articulo.getCantidad()) {
                articulo.setCantidad(articulo.getCantidad() - objeto.getCantidad());
                return true;
            }
        }
        return false;
    }
}

