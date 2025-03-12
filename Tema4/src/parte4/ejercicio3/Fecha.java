package parte4.ejercicio3;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) {

		if (dia > 0 && dia <= 31) {

			this.dia = dia;

		}

		if (mes > 0 && mes <= 12) {

			this.mes = mes;

		}

		this.año = año;
	}

	public boolean esBisiesto() {

		boolean bisiesto = false;

		if (this.año % 4 == 0) {

			bisiesto = true;

		}

		return bisiesto;

	}

	public boolean fechaCorrecta() {

		boolean correcta = true;

		if (
				(this.esBisiesto() && this.mes == 2 && this.dia > 29) || 
				(this.mes == 2 && this.dia > 28) || 
				(this.mes % 2 == 0 && this.dia > 30 && this.mes <= 7) ||
				(this.mes % 2 == 1 && this.dia > 31 && this.mes <= 7) ||
				(this.mes % 2 == 0 && this.dia > 31 && this.mes > 7) ||
				(this.mes % 2 == 1 && this.dia > 30 && this.mes > 7)
				) {

			correcta = false;

		} 
		
		return correcta;

	}
	
	public void diaSiguiente() {
		
		this.dia++;
		
		if (!this.fechaCorrecta() && this.mes == 12) {
			
			this.dia = 1;
			this.mes = 1;
			this.año++;
			
		} else if(!this.fechaCorrecta()) {
			
			this.dia = 1;
			this.mes++;
			
		}
		
	}
	
	public String toString() {
		
		return this.dia + " - " + this.mes + " - " + this.año;
		
	}

}
