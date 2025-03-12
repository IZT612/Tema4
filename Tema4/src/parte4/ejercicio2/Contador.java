package parte4.ejercicio2;

public class Contador {

	private int cont;
	
	public Contador(int cont) {
		
		if (cont >= 0) {
			
			this.cont = cont;
			
		}
		
	}
	
	public int getCont() {
		
		return this.cont;
		
	}
	
	public boolean setCont(int cont) {
		
		boolean conseguido = false;
		
		if (cont >= 0) {
			
			this.cont = cont;
			conseguido = true;
			
		}
		
		return conseguido;
		
	}
	
	public void incrementar() {
		
		this.cont++;
		
	}
	
	public void decrementar() {
		
		if (this.cont != 0) {
			
			this.cont--;
			
		}
		
	}
	
	public String toString() {
		
		String informacion = "";
		
		return informacion += this.cont;
		
	}
	
}
