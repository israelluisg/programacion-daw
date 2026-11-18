package ejercicio03;

/**
 * Clase que representa un coche mediante su marca, modelo y rueda asociada.
 *
 * @author israel
 */
public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    
    private Rueda ruedas;
    
    // Constructores

    /**
     * Constructor sin parámetros que inicializa la marca y el modelo
     * del coche.
     */
    public Coche () {
        marca = "";
        modelo = "";
    }
    
    /**
     * Constructor parametrizado que inicializa los atributos del coche
     * con los valores recibidos.
     *
     * @param marca Marca del coche.
     * @param modelo Modelo del coche.
     * @param ruedas Objeto Rueda que se asociará al coche.
     */
    public Coche (String marca, String modelo, Rueda ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = ruedas;
    }
    
    // Getters y setters

    /**
     * Establece la marca del coche.
     *
     * @param marca Nueva marca del coche.
     */
    public void establecerMarca (String marca) {
        this.marca = marca;
    }
    
    /**
     * Establece el modelo del coche.
     *
     * @param modelo Nuevo modelo del coche.
     */
    public void establecerModelo (String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Asocia un objeto Rueda al coche.
     *
     * @param ruedas Objeto Rueda que se asociará al coche.
     */
    public void establecerRueda (Rueda ruedas) {
        this.ruedas = ruedas;
    }
    
    /**
     * Obtiene la marca del coche.
     *
     * @return Marca del coche.
     */
    public String obtenerMarca () {
        return marca;
    }
    
    /**
     * Obtiene el modelo del coche.
     *
     * @return Modelo del coche.
     */
    public String obtenerModelo () {
        return modelo;
    }
    
    /**
     * Obtiene el objeto Rueda asociado al coche.
     *
     * @return Objeto Rueda asociado al coche.
     */
    public Rueda obtenerRueda () {
        return ruedas;
    }
    
    /**
     * Devuelve un texto con la marca, el modelo y los datos de la rueda.
     *
     * @return String con la marca, el modelo y los datos de la rueda.
     */
    @Override
    public String toString () {
        return "Marca: " + marca 
                + ", Modelo: " + modelo 
                + ", Rueda: " + ruedas;
    }
}
