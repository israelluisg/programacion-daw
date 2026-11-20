package ejercicio09;

/**
 *
 * Clase que representa un número entero mediante el atributo valor.
 * Permite consultar y modificar su valor.
 * 
 * @author israel
 */
public class Numero {
    // Atributos
    private int valor;
    
    /**
     * Constructor sin parámetros.
     */
    public Numero() {
        valor = 0;
    }
    
    /**
     * Constructor con parámetros.
     * @param valor Número introducido para cambiar valor.
     */
    public Numero(int valor) {
        this.valor = valor;
    }
    
    // Getters y Setters
    
    /**
     * Método get de valor.
     * @return devuelve valor.
     */
    public int getValor() {
        return valor;
    }
    
    /**
     * Método set de valor.
     * @param valor nuevo int que se establece a valor.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * Método toString.
     * @return devuelve string con los datos.
     */
    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}