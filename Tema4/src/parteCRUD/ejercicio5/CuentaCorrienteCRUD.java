package parteCRUD.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorrienteCRUD {

    // Conjunto para almacenar las cuentas corrientes
    static Set<CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();

    // Añadir una nueva cuenta al conjunto
    static public void añadirCuenta(CuentaCorriente cuentaParametro) {
        cuentas.add(cuentaParametro);
    }

    // Mostrar todas las cuentas
    static public void mostrarLista() {
        for (CuentaCorriente cuenta : cuentas) {
            System.out.println(cuenta);
            System.out.println();
        }
    }

    // Eliminar una cuenta por su DNI
    static public boolean eliminarCuenta(CuentaCorriente cuentaParametro) {
        for (CuentaCorriente cuenta : cuentas) {
            if (cuenta.getDNI().equals(cuentaParametro.getDNI())) {
                cuentas.remove(cuenta);
                return true;
            }
        }
        return false;
    }

    // Actualizar una cuenta por su DNI
    static public boolean actualizarCuenta(CuentaCorriente cuentaParametro) {
        for (CuentaCorriente cuenta : cuentas) {
            if (cuenta.getDNI().equals(cuentaParametro.getDNI())) {
                if (!cuentaParametro.getNombre().isBlank()) {
                    cuenta.setNombre(cuentaParametro.getNombre());
                }
                if (cuentaParametro.getSaldo() >= 0) {
                    cuenta.setSaldo(cuentaParametro.getSaldo());
                }
                if (cuentaParametro.getnacionalidad().equals("española") || cuentaParametro.getnacionalidad().equals("extranjera")) {
                    cuenta.setNacionalidad(cuentaParametro.getnacionalidad());
                }
                return true;
            }
        }
        return false;
    }

    // Ver la información de una cuenta
    static public void verCuenta(CuentaCorriente cuentaParametro) {
        for (CuentaCorriente cuenta : cuentas) {
            if (cuentaParametro.getDNI().equals(cuenta.getDNI())) {
                System.out.println(cuenta);
            }
        }
    }

    // Devolver una cuenta con el DNI proporcionado
    static public CuentaCorriente devolverCuenta(CuentaCorriente soloDNI) {
        for (CuentaCorriente cuenta : cuentas) {
            if (soloDNI.getDNI().equals(cuenta.getDNI())) {
                return cuenta;
            }
        }
        return null;
    }
}
