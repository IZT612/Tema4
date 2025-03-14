package parteCRUD.ejercicio3;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase encargada de la gestión de las pizzas, como listado, nuevos pedidos y pizzas servidas.
 */
public class PizzaCRUD {

    // Conjunto para almacenar las pizzas, evitando duplicados.
    static private Set<Pizza> pizzas = new HashSet<Pizza>();

    /**
     * Muestra un listado de todas las pizzas almacenadas.
     */
    static public void listado() {
        // Itera y muestra las pizzas
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.toString());
        }
    }

    /**
     * Añade una nueva pizza al conjunto de pedidos.
     * 
     * @param objeto La pizza a añadir al conjunto.
     */
    static public void nuevoPedido(Pizza objeto) {
        pizzas.add(objeto);
    }

    /**
     * Marca una pizza como servida basándose en su código.
     * 
     * @param objeto La pizza que se desea marcar como servida.
     * @return true si la pizza fue encontrada y servida, false si no se encontró.
     */
    static public boolean pizzaServida(Pizza objeto) {
        boolean conseguido = false;

        // Buscar la pizza por código y actualizar su estado
        for (Pizza pizza : pizzas) {
            if (pizza.getCodigo() == objeto.getCodigo()) {
                pizza.setEstado("servida");
                conseguido = true;
            }
        }

        return conseguido;
    }
}
