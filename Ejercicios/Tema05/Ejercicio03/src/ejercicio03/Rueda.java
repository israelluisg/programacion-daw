package ejercicio03;

/**
 *
 * @author israel
 */
public class Rueda {
    // Atributos
    private String material;
    private int pulgadas;
    
    // Constructores
    public Rueda () {
        material = "";
        pulgadas = 0;
    }
    
    public Rueda (String material, int pulgadas) {
        this.material = material;
        this.pulgadas = pulgadas;
    }
    
    // Setters y getters
    public String obtenerMaterial () {
        return material;
    }
    
    public void establecerMaterial (String material) {
        this.material = material;
    }
    
    public int obtenerPulgadas () {
        return pulgadas;
    }
    
    public void establecerPulgadas (int pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    @Override
    public String toString () {
        return "Material: " + material 
                + ", Pulgadas: " + pulgadas;
    }
}
