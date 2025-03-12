package parteCRUD.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorrienteCRUD {

	static Set<CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();

	static public void añadirCuenta(CuentaCorriente cuentaParametro) {

		cuentas.add(cuentaParametro);

	}

	static public void mostrarLista() {

		for (CuentaCorriente cuenta : cuentas) {

			System.out.println(cuenta);
			System.out.println();

		}

	}

	static public boolean eliminarCuenta(CuentaCorriente cuentaParametro) {

		boolean conseguido = false;

		for (CuentaCorriente cuenta : cuentas) {

			if (cuenta.getDNI().equals(cuentaParametro.getDNI())) {

				cuentas.remove(cuenta);
				conseguido = true;

			}

		}

		return conseguido;
	}

	static public boolean actualizarCuenta(CuentaCorriente cuentaParametro) {

		boolean conseguido = false;

		for (CuentaCorriente cuenta : cuentas) {

			if (cuenta.getDNI().equals(cuentaParametro.getDNI())) {

				if (!cuentaParametro.getNombre().isBlank()) {

					cuenta.setNombre(cuentaParametro.getNombre());

				}

				if (cuentaParametro.getSaldo() >= 0) {

					cuenta.setSaldo(cuentaParametro.getSaldo());

				}

				if (cuentaParametro.getnacionalidad().equals("española")
						|| cuentaParametro.getnacionalidad().equals("extranjera")) {

					cuenta.setNacionalidad(cuentaParametro.getnacionalidad());

				}

				conseguido = true;

			}

		}

		return conseguido;

	}

	static public void verCuenta(CuentaCorriente cuentaParametro) {

		for (CuentaCorriente cuenta : cuentas) {

			if (cuentaParametro.getDNI().equals(cuenta.getDNI())) {

				System.out.println(cuenta);

			}

		}

	}

	static public CuentaCorriente devolverCuenta(CuentaCorriente soloDNI) {

		CuentaCorriente cuentaADevolver = null;

		for (CuentaCorriente cuenta : cuentas) {

			if (soloDNI.getDNI().equals(cuenta.getDNI())) {

				cuentaADevolver = cuenta;

			}

		}

		return cuentaADevolver;

	}

}
