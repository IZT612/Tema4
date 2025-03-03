package parte2.ejercicio3;

/**
 * Representa un alumno con un nombre y una nota media.
 */
public class Alumno {

    private String nombre;
    private double notaMedia;

    /**
     * Constructor de la clase Alumno.
     * @param nombre Nombre del alumno. No puede estar en blanco.
     * @param notaMedia Nota media del alumno. Debe estar entre 0 y 10.
     */
    public Alumno(String nombre, double notaMedia) {
        if (!nombre.isBlank()) {
            this.nombre = nombre;
        } 
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;
        }
    }
    
    /**
     * Obtiene el nombre del alumno.
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene la nota media del alumno.
     * @return Nota media del alumno.
     */
    public double getNotaMedia() {
        return this.notaMedia;
    }
    
    /**
     * Establece el nombre del alumno.
     * @param nombre Nuevo nombre del alumno. No puede estar en blanco.
     */
    public void setNombre(String nombre) {
        if (!nombre.isBlank()) {
            this.nombre = nombre;
        } 
    }
    
    /**
     * Establece la nota media del alumno.
     * @param notaMedia Nueva nota media. Debe estar entre 0 y 10.
     */
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;
        }
    }
    
    /**
     * Devuelve una representación en cadena del objeto Alumno.
     * @return Una cadena con el nombre y la nota media del alumno.
     */
    public String toString() {
        return "\nNombre: " + this.nombre + "\nNota media: " + this.notaMedia + "\n";
    }
    
    /**
     * Compara si dos alumnos tienen el mismo nombre.
     * @param alumno2 Alumno con el que se va a comparar.
     * @return true si los nombres son iguales, false en caso contrario.
     */
    public boolean equals(Alumno alumno2) {
        return this.nombre.equals(alumno2.nombre);
    }
}
