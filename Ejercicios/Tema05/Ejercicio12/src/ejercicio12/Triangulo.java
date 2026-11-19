package ejercicio12;

/**
 *
 * Clase que representa los dos catetos de un triángulo.
 * 
 * @author israel
 */
public class Triangulo {
    // Atributos
    private double cateto1;
    private double cateto2;
    
    /**
     * Constructor sin parámetros
     */
    public Triangulo() {
        cateto1 = 0;
        cateto2 = 0;
    }
    
    /**
     * Constructor con parámetros.
     * @param cateto1 valor de cateto1.
     * @param cateto2 valor de cateto2.
     */
    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    // Getters y Setters
    
    /**
     * Método get de cateto1.
     * @return Devuelve el valor de cateto1.
     */
    public double getCateto1() {
        return cateto1;
    }
    
    /**
     * Método get de cateto2.
     * @return Devuelve el valor de cateto2.
     */
    public double getCateto2() {
        return cateto2;
    }
    
    /**
     * Método set de cateto1.
     * @param cateto1 Valor a asignar a cateto1.
     */
    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }
    
    /**
     * Método set de cateto2.
     * @param cateto2 Valor a asignar a cateto2.
     */
    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    
    /**
     * Método toString.
     * @return Devuelve un string con todos los datos del objeto.
     */
    @Override
    public String toString() {
        return "Cateto1: " + cateto1 
                + ", Cateto2: " + cateto2;
    }
}