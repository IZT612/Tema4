package parteCRUD.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRUD {

	private static Set<Alumno> alumnos = new HashSet<Alumno>();
	
	static public void crearAlumno(String nombre, double nota) {
		
		Alumno alumno = new Alumno(nombre, nota);
		alumnos.add(alumno);
		
	}
	
	static public void listado() {
		
		for(Alumno alumno : alumnos) {
			
			System.out.println(alumno);
			
		}
		
	}
	
	static public void modificar(String nombre, double nota) {
		
		for(Alumno alumno : alumnos) {
			
			if(alumno.getNombre().equals(nombre)) {
				
				alumno.setNota(nota);
				
			}
			
		}
		
	}
	
	static public void borrar(String nombre) {
		
		for(Alumno alumno : alumnos) {
			
			if(alumno.getNombre().equals(nombre)) {
				
				alumnos.remove(alumno);
				
			}
			
			
		}
		
		
	}
	
}
