package ejercicio4;

/**
 * Clase que contiene atributos como nombre, precio, iva y cantidad restante en
 * el almacén, al igual que un metodo para calcular el precio de venta al
 * publico
 */
public class Articulo {

	// Creamos todos los atributos del articulo:
	
	// Variable String donde guardamos el nombre
	private String nombre = "Default Name";
	
	// Variable double donde guardamos el precio
	private double precio = 0;
	
	// Constante double donde guardamos el IVA
	private final double IVA = 21;
	
	// Variable entera donde guardamos cuantos articulos quedan en el almacen
	private int cuantosQuedan;
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public double getPrecio() {
		
		return precio;
		
	}
	
	public double getIVA() {
		
		return IVA;
		
	}
	
	public int getCuantosQuedan() {
		
		return cuantosQuedan;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setPrecio(double precio) {
		
		this.precio = precio;
		
	}
	
	public void setCuantosQuedan(int cuantosQuedan) {
		
		this.cuantosQuedan = cuantosQuedan;
		
	}
	
	/**
	 * Constructor que verifica si los datos son correctos para introducirlos o no
	 * 
	 * @param nombre = nombre del articulo
	 * @param precio = precio del articulo
	 */
	Articulo(String nombre, double precio) {
		
		// Verifico si no está vacío para guardar el nombre introducido por parámetro
		if (!nombre.isEmpty()) {
			
			this.nombre = nombre;
			
		}
		
		// Verifico si el precio es mayor a 0 para guardar el precio introducido por parámetro
		if (precio > 0) {
			
			this.precio = precio;
			
		}
		
	}

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
