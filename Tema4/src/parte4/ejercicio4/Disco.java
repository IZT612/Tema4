package parte4.ejercicio4;

public class Disco {

	private int codigo;
	private String autor;
	private String titulo;
	private int duracion;
	private String genero;
	
	public Disco(int codigo, String autor, String titulo) {
		
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		
	}
	
	public Disco(int codigo, String autor, String titulo, String genero, int duracion) {
		
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		
	}
	
	public int getCodigo() {
		
		return (this.codigo);
		
	}
	
	public String toString() {
		
		return ("Código: " + this.codigo + ". Autor: " + this.autor + ". Titulo: " + this.titulo + ". Género: " + this.genero + ". Duración: " + this.duracion);
		
	}
	
	public boolean equals(Disco obj) {
			
		return (this.codigo == obj.getCodigo());
		
	}
	
}
