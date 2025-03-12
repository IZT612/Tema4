package parteCRUD.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {

	private static Set<Disco> discos = new HashSet<Disco>();
	
	static public void listado() {
		
		for (Disco disco : discos) {
			
			System.out.println(disco);
			
		}
		
	}
	
	static public void crearDisco(Disco objeto) {
		
		discos.add(objeto);
		
	}
	
	static public boolean borrarDisco(Disco objeto) {
		
		boolean conseguido = false;
		
		for (Disco disco : discos) {
			
			if (objeto.getCodigo() == disco.getCodigo()) {
				
				objeto = disco;
				
			}
			
		}
		
		if (discos.remove(objeto)) {
			
			conseguido = true;
			
		}
		
		return conseguido;
		
	}
	
}
