package parte1.ejercicio2;

/**
 * Clase persona con atributos dni, nombre, apellidos y edad
 */
public class Persona {

	
	private String dni = "Vacío";
	private String nombre = "Vacío";
	private String apellidos = "Vacío";
	private int edad = 0;
	
	/**
	 * Constructor que segun los parametros obtenidos crea un objeto con los atributos especificados
	 * 
	 * @param dni = dni de la persona
	 * @param nombre = nombre de la persona
	 * @param apellidos = apellidos de la persona
	 * @param edad = edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	
	public String getDni() {
		
		return dni;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public String getApellidos() {
		
		return apellidos;
		
	}
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public void setDni(String dniM) {
		
		this.dni = dniM;
		
	}
	
	public void setNombre(String nombreM) {
		
		this.nombre = nombreM;
		
	}
	
	public void setApellidos(String apellidosM) {
		
		this.apellidos = apellidosM;
		
	}
	
	public void setEdad(int edadM) {
		
		this.edad = edadM;
		
	}
	
	
	public boolean esMayorEdad() {
		
		boolean mayor = false;
		
		if (this.edad >= 18 ) {
			
			mayor = true;
			
		}
		
		return mayor;
	}
	
	public boolean esJubilado() {
		
		boolean jubilado = false;
		
		if (this.edad >= 65) {
			
			jubilado = true;
			
		}
		
		return jubilado;
	}
	
	public int diferenciaEdad(Persona p) {
		
		int diferencia = 0;
		
		if (this.edad > p.edad) {
			
			diferencia = this.edad - p.edad;
			
		} else if (p.edad > this.edad) {
			
			diferencia = p.edad - this.edad;
			
		}
		
		return diferencia;
	}
	
	public String toString() {
		
		String informacion = "";
		
		informacion = ("Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni + "\n");
		
		return informacion;
	}
	
	

}
