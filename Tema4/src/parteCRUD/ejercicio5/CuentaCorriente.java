package parteCRUD.ejercicio5;

public class CuentaCorriente {

	// Atributos que representan los datos de la cuenta corriente
	private String DNI;
	private String nombre;
	private double saldo = 0;

	// Enum que representa las posibles nacionalidades
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	// Atributo para almacenar la nacionalidad de la cuenta
	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	// Constructor dado el DNI
	public CuentaCorriente(String DNI) {
		if (!DNI.isBlank()) {
			this.DNI = DNI;
		}
	}

	// Constructor dado el DNI y saldo
	public CuentaCorriente(String DNI, double saldo) {
		if (!DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	// Constructor dado el DNI, nombre y saldo
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		if (!DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	// Constructor con todos los parámetros: DNI, nombre, saldo y nacionalidad
	public CuentaCorriente(String DNI, String nombre, double saldo, String nacionalidad) {
		if (!DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}

		// Establecemos la nacionalidad de acuerdo al parámetro recibido
		switch (nacionalidad) {
		case "EXTRANJERA" -> this.nacion = Nacionalidad.EXTRANJERA;
		case "ESPAÑOLA" -> this.nacion = Nacionalidad.ESPAÑOLA;
		default -> this.nacion = Nacionalidad.ESPAÑOLA;
		}
	}

	// Métodos setters y getters para los atributos de la cuenta
	public void setDNI(String DNI) {
		if (!DNI.isBlank()) {
			this.DNI = DNI;
		}
	}

	public void setNombre(String nombre) {
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public void setNacionalidad(String nacionalidad) {
		switch (nacionalidad) {
		case "EXTRANJERA" -> this.nacion = Nacionalidad.EXTRANJERA;
		case "ESPAÑOLA" -> this.nacion = Nacionalidad.ESPAÑOLA;
		}
	}

	public String getDNI() {
		return this.DNI;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getnacionalidad() {
		return (this.nacion == Nacionalidad.EXTRANJERA) ? "EXTRANJERA" : "ESPAÑOLA";
	}

	// Métodos para realizar operaciones en la cuenta
	public boolean sacarDinero(double cantidad) {
		if (cantidad <= this.saldo) {
			saldo -= cantidad;
			return true;
		}
		return false;
	}

	public boolean ingresarDinero(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
			return true;
		}
		return false;
	}

	// Método para representar la cuenta como un String
	public String toString() {
		return "DNI: " + this.DNI + "\nNombre: " + this.nombre + "\nSaldo: " + this.saldo + "€\nNacionalidad: "
				+ this.nacion;
	}

	// Comparar dos cuentas por nombre y DNI
	public boolean equals(CuentaCorriente cuenta) {
		return this.nombre.equals(cuenta.nombre) && this.DNI.equals(cuenta.DNI);
	}
}
