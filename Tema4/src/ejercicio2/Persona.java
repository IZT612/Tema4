package ejercicio2;

/**
 * Clase persona con atributos dni, nombre, apellidos y edad
 */
public class Persona {

	
	private String dni = "Vacío";
	private String nombre = "Vacío";
	private String apellidos = "Vacío";
	private int edad = 0;
	
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
	
	

}
