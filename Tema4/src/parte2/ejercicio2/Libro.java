package parte2.ejercicio2;

public class Libro {

	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private int prestados;
	enum Genero {
		Narrativo, Lírico, Drámatico, Didáctico, Poético
	};
	
	public Libro(String titulo, String autor) {
		
		if (!titulo.isBlank()) {
			
			this.titulo = titulo;
			
		}
		
		if (!autor.isBlank()) {
			
			
			
		}
		
	}
	
}
