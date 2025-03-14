package parteCRUD.ejercicio1;

/**
 * Clase que representa un alumno con nombre y nota.
 * 
 * @author Iván
 */
public class Alumno {
    
    private String nombre;
    private double nota;
    
    /**
     * Constructor de la clase Alumno.
     * 
     * @param nombre Nombre del alumno.
     * @param nota Nota del alumno.
     */
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    /**
     * Obtiene el nombre del alumno.
     * 
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene la nota del alumno.
     * 
     * @return Nota del alumno.
     */
    public double getNota() {
        return this.nota;
    }
    
    /**
     * Modifica el nombre del alumno.
     * 
     * @param nombre Nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Modifica la nota del alumno.
     * 
     * @param nota Nueva nota del alumno.
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    /**
     * Devuelve una representación en cadena del alumno.
     * 
     * @return Nombre y nota del alumno.
     */
    public String toString() {
        return this.nombre + ": " + this.nota;
    }
    
    /**
     * Compara si dos alumnos son iguales basándose en su nombre.
     * 
     * @param alumno2 Alumno con el que se compara.
     * @return true si tienen el mismo nombre, false en caso contrario.
     */
    public boolean equals(Alumno alumno2) {
        return this.nombre.equals(alumno2.nombre);
    }
}