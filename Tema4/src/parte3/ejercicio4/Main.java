package parte3.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		String cadena;
		
		System.out.println("Introduce un 1 o un 0");
		n = sc.nextInt();
		sc.nextLine();
		
		if (n == 0 || n == 1) {
			
			System.out.println(ParseToBoolean.parseToBoolean(n));
			
		} else {
			
			System.out.println("El número debe ser 1 o 0");
			
		}
		
		System.out.println("Introduce un 'true' o un 'false'");
		cadena = sc.nextLine();
		
		if (cadena.equals("true") || cadena.equals("false")) {
			
			System.out.println(ParseToBoolean.parseToBoolean(cadena));
			
		} else {
			
			System.out.println("El valor debe ser 'true' o 'false'");
			
		}

	}

}
