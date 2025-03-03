package parte3.ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int a;
		
		System.out.println("Probemos el sumatorio, introduce un numero");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println(FuncionesMatematicas.sumatorio(numero));
		
		System.out.println("Probemos ahora la potencia, introduce el número y luego la potencia");
		a = sc.nextInt();
		sc.nextLine();
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println(FuncionesMatematicas.potencia(a, numero));
		
		System.out.println("Ahora probemos la serie de Fibonacci, introduce un número");
		numero = sc.nextInt();
		System.out.println(FuncionesMatematicas.serieFibonacci(numero));
		
		sc.close();

	}

}
