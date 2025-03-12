package parteCRUD.ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class PizzaCRUD {

	static private Set<Pizza> pizzas = new HashSet<Pizza>();
	
	static public void listado() {
		
		for (Pizza pizza : pizzas) {
			
			System.out.println(pizza.toString());
			
		}
		
	}
	
	static public void nuevoPedido(Pizza objeto) {
		
		pizzas.add(objeto);
		
	}
	
	static public boolean pizzaServida(Pizza objeto) {
		
		boolean conseguido = false;
		
		for (Pizza pizza : pizzas) {
			
			if (pizza.getCodigo() == objeto.getCodigo()) {
				
				pizza.setEstado("servida");
				conseguido = true;
				
			}
			
		}
		
		return conseguido;
		
	}
	
}
