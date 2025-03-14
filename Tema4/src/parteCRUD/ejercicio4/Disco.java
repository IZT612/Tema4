package parteCRUD.ejercicio4;

/**
 * Clase que representa un disco, con su código, autor, título, género y duración.
 */
public class Disco {

    private int codigo;
    private String autor;
    private String titulo;
    private int duracion;
    private String genero;

    /**
     * Constructor de la clase Disco con los parámetros esenciales: código, autor y título.
     *
     * @param codigo Código único del disco.
     * @param autor Autor del disco.
     * @param titulo Título del disco.
     */
    public Disco(int codigo, String autor, String titulo) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
    }

    /**
     * Constructor de la clase Disco con todos los parámetros: código, autor, título, género y duración.
     *
     * @param codigo Código único del disco.
     * @param autor Autor del disco.
     * @param titulo Título del disco.
     * @param genero Género del disco.
     * @param duracion Duración del disco en minutos.
     */
    public Disco(int codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    /**
     * Obtiene el código del disco.
     *
     * @return El código único del disco.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Devuelve una representación en cadena del disco.
     *
     * @return Una cadena con el código, autor, título, género y duración del disco.
     */
    public String toString() {
        return ("Código: " + this.codigo + ". Autor: " + this.autor + ". Titulo: " + this.titulo + ". Género: " + this.genero + ". Duración: " + this.duracion);
    }

    /**
     * Compara dos discos por su código.
     *
     * @param obj Otro disco a comparar.
     * @return true si los códigos son iguales, false en caso contrario.
     */
    public boolean equals(Disco obj) {
        return (this.codigo == obj.getCodigo());
    }
}
