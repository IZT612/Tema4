package parteCRUD.ejercicio2;

public class Articulo {

	// Creamos todos los atributos del articulo:
	
	// Variable String donde guardamos el nombre
	private String nombre;
	
	// Variable double donde guardamos el precio
	private double precio = 0;
	
	// Constante double donde guardamos el IVA
	private final double IVA = 21;
	
	// Variable entera donde guardamos cuantos articulos quedan en el almacen
	private int cantidad;
	
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
	
	Articulo(String nombre) {
		
		// Verifico si no está vacío para guardar el nombre introducido por parámetro
		if (!nombre.isEmpty()) {
			
			this.nombre = nombre;
			
		}
		
	}
	
	Articulo(String nombre, int cantidad) {
		
		// Verifico si no está vacío para guardar el nombre introducido por parámetro
		if (!nombre.isEmpty()) {
			
			this.nombre = nombre;
			
		}
		
		// Verifico si el precio es mayor a 0 para guardar el precio introducido por parámetro
		if (cantidad > 0) {
			
			this.cantidad = cantidad;
			
		}
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public double getPrecio() {
		
		return precio;
		
	}
	
	public double getIVA() {
		
		return IVA;
		
	}
	
	public int getCantidad() {
		
		return cantidad;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setPrecio(double precio) {
		
		this.precio = precio;
		
	}
	
	public void setCantidad(int cantidad) {
		
		this.cantidad = cantidad;
		
	}
	
	/**
	 * Función que obtiene un articulo como parametro y mediante su precio e IVA calcula el PVP y lo devuelve
	 * 
	 * @param articulo = el articulo del que se obtiene el precio e IVA para calcular el PVP
	 * @return devuelve el PVP
	 */
	public double getPVP() {

		double PVP = 0;

		PVP = this.precio + ((this.IVA / 100) * this.precio);

		return PVP;
	}
	
	public double getPVPDescuento(int descuento) {
		
		double PVP = 0;
		
		PVP = this.getPVP() - (this.getPVP() * (descuento / 100));
		
		return PVP;
	}
	
	public String toString() {
		
		return ("Nombre: " + this.nombre + ". Precio: " + this.precio + ". IVA: " + this.IVA + ". Restantes: " + this.cantidad + ".");
		
	}

}
