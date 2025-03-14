package parteCRUD.ejercicio1;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que gestiona las operaciones CRUD sobre los alumnos.
 * 
 * @author Iván
 */
public class AlumnoCRUD {
    
    private static Set<Alumno> alumnos = new HashSet<>();
    
    /**
     * Crea un nuevo alumno y lo agrega a la lista.
     * 
     * @param nombre Nombre del alumno.
     * @param nota Nota del alumno.
     */
    static public void crearAlumno(String nombre, double nota) {
        Alumno alumno = new Alumno(nombre, nota);
        alumnos.add(alumno);
    }
    
    /**
     * Muestra el listado de alumnos.
     */
    static public void listado() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    /**
     * Modifica la nota de un alumno existente.
     * 
     * @param nombre Nombre del alumno a modificar.
     * @param nota Nueva nota del alumno.
     */
    static public void modificar(String nombre, double nota) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                alumno.setNota(nota);
            }
        }
    }
    
    /**
     * Borra un alumno de la lista.
     * 
     * @param nombre Nombre del alumno a borrar.
     */
    static public void borrar(String nombre) {
        alumnos.removeIf(alumno -> alumno.getNombre().equals(nombre));
    }
}