package parte4.ejercicio4;

/**
 * Clase que representa una fracción con numerador y denominador.
 * Permite realizar operaciones como sumar, restar, multiplicar, dividir y simplificar fracciones.
 * 
 * @author Iván
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    /**
     * Constructor de la clase Fraccion.
     * Inicializa la fracción con los valores proporcionados, siempre que el denominador no sea 0.
     * 
     * @param numerador El numerador de la fracción.
     * @param denominador El denominador de la fracción (no puede ser 0).
     */
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador != 0) {
            this.denominador = denominador;
        }
    }

    /**
     * Obtiene el numerador de la fracción.
     * 
     * @return El numerador de la fracción.
     */
    public int getNumerador() {
        return this.numerador;
    }

    /**
     * Obtiene el denominador de la fracción.
     * 
     * @return El denominador de la fracción.
     */
    public int getDenominador() {
        return this.denominador;
    }

    /**
     * Establece un nuevo numerador para la fracción.
     * 
     * @param numerador El nuevo numerador de la fracción.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Establece un nuevo denominador para la fracción, siempre que no sea 0.
     * 
     * @param denominador El nuevo denominador de la fracción (no puede ser 0).
     */
    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        }
    }

    /**
     * Devuelve la fracción en formato de cadena (numerador/denominador).
     * 
     * @return La fracción en formato de cadena.
     */
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    /**
     * Suma la fracción actual con otra fracción.
     * 
     * @param fraccion La fracción con la que se va a sumar.
     * @return El resultado de la suma como una nueva fracción.
     */
    public Fraccion suma(Fraccion fraccion) {
        Fraccion resultado = new Fraccion(1, 1);

        if (this.denominador == fraccion.denominador) {
            resultado.denominador = this.denominador;
            resultado.numerador = this.numerador + fraccion.numerador;
        } else {
            int mcd = 1;
            int mcm;
            int menorDenominador;

            if (this.denominador < fraccion.denominador) {
                menorDenominador = this.denominador;
            } else {
                menorDenominador = fraccion.denominador;
            }

            for (int i = 1; i <= menorDenominador; i++) {
                if (fraccion.denominador % i == 0 && this.denominador % i == 0) {
                    mcd = i;
                }
            }

            mcm = (this.denominador * fraccion.denominador) / mcd;

            resultado.denominador = mcm;
            resultado.numerador = (this.numerador * (mcm / this.denominador))
                    + (fraccion.numerador * (mcm / fraccion.denominador));
        }
        
        resultado.simplifica();

        return resultado;
    }

    /**
     * Resta la fracción actual con otra fracción.
     * 
     * @param fraccion La fracción con la que se va a restar.
     * @return El resultado de la resta como una nueva fracción.
     */
    public Fraccion resta(Fraccion fraccion) {
        Fraccion resultado = new Fraccion(1, 1);

        if (this.denominador == fraccion.denominador) {
            resultado.denominador = this.denominador;
            resultado.numerador = this.numerador - fraccion.numerador;
        } else {
            int mcd = 1;
            int mcm;
            int menorDenominador;

            if (this.denominador < fraccion.denominador) {
                menorDenominador = this.denominador;
            } else {
                menorDenominador = fraccion.denominador;
            }

            for (int i = 1; i <= menorDenominador; i++) {
                if (fraccion.denominador % i == 0 && this.denominador % i == 0) {
                    mcd = i;
                }
            }

            mcm = (this.denominador * fraccion.denominador) / mcd;

            resultado.denominador = mcm;
            resultado.numerador = (this.numerador * (mcm / this.denominador))
                    - (fraccion.numerador * (mcm / fraccion.denominador));
        }
        
        resultado.simplifica();

        return resultado;
    }

    /**
     * Multiplica la fracción actual con otra fracción.
     * 
     * @param fraccion La fracción con la que se va a multiplicar.
     * @return El resultado de la multiplicación como una nueva fracción.
     */
    public Fraccion multiplica(Fraccion fraccion) {
        Fraccion resultado = new Fraccion(1, 1);
        
        resultado.denominador = this.denominador * fraccion.denominador;
        resultado.numerador = this.numerador * fraccion.numerador;
        
        resultado.simplifica();
        
        return resultado;
    }

    /**
     * Divide la fracción actual con otra fracción.
     * 
     * @param fraccion La fracción con la que se va a dividir.
     * @return El resultado de la división como una nueva fracción.
     */
    public Fraccion divide(Fraccion fraccion) {
        Fraccion resultado = new Fraccion(1, 1);
        
        resultado.numerador = this.numerador * fraccion.denominador;
        resultado.denominador = this.denominador * fraccion.numerador;
        
        resultado.simplifica();
        
        return resultado;
    }

    /**
     * Simplifica la fracción actual.
     */
    public void simplifica() {
        int menorNumero;
        int contador;
        
        menorNumero = (this.denominador < this.numerador ? this.denominador : this.numerador);
        
        contador = (menorNumero > 0 ? menorNumero : menorNumero * -1);
        
        while (contador > 1) {
            if (this.denominador % contador == 0 && this.numerador % contador == 0) {
                this.denominador /= contador;
                this.numerador /= contador;
                menorNumero = (this.denominador < this.numerador ? this.denominador : this.numerador);
                contador = (menorNumero > 0 ? menorNumero : menorNumero * -1);
            } else {
                contador--;
            }
        }
        
        if (this.numerador == 0) {
            this.denominador = 1;
        }
    }
}