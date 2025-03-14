package parteCRUD.ejercicio2;

/**
 * Clase que representa un artículo en el sistema. Contiene información sobre su
 * nombre, precio, cantidad en almacén y el IVA aplicable.
 * 
 * @author Iván
 */
public class Articulo {

	private String nombre; // Nombre del artículo
	private double precio = 0; // Precio del artículo
	private final double IVA = 21; // IVA aplicado
	private int cantidad; // Cantidad en almacén

	/**
	 * Constructor para crear un artículo con nombre y precio.
	 * 
	 * @param nombre Nombre del artículo.
	 * @param precio Precio del artículo.
	 */
	public Articulo(String nombre, double precio) {
		if (!nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Constructor para crear un artículo con solo el nombre.
	 * 
	 * @param nombre Nombre del artículo.
	 */
	public Articulo(String nombre) {
		if (!nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Constructor para crear un artículo con nombre y cantidad.
	 * 
	 * @param nombre   Nombre del artículo.
	 * @param cantidad Cantidad del artículo en el almacén.
	 */
	public Articulo(String nombre, int cantidad) {
		if (!nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (cantidad > 0) {
			this.cantidad = cantidad;
		}
	}

	// Métodos getter y setter
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
	 * Calcula el precio de venta al público (PVP) incluyendo el IVA.
	 * 
	 * @return Precio con IVA incluido.
	 */
	public double getPVP() {
		return this.precio + ((this.IVA / 100) * this.precio);
	}

	/**
	 * Calcula el precio con descuento aplicado.
	 * 
	 * @param descuento Porcentaje de descuento.
	 * @return Precio con descuento aplicado.
	 */
	public double getPVPDescuento(int descuento) {
		return this.getPVP() - (this.getPVP() * (descuento / 100.0));
	}

	public String toString() {
		return ("Nombre: " + this.nombre + ". Precio: " + this.precio + ". IVA: " + this.IVA + ". Restantes: "
				+ this.cantidad + ".");
	}
}
