package parteCRUD.ejercicio1;

public class Alumno {
	
	private String nombre;
	private double nota;
	
	public Alumno(String nombre, double nota) {
		
		this.nombre = nombre;
		this.nota = nota;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public double getNota() {
		
		return this.nota;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setNota(double nota) {
		
		this.nota = nota;
		
	}
	
	public String toString() {
		
		return (this.nombre + ": " + this.nota);		
	}
	
	public boolean equals(Alumno alumno2) {
		
		return (this.nombre.equals(alumno2.nombre));		
	}
	
}
