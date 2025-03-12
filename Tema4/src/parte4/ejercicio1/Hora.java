package parte4.ejercicio1;

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora(int hora, int minuto, int segundo) {
		
		if (hora < 24 && hora >= 0) {
			
			this.hora = hora;
			
		}
		
		if (minuto < 60 && minuto >= 0) {
			
			this.minuto = minuto;
			
		}
		
		if (segundo < 60 && segundo >= 0) {
			
			this.segundo = segundo;
			
		}
		
	}
	
	public void incrementarSegundo() {
		
		if (this.segundo < 59) {
			
			this.segundo++;
			
		} else {
			
			this.segundo = 0;
			
			if (this.minuto < 59) {
				
				this.minuto++;
				
			} else {
				
				this.minuto = 0;
				
				if (this.hora < 23) {
					
					this.hora++;
					
				} else {
					
					this.hora = 0;
					
				}
				
			}
			
		}
		
	}
	
	public String toString() {
		
		String informacion = "";
		
		if (this.hora < 10) {
			
			informacion += 0;
			
		}
		
		informacion += this.hora + ":";
		
		if (this.minuto < 10) {
			
			informacion += 0;
			
		}
		
		informacion += this.minuto + ":";
		
		if (this.segundo < 10) {
			
			informacion += 0;
			
		}
		
		informacion += this.segundo;
		
		return informacion;
		
	}

}
