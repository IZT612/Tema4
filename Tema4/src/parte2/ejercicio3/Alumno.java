package parte2.ejercicio3;

public class Alumno {

	private String nombre;
	private double notaMedia;

	public Alumno(String nombre, double notaMedia) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		} 

		if (notaMedia >= 0 && notaMedia <= 10){
			
			this.notaMedia = notaMedia;
			
		}
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public double getNotaMedia() {
		
		return this.notaMedia;
		
	}
	
	public void setNombre(String nombre) {
		
		if (!nombre.isBlank()) {
			
			this.nombre = nombre;
			
		} 
		
	}
	
	public void setNotaMedia(double notaMedia) {
		
		if (notaMedia >= 0 && notaMedia <= 10){
			
			this.notaMedia = notaMedia;
			
		}
		
	}
	
	public String toString() {
		
		String informacion;
		
		informacion = ("\nNombre: " + this.nombre + "\nNota media: " + this.notaMedia + "\n");
		
		return informacion;
		
	}
	
	public boolean equals(Alumno alumno2) {
		
		boolean iguales = false;
		
		if (this.nombre.equals(alumno2.nombre)) {
			
			iguales = true;
			
		}
		
		return iguales;
		
	}
	
}

