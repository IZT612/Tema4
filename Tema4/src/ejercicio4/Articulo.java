package ejercicio4;

/**
 * Clase que contiene atributos como nombre, precio, iva y cantidad restante en
 * el almacén, al igual que un metodo para calcular el precio de venta al
 * publico
 */
public class Articulo {

	// Creamos todos los atributos del articulo:
	
	// Variable String donde guardamos el nombre
	String nombre;
	
	// Variable double donde guardamos el precio
	double precio;
	
	// Constante double donde guardamos el IVA
	final double IVA = 21;
	
	// Variable entera donde guardamos cuantos articulos quedan en el almacen
	int cuantosQuedan;

	/**
	 * Función que obtiene un articulo como parametro y mediante su precio e IVA calcula el PVP y lo devuelve
	 * 
	 * @param articulo = el articulo del que se obtiene el precio e IVA para calcular el PVP
	 * @return devuelve el PVP
	 */
	public double precioPublico(Articulo articulo) {

		double PVP = 0;

		PVP = articulo.precio + ((articulo.IVA / 100) * articulo.precio);

		return PVP;
	}

}
