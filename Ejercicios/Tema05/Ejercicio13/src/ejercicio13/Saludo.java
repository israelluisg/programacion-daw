package ejercicio13;

/**
 *
 * Clase que representa un saludo.
 * Permite obtener el valor del atributo frase y establecerle un valor.
 * 
 * @author israel
 */
public class Saludo {
    // Atributos
    private String frase;
    
    /**
     * Constructor sin parámetros.
     */
    public Saludo() {
        frase = "";
    }
    
    /**
     * Constructor con parámetros
     * @param frase valor que se le asigna a frase.
     */
    public Saludo(String frase) {
        this.frase = frase;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el valor de frase.
     * @return devuelve el valor de frase.
     */
    public String getFrase() {
        return frase;
    }
    
    /**
     * Método que establece un valor a frase.
     * @param frase valor que se le asignará a frase.
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    /**
     * Método que devuelve el valor de los atributos.
     * @return Devuelve el valor de los atributos.
     */
    @Override
    public String toString() {
        return "Frase: " + frase;
    }
}