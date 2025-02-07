package ejercicio1;

/**
 * Clase Punto que guarda funciones para operar con puntos y los atributos de los propios puntos
 */
public class Punto {

	// Creamos el atributo de la clase "Punto" coordenadaX
	private int coordenadaX = 0;
	
	// Creamos el atributo de la clase "Punto" coordenadaY
	private int coordenadaY = 0;
	
	/**
	 * Constructor que obtiene dos coordenadas y las aplica al objeto
	 * 
	 * @param coordenadaX = coordenada X del punto
	 * @param coordenadaY = coordenada Y del punto
	 */
	public Punto(int coordenadaX, int coordenadaY) {
		
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		
	}
	
	
	// Función publica para acceder a la coordenada X
	public int getX() {
		
		return coordenadaX;
		
	}
	
	// Función publica para acceder a la coordenada Y
	public int getY() {
		
		return coordenadaY;
		
	}
	
	// Función publica para cambiar la coordenada X del objeto
	public void setX(int coordenadaX) {
			
		this.coordenadaX = coordenadaX;		
		
	}
	
	// Función publica para cambiar la coordenada Y del objeto
	public void setY(int coordenadaY) {
			
			this.coordenadaY = coordenadaY;
		
	}
	
	public void setXY(int x, int y) {
		
		this.coordenadaX = x;
		this.coordenadaY = y;
		
	}
	
	public void desplaza(int dx, int dy) {
		
		this.coordenadaX += dx;
		this.coordenadaY += dy;
		
	}
	
	public double distancia(Punto p) {
		
		double distancia = 0;
		
		distancia = Math.sqrt(Math.pow((p.coordenadaX - this.coordenadaX), 2) + Math.pow((p.coordenadaY - this.coordenadaY), 2));
		
		return distancia;
	}
	
	public String toString() {
		
		String coordenadas = "";
		
		coordenadas = ("(" + this.coordenadaX + ", " + this.coordenadaY + ")");
		
		return coordenadas;
	}
	

}
