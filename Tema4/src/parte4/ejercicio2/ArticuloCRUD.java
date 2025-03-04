package parte4.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class ArticuloCRUD {

	private static Set<Articulo> articulos = new HashSet<Articulo>();

	static public void alta(Articulo objeto) {

		articulos.add(objeto);

	}

	static public void listado() {

		for (Articulo articulo : articulos) {

			System.out.println(articulo.toString());

		}

	}

	static public void baja(Articulo objeto) {

		for (Articulo articulo : articulos) {

			if (objeto.getNombre().equals(articulo.getNombre())) {

				articulos.remove(articulo);

			}

		}

	}

	static public void modificacion(Articulo objeto) {

		for (Articulo articulo : articulos) {

			if (objeto.getNombre().equals(articulo.getNombre())) {

				articulo.setPrecio(objeto.getPrecio());

			}

		}

	}

	static public void entradaMercancia(Articulo objeto) {

		for (Articulo articulo : articulos) {

			if (objeto.getNombre().equals(articulo.getNombre())) {

				articulo.setCantidad(articulo.getCantidad() + objeto.getCantidad());

			}

		}

	}

	static public boolean salidaMercancia(Articulo objeto) {
		
		boolean conseguido = false;

		for (Articulo articulo : articulos) {

			if (objeto.getNombre().equals(articulo.getNombre())) {

				if (objeto.getCantidad() <= articulo.getCantidad()) {

					articulo.setCantidad(articulo.getCantidad() - objeto.getCantidad());
					conseguido = true;

				}

			}

		}
		
		return conseguido;

	}

}
