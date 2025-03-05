package parte4.ejercicio3;

public class Pizza {

	 private int codigo;
	    private Tamaño tamaño;
	    private Tipo tipo;
	    private Estado estado;
	    
	    /**
	     * Enum para los tamaños de pizza disponibles.
	     */
	    enum Tamaño {
	        Mediana, Familiar
	    }
	    
	    /**
	     * Enum para los tipos de pizza disponibles.
	     */
	    enum Tipo {
	        Margarita, CuatroQuesos, Funghi
	    }
	    
	    /**
	     * Enum para los estados de la pizza.
	     */
	    enum Estado {
	        Pedida, Servida
	    }
	    
	    /**
	     * Constructor de la clase Pizza.
	     * @param codigo Código único de la pizza.
	     * @param tamaño Tamaño de la pizza ("mediana" o "familiar").
	     * @param tipo Tipo de pizza ("margarita", "cuatroquesos" o "funghi").
	     */
	    public Pizza(int codigo, String tamaño, String tipo) {
	        this.codigo = codigo;
	        
	        switch (tamaño) {
	            case "mediana" -> this.tamaño = Tamaño.Mediana;
	            case "familiar" -> this.tamaño = Tamaño.Familiar;
	        }
	        
	        switch (tipo) {
	            case "margarita" -> this.tipo = Tipo.Margarita;
	            case "cuatroquesos" -> this.tipo = Tipo.CuatroQuesos;
	            case "funghi" -> this.tipo = Tipo.Funghi;
	        }
	    }
	    
	    /**
	     * Obtiene el código de la pizza.
	     * @return Código de la pizza.
	     */
	    public int getCodigo() {
	        return this.codigo;
	    }
	    
	    /**
	     * Obtiene el tamaño de la pizza.
	     * @return Tamaño de la pizza.
	     */
	    public Tamaño getTamaño() {
	        return this.tamaño;
	    }
	    
	    /**
	     * Obtiene el tipo de la pizza.
	     * @return Tipo de la pizza.
	     */
	    public Tipo getTipo() {
	        return this.tipo;
	    }
	    
	    /**
	     * Obtiene el estado actual de la pizza.
	     * @return Estado de la pizza.
	     */
	    public Estado getEstado() {
	        return this.estado;
	    }
	    
	    /**
	     * Establece un nuevo código para la pizza.
	     * @param codigo Nuevo código de la pizza.
	     */
	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }
	    
	    /**
	     * Establece el tamaño de la pizza.
	     * @param tamaño Nuevo tamaño de la pizza ("mediana" o "familiar").
	     */
	    public void setTamaño(String tamaño) {
	        switch (tamaño) {
	            case "mediana" -> this.tamaño = Tamaño.Mediana;
	            case "familiar" -> this.tamaño = Tamaño.Familiar;
	        }
	    }
	    
	    /**
	     * Establece el tipo de la pizza.
	     * @param tipo Nuevo tipo de pizza ("margarita", "cuatroquesos" o "funghi").
	     */
	    public void setTipo(String tipo) {
	        switch (tipo) {
	            case "margarita" -> this.tipo = Tipo.Margarita;
	            case "cuatroquesos" -> this.tipo = Tipo.CuatroQuesos;
	            case "funghi" -> this.tipo = Tipo.Funghi;
	        }
	    }
	    
	    /**
	     * Establece el estado de la pizza.
	     * @param estado Nuevo estado de la pizza ("pedida" o "servida").
	     */
	    public void setEstado(String estado) {
	        switch (estado) {
	            case "pedida" -> this.estado = Estado.Pedida;
	            case "servida" -> this.estado = Estado.Servida;
	        }
	    }
	    
	    /**
	     * Devuelve una representación en cadena de la pizza.
	     * @return Una cadena con el código, tamaño, tipo y estado de la pizza.
	     */
	    public String toString() {
	        return ("Código: " + this.codigo + ". Tamaño: " + this.tamaño + ". Tipo: " + this.tipo + ". Estado: " + this.estado);
	    }
	    
	    /**
	     * Compara dos pizzas por su código.
	     * @param pizza2 Otra pizza con la que se comparará.
	     * @return true si los códigos son iguales, false en caso contrario.
	     */
	    public boolean equals(Pizza pizza2) {
	        return this.codigo == pizza2.codigo;
	    }
	
}
