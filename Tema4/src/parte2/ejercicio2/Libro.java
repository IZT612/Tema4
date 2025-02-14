package parte2.ejercicio2;

/**
 * Clase Libro que tiene guardados como atributos su titulo, autor, numero de
 * ejemplares, cantidad de ejemplares prestados, y genero, al igual que varios
 * metodos para obtener su informacion, compararlos, hacer prestaciones y
 * devoluciones
 */
public class Libro {

	// Creamos todos los atributos: titulo, autor, numeroEjemplares y prestados
	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private int prestados;

	// Creamos el enumerador "Genero" que solo tiene de valores guardados: Narrativo, Lírico, Dramático, Didáctco y Poético
	enum Genero {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	};

	// Creamos una variable que solo podra tener los valores guardados en  el enum "Genero"
	private Genero genero;

	/**
	 * Constructor dado titulo y autor
	 * 
	 * @param titulo = titulo del libro
	 * @param autor = autor del libro
	 */
	public Libro(String titulo, String autor) {

		if (!titulo.isBlank()) {

			this.titulo = titulo;

		}

		if (!autor.isBlank()) {

			this.autor = autor;

		}

	}

	/**
	 * Constructor dado titulo, autor, cantidad de ejemplares y ejemplares prestados
	 * 
	 * @param titulo = titulo del libro
	 * @param autor = autor del libro
	 * @param numeroEjemplares = numero de ejemplares del libro 
	 * @param prestados = cantidad de ejemplares del libro prestados
	 */
	public Libro(String titulo, String autor, int numeroEjemplares, int prestados) {

		if (!titulo.isBlank()) {

			this.titulo = titulo;

		}

		if (!autor.isBlank()) {

			this.autor = autor;

		}

		if (numeroEjemplares > 0) {

			this.numeroEjemplares = numeroEjemplares;

		}

		if (prestados >= 0) {

			this.prestados = prestados;

		}

	}

	/**
	 * Constructor dado titulo, autor, cantidad de ejemplares y ejemplares prestados
	 * 
	 * @param titulo = titulo del libro
	 * @param autor = autor del libro
	 * @param numeroEjemplares = numero de ejemplares del libro 
	 * @param prestados = cantidad de ejemplares del libro prestados
	 * @param genero = genero del libro
	 */
	public Libro(String titulo, String autor, int numeroEjemplares, int prestados, String genero) {

		if (!titulo.isBlank()) {

			this.titulo = titulo;

		}

		if (!autor.isBlank()) {

			this.autor = autor;

		}

		if (numeroEjemplares > 0) {

			this.numeroEjemplares = numeroEjemplares;

		}

		if (prestados >= 0) {

			this.prestados = prestados;

		}

		switch (genero) {

		case "NARRATIVO" -> {

			this.genero = Genero.Narrativo;

		}

		case "LÍRICO" -> {

			this.genero = Genero.Lírico;

		}

		case "DRAMÁTICO" -> {

			this.genero = Genero.Dramático;

		}

		case "DIDÁCTICO" -> {

			this.genero = Genero.Didáctico;

		}

		case "POÉTICO" -> {

			this.genero = Genero.Poético;

		}

		}

	}

	/**
	 * Obtiene el titulo del libro
	 * 
	 * @return el titulo del libro
	 */
	public String getTitulo() {

		return this.titulo;

	}

	/**
	 * Obtiene el autor del libro
	 * 
	 * @return el autor del libro
	 */
	public String getAutor() {

		return this.autor;

	}

	/**
	 * Obtiene la cantidad de ejemplares del libro
	 * 
	 * @return la cantidad de ejemplares del libro
	 */
	public int getNumeroEjemplares() {

		return this.numeroEjemplares;

	}

	/**
	 * Obtiene la cantidad de ejemplares prestados
	 * 
	 * @return la cantidad de ejmplares prestados
	 */
	public int getPrestados() {

		return this.prestados;

	}

	/**
	 * Obtiene el genero del libro
	 * 
	 * @return el genero del libro
	 */
	public String getGenero() {

		String generoString = "";

		switch (this.genero) {

		case Genero.Narrativo -> {

			generoString = "Narrativo";

		}

		case Genero.Lírico -> {

			generoString = "Lírico";

		}

		case Genero.Dramático -> {

			generoString = "Dramático";

		}

		case Genero.Didáctico -> {

			generoString = "Didáctico";

		}

		case Genero.Poético -> {

			generoString = "Poético";

		}

		}

		return generoString;

	}

	/**
	 * Le da un valor nuevo al titulo del libro
	 * 
	 * @param titulo = nuevo titulo del libro
	 */
	public void setTitulo(String titulo) {

		if (!titulo.isBlank()) {

			this.titulo = titulo;

		}

	}

	/**
	 * Le da un nuevo valor al autor del libro
	 * 
	 * @param autor = nuevo autor del libro
	 */
	public void setAutor(String autor) {

		if (!autor.isBlank()) {

			this.autor = autor;

		}

	}

	/**
	 * Le da un nuevo valor a la cantidad de ejemplares que tenemos
	 * 
	 * @param cantidad = cantidad de ejemplares nuevos
	 */
	public void setNumeroEjemplares(int cantidad) {

		if (cantidad > 0) {

			this.numeroEjemplares = cantidad;

		}

	}

	/**
	 * Le da un nuevo valor al genero del libro
	 * 
	 * @param genero = genero del libro
	 */
	public void setGenero(String genero) {

		switch (genero) {

		case "NARRATIVO" -> {

			this.genero = Genero.Narrativo;

		}

		case "LÍRICO" -> {

			this.genero = Genero.Lírico;

		}

		case "DRAMÁTICO" -> {

			this.genero = Genero.Dramático;

		}

		case "DIDÁCTICO" -> {

			this.genero = Genero.Didáctico;

		}

		case "POÉTICO" -> {

			this.genero = Genero.Poético;

		}

		}

	}

	/**
	 * Sirve para hacer préstamos. Actualiza la cantidad de libros prestados segun la cantidad a prestar.
	 * 
	 * @param cantidad = cantidad de libros a prestar
	 * @return un booleano que indica si se pueden prestar o no
	 */
	public boolean prestamo(int cantidad) {

		boolean prestados = false;

		if (cantidad > 0 && (this.prestados + cantidad) <= this.numeroEjemplares) {

			prestados = true;
			this.prestados += cantidad;

		}

		return prestados;
	}

	/**
	 * Sirve para hacer devoluciones. Actualiza la cantidad de libros segun la cantidad devuelta
	 * 
	 * @param cantidad = cantidad de libros a devovler
	 * @return un booleano que indica si se pueden devolver o no
	 */
	public boolean devolucion(int cantidad) {

		boolean devueltos = false;

		if (cantidad > 0 && cantidad <= this.prestados) {

			this.prestados -= cantidad;
			devueltos = true;

		}

		return devueltos;
	}

	/**
	 * Pasa toda la información del libro a String.
	 * 
	 * @return informacion = Información del libro en forma de String
	 */
	public String toString() {

		String informacion;

		informacion = ("Título: " + this.titulo + "\nAutor: " + this.autor + "\nGénero: " + this.genero
				+ "\nCantidad de ejemplares: " + this.numeroEjemplares + "\nCantidad de ejemplares prestados: "
				+ this.prestados);

		return informacion;
	}

	/**
	 * Compara dos libros, son iguales si coinciden el titulo y autor
	 * 
	 * @param libro = segundo libro con el que compararse
	 * @return booleano que indica si son iguales o no
	 */
	public boolean equals(Libro libro) {

		boolean sonIguales = false;

		if (this.titulo.equals(libro.titulo) && this.autor.equals(libro.autor)) {

			sonIguales = true;

		}

		return sonIguales;
	}

}
