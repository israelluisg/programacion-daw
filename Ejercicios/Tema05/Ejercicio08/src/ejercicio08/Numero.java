package ejercicio08;

/**
 *
 * Clase que representa un número entero mediante su valor.
 * Permite consultar y modificar su valor.
 *
 * @author israel
 */
public class Numero {
    private int valor;
    
    /**
     * Constructor sin parámetros.
     */
    public Numero() {
        valor = 0;
    }
    
    /**
     * Constructor que recibe el valor del número.
     * @param valor valor inicial del número.
     */
    public Numero(int valor) {
        this.valor = valor;
    }
    
    // Getters y Setters

    /**
     * Método que devuelve el valor del número.
     * @return valor del número.
     */
    public int getValor () {
        return valor;
    }
    
    /**
     * Método que establece el valor del número.
     * @param valor nuevo valor del número.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * Método que devuelve los datos del número.
     * @return cadena con los datos del número.
     */
    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}
