package ejercicio2;

/**
 * Clase persona con atributos dni, nombre, apellidos y edad
 */
public class Persona {

	
	String dni;
	String nombre;
	String apellidos;
	int edad;
	
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
