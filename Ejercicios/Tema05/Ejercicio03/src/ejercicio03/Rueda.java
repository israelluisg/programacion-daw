package ejercicio03;

/**
 * Clase que representa una rueda mediante su material y tamaño en pulgadas.
 *
 * @author israel
 */
public class Rueda {
    // Atributos
    private String material;
    private int pulgadas;
    
    // Constructores
    
    /**
     * Constructor sin parámetros que inicializa los atributos de la rueda.
     */
    public Rueda () {
        material = "";
        pulgadas = 0;
    }
    
    /**
     * Constructor parametrizado que inicializa los atributos de la rueda
     * con los valores recibidos.
     *
     * @param material Material de la rueda.
     * @param pulgadas Tamaño de la rueda en pulgadas.
     */
    public Rueda (String material, int pulgadas) {
        this.material = material;
        this.pulgadas = pulgadas;
    }
    
    // Setters y getters
    
    /**
     * Obtiene el material de la rueda.
     *
     * @return Material de la rueda.
     */
    public String obtenerMaterial () {
        return material;
    }
    
    /**
     * Establece el material de la rueda.
     *
     * @param material Nuevo material de la rueda.
     */
    public void establecerMaterial (String material) {
        this.material = material;
    }
    
    /**
     * Obtiene el tamaño de la rueda en pulgadas.
     *
     * @return Tamaño de la rueda en pulgadas.
     */
    public int obtenerPulgadas () {
        return pulgadas;
    }
    
    /**
     * Establece el tamaño de la rueda en pulgadas.
     *
     * @param pulgadas Nuevo tamaño de la rueda en pulgadas.
     */
    public void establecerPulgadas (int pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    /**
     * Devuelve un texto con el material y las pulgadas de la rueda.
     *
     * @return String con el material y el tamaño de la rueda en pulgadas.
     */
    @Override
    public String toString () {
        return "Material: " + material 
                + ", Pulgadas: " + pulgadas;
    }
}
