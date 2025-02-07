package ejercicio3;

/**
 * Clase que contiene atributos como las coordenadas de los rectangulos, también contiene funciones para calcular el perimetro y
 * el area de un rectangulo
 */
public class Rectangulo {

	// Creamos los atributos de la clase Rectangulo, con todas las coordenadas (de default son 0)
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	
	/**
	 * Funcion que obtiene las coordenadas y segun estas calcula los lados para
	 * calcular el perimetro
	 * 
	 * @param rectangulo = rectangulo del que luego obtiene las coordenadas
	 * @return el perimetro del rectangulo
	 */
	Rectangulo(int x1, int y1, int x2, int y2) {
		
		// Si los datos son correctos los introducimos
		if (!(x1 <= 0 || y1 <= 0 || x2 <= 0 || y2 <= 0)) {
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		}
		
	}
	
	public int getX1() {
		
		return x1;
		
	}
	
	public int getY1() {
		
		return y1;
		
	}
	
	public int getX2() {
		
		return x2;
		
	}
	
	public int getY2() {
		
		return y2;
		
	}
	
	public void setX1(int x1) {
		
		this.x1 = x1;
		
	}
	
	public void setY1(int y1) {
		
		this.y1 = y1;
		
	}
	
	public void setX2(int x2) {
		
		this.x2 = x2;
		
	}
	
	public void setY2(int y2) {
		
		this.y2 = y2;
		
	}
	
	/**
	 * Funcion que calcula el perimetro de un rectangulo
	 * 
	 * @param rectangulo = el rectangulo del que se obtienen las coordenadas
	 * @return el perimetro del rectangulo
	 */
	public int getPerimetro(Rectangulo rectangulo) {

		// Variable donde guardaremos el perimetro
		int perimetro = 0;

		// Todas las variables donde guardamos las coordenadas "x" mayor y menor, y lo
		// mismo con las "y"
		int xMayor;
		int xMenor;
		int yMayor;
		int yMenor;
		
		// Si la coordenada x1 es mayor a la x2
		if (rectangulo.x1 > rectangulo.x2) {

			// "xMayor" será x1, y "xMenor" será x2
			xMayor = rectangulo.x1;
			xMenor = rectangulo.x2;

			// Si no, al contrario
		} else {

			xMayor = rectangulo.x2;
			xMenor = rectangulo.x1;
		}

		// Hacemos lo mismo con la coordenada y
		if (rectangulo.y1 > rectangulo.y2) {

			yMayor = rectangulo.y1;
			yMenor = rectangulo.y2;

		} else {

			yMayor = rectangulo.y2;
			yMenor = rectangulo.y1;
		}

		// Calculamos el perimetro
		perimetro = ((xMayor - xMenor) * 2) + ((yMayor - yMenor) * 2);

		// Devolvemos el perimetro
		return perimetro;

	}

	/**
	 * Funcion que obtiene las coordenadas y segun estas calcula los lados para
	 * calcular el area
	 * 
	 * @param rectangulo = rectangulo del que luego obtiene las coordenadas
	 * @return el area del rectangulo
	 */
	public int getArea(Rectangulo rectangulo) {

		// Variable donde guardaremos el area
		int area = 0;

		// Todas las variables donde guardamos las coordenadas "x" mayor y menor, y lo
		// mismo con las "y"
		int xMayor;
		int xMenor;
		int yMayor;
		int yMenor;

		// Mismo if que en la funcion "perimetro", en resumen sirve para guardar en
		// xMayor, xMenor, yMayor, yMenor donde corresponden
		if (rectangulo.x1 > rectangulo.x2) {

			xMayor = rectangulo.x1;
			xMenor = rectangulo.x2;

		} else {

			xMayor = rectangulo.x2;
			xMenor = rectangulo.x1;
		}

		if (rectangulo.y1 > rectangulo.y2) {

			yMayor = rectangulo.y1;
			yMenor = rectangulo.y2;

		} else {

			yMayor = rectangulo.y2;
			yMenor = rectangulo.y1;
		}

		// Calculamos el area
		area = (xMayor - xMenor) * (yMayor - yMenor);

		// Devolvemos el area
		return area;
	}
	
	public void setX1Y1(int x1, int y1) {
		
		this.x1 = x1;
		this.y1 = y1;
		
	}
	
	public void setX2Y2(int x2, int y2) {
		
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public void setAll(int x1, int y1, int x2, int y2) {
		
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
	}
	
	public String toString() {
		
		String informacion = "";
		
		System.out.println("X1: " + this.x1 + "\nY1: " + this.y1 + "\nX2: " + this.x2 + "\nY2" + this.y2);
		
		return informacion;
	}
	
}
