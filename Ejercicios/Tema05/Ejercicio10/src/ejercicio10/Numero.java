package ejercicio10;

/**
 * Clase que representa un número entero mediante el atributo valor.
 * Permite consultar y modificar su valor.
 *
 * @author israel
 */
public class Numero {

    // Atributo
    private int valor;

    /**
     * Constructor sin parámetros
     */
    public Numero() {
        valor = 0;
    }

    /**
     * Constructor con parámetros.
     *
     * @param valor Valor entero que se asigna al número.
     */
    public Numero(int valor) {
        this.valor = valor;
    }
    
    // Getters y Setters
    /**
     * Obtiene el valor del número.
     *
     * @return El valor entero del número.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Modifica el valor del número.
     *
     * @param valor Nuevo valor entero del número.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * Método toString
     * @return El valor del número.
     */
    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}
