package parteCRUD.ejercicio1;

import java.util.Scanner;

/**
 * Clase principal que gestiona el menú de opciones para la manipulación de alumnos.
 * Permite listar, crear, modificar y eliminar alumnos.
 * 
 * @author Iván
 */
public class Main {

	public static void main(String[] args) {
	    
	    // Se crea un objeto Scanner para leer la entrada del usuario
	    Scanner sc = new Scanner(System.in);

	    String nombre; // Variable para almacenar el nombre del alumno
	    double nota;   // Variable para almacenar la nota del alumno
	    int opcion;    // Variable para almacenar la opción seleccionada por el usuario
	    
	    // Bucle que muestra el menú y ejecuta la opción seleccionada hasta que se elija salir
	    do  {
	        // Se muestra el menú de opciones
	        System.out.println("Introduzca una opción:");
	        System.out.println("1. Mostrar listado.");
	        System.out.println("2. Crear nuevo alumno.");
	        System.out.println("3. Modificar nota de un alumno.");
	        System.out.println("4. Borrar alumno.");
	        System.out.println("5. Salir");
	        
	        // Se lee la opción elegida por el usuario
	        opcion = sc.nextInt();
	        sc.nextLine(); // Consumir el salto de línea sobrante
	        System.out.println();
	        
	        // Se ejecuta la acción correspondiente a la opción elegida
	        switch (opcion) {
	            case 1 -> AlumnoCRUD.listado(); // Muestra el listado de alumnos
	            
	            case 2 -> { // Crea un nuevo alumno
	                System.out.println("Introduzca el nombre del alumno");
	                nombre = sc.nextLine();
	                System.out.println("Ahora su nota");
	                nota = sc.nextDouble();
	                sc.nextLine(); // Consumir el salto de línea sobrante
	                AlumnoCRUD.crearAlumno(nombre, nota);
	            }
	            
	            case 3 -> { // Modifica la nota de un alumno existente
	                System.out.println("Introduzca el nombre del alumno");
	                nombre = sc.nextLine();
	                System.out.println("Ahora su nueva nota");
	                nota = sc.nextDouble();
	                sc.nextLine(); // Consumir el salto de línea sobrante
	                AlumnoCRUD.modificar(nombre, nota);
	            }
	            
	            case 4 -> { // Borra un alumno de la lista
	                System.out.println("Introduzca el nombre del alumno");
	                nombre = sc.nextLine();
	                AlumnoCRUD.borrar(nombre);
	            }
	        }
	        
	        System.out.println(); // Espacio en blanco para mejorar la legibilidad del menú
	        
	    } while (opcion != 5); // Repite el bucle hasta que el usuario elija salir
	    
	    // Mensaje de salida del programa
	    System.out.println("Saliendo del programa");
	    
	    // Se cierra el Scanner para liberar recursos
	    sc.close();
	}
}