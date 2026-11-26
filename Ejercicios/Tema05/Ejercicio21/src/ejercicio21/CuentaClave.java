package ejercicio21;

/**
 *
 * Clase que representa una cuenta bancaria con clave. Solo permite extraer
 * dinero si hay saldo suficiente.
 *
 * @author israel
 */
public class CuentaClave extends Cuenta {

    // Atributos
    private String clave;

    /**
     * Constructor sin parámetros.
     */
    public CuentaClave() {
        super();
        clave = "";
    }

    /**
     * Constructor con parámetros.
     *
     * @param saldo saldo inicial de la cuenta.
     * @param clave clave de la cuenta.
     */
    public CuentaClave(float saldo, String clave) {
        super(saldo);
        this.clave = clave;
    }

    // Getters y Setters
    /**
     * Método que devuelve la clave de la cuenta.
     *
     * @return clave de la cuenta.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Método que establece la clave de la cuenta.
     *
     * @param clave nueva clave de la cuenta.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    // Otros métodos
    /**
     * Método que extrae dinero de la cuenta si hay saldo suficiente.
     * Si no hay saldo suficiente, no realiza la extracción ni muestra avisos.
     *
     * @param c cantidad que se extrae.
     */
    @Override
    public void extraer(float c) {
        if (c <= getSaldo()) {
            super.extraer(c);
        }
    }

    /**
     * Método que devuelve los datos de la cuenta.
     *
     * @return cadena con el saldo y la clave de la cuenta.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Clave: " + clave;
    }
}
