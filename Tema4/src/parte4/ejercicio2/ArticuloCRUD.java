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

	static public boolean baja(Articulo objeto) {
		
		boolean conseguido = false;
		
		for (Articulo articulo : articulos) {
			
			if (articulo.getNombre().equals(objeto.getNombre())) {
				
				objeto = articulo;
				
			}
			
		}
		
		if (articulos.remove(objeto)) {
			
			conseguido = true;
			
		}

		return conseguido;
		
	}

	static public boolean modificacion(Articulo objeto) {
		
		boolean conseguido = false;

		for (Articulo articulo : articulos) {

			if (objeto.getPrecio() > 0 && objeto.getNombre().equals(articulo.getNombre())) {

				articulo.setPrecio(objeto.getPrecio());
				conseguido = true;

			}

		}
		
		return conseguido;

	}

	static public boolean entradaMercancia(Articulo objeto) {
		
		boolean conseguido = false;

		for (Articulo articulo : articulos) {

			if (objeto.getNombre().equals(articulo.getNombre())) {

				articulo.setCantidad(articulo.getCantidad() + objeto.getCantidad());
				conseguido = true;

			}

		}

		return conseguido;
		
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
