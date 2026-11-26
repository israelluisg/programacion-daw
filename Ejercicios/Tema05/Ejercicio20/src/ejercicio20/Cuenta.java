package ejercicio20;

/**
 *
 * Clase que representa una cuenta bancaria con su saldo. Permite consultar el
 * saldo, ingresar y extraer dinero.
 *
 * @author israel
 */
public class Cuenta {

    // Atributos
    private float saldo;

    /**
     * Constructor sin parámetros.
     */
    public Cuenta() {
        saldo = 0;
    }

    /**
     * Constructor con parámetros.
     *
     * @param saldo saldo inicial de la cuenta.
     */
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    // Getters y Setters
    /**
     * Método que devuelve el saldo de la cuenta.
     *
     * @return saldo actual.
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el saldo de la cuenta.
     *
     * @param saldo nuevo saldo de la cuenta.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Otros métodos
    /**
     * Método que ingresa dinero en la cuenta.
     *
     * @param c cantidad que se ingresa.
     */
    public void ingresar(float c) {
        saldo += c;
    }

    /**
     * Método que extrae dinero de la cuenta. Permite que el saldo quede en
     * negativo.
     *
     * @param c cantidad que se extrae.
     */
    public void extraer(float c) {
        saldo -= c;
    }

    /**
     * Método que devuelve los datos de la cuenta.
     *
     * @return cadena con el saldo de la cuenta.
     */
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
}
