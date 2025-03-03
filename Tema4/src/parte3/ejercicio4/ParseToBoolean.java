package parte3.ejercicio4;

public class ParseToBoolean {

	static public boolean parseToBoolean(int n) {
		
		boolean b = false;
		
		if (n == 0) {
			
			b = false;
			
		} else if (n == 1) {
			
			b = true;
			
		}
		
		return b;
		
	}
	
	static public boolean parseToBoolean(String cadena) {
		
		boolean b = false;
		
		if (cadena.equals("false")) {
			
			b = false;
			
		} else if (cadena.equals("true")) {
			
			b = true;
			
		}
		
		return b;
		
	}
	
}
