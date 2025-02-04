package ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		// Creamos un artículo
		Articulo articulo1 = new Articulo();
		
		// Le guardamos un nombre y precio a este articul
		articulo1.nombre = "Pijama";
		articulo1.precio = 10;
		
		// Mostramos todos sus atributos
		System.out.println("Nombre del artículo: " + articulo1.nombre);
		System.out.println("Precio: " + articulo1.precio + "€");
		System.out.println("IVA: " + articulo1.IVA + "%");
		// El PVP lo obtenemos llamando a la función "precioPublico" de la clase "Articulo" dando nuestro articulo
		System.out.println("PVP: " + articulo1.precioPublico(articulo1));
		System.out.println();

		// Cambiamos el precio del articulo
		articulo1.precio = 98;
		
		// Volvemos a cambiar el
		System.out.println("Nombre del artículo: " + articulo1.nombre);
		System.out.println("Precio: " + articulo1.precio + "€");
		System.out.println("IVA: " + articulo1.IVA + "%");
		System.out.println("PVP: " + articulo1.precioPublico(articulo1));
		
		
	}

}
