package parte3.ejercicio6;

import parte3.ejercicio3.SumasEnteros;

public class FuncionesMatematicas {

	 static public int sumatorio(int numero) {
	        int resultado = 0;

	        if (numero != 1) {
	            resultado = (numero + SumasEnteros.sumaEnteros(numero - 1)); // Llamada recursiva
	        } else {
	            resultado += 1; // Caso base: cuando n es 1
	        }

	        return resultado;
	        
	 }
	 
	 static public double potencia(double a, int n) {
		 
		 double resultado = 0;
		 
		 if (n != 0) {
			 
			 resultado = a * FuncionesMatematicas.potencia(a, n - 1);
			 
		 } else {
			 
			 resultado = 1;
			 
		 }
		 
		 return resultado;
	 }
	 
	 static public int serieFibonacci(int numero) {
		 
		 int resultado = 0;
		 
		 if (numero == 0 || numero == 1) {
			 
			 resultado = 1;
			 
		 } else {
			 
			 resultado = FuncionesMatematicas.serieFibonacci(numero - 1) + FuncionesMatematicas.serieFibonacci(numero - 2);
			 
		 }
		 
		 return resultado;
		 
	 }
	 
	 
	
}
