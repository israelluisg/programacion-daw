package ejercicio08;

/**
 *
 * @author israel
 */
public class Numero {
    private int valor;
    
    // Constructor sin parámetros
    public Numero () {
        valor = 0;
    }
    
    // Constructor con parámetros
    public Numero (int valor) {
        this.valor = valor;
    }
    
    // Getters y Setters
    public int getValor () {
        return valor;
    }
    
    public void setValor (int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString () {
        return "Valor : " + valor;
    }
}
