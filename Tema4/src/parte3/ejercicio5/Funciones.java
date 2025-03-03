package parte3.ejercicio5;

import java.util.Random;

public class Funciones {
	
	static Random rand = new Random();
	
	static public void numerosAleatorios(int cantidad) {
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.print(rand.nextDouble(0, 1) + " ");
			
		}
		
	}
	
	static public void numerosAleatorios(int cantidad, int maximo) {
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.print(rand.nextInt(0, maximo + 1) + " ");
			
		}
		
	}
	
	static public void numerosAleatorios(int cantidad, int minimo, int maximo) {
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.print(rand.nextInt(minimo, maximo + 1) + " ");
			
		}
		
	}

}
