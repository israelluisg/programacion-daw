package ejercicio03;

/**
 *
 * @author israel
 */
public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    
    private Rueda ruedas;
    
    // Constructores
    public Coche () {
        marca = "";
        modelo = "";
        ruedas = new Rueda();
    }
    
    public Coche (String marca, String modelo, Rueda ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = ruedas;
    }
    
    // Getters y setters
    public void establecerMarca (String marca) {
        this.marca = marca;
    }
    
    public void establecerModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public void establecerRueda (Rueda ruedas) {
        this.ruedas = ruedas;
    }
    
    public String obtenerMarca () {
        return marca;
    }
    
    public String obtenerModelo () {
        return modelo;
    }
    
    public Rueda obtenerRueda () {
        return ruedas;
    }
    
    public String toString () {
        return "Marca: " + marca 
                + ", Modelo: " + modelo 
                + ", Ruedas: " + ruedas;
    }
}
