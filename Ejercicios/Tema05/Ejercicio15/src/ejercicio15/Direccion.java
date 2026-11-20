package ejercicio15;

/**
 *
 * Clase que representa una dirección.
 * Permite consultar y modificar sus datos.
 * 
 * @author israel
 */
public class Direccion {
    // Atributos
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    
    /**
     * Constructor sin parámetros.
     */
    public Direccion() {
        calle = "";
        numero = 0;
        piso = "";
        ciudad = "";
    }
    
    /**
     * Constructor con parámetros.
     * @param calle valor que se le asigna a calle.
     * @param numero valor que se le asigna a numero.
     * @param piso valor que se le asigna a piso.
     * @param ciudad valor que se le asigna a ciudad.
     */
    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el valor de calle.
     * @return valor de calle.
     */
    public String getCalle() {
        return calle;
    }
    
    /**
     * Método que devuelve el valor de numero.
     * @return valor de numero.
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * Método que devuelve el valor de piso.
     * @return valor de piso.
     */
    public String getPiso() {
        return piso;
    }
    
    /**
     * Método que devuelve el valor de ciudad.
     * @return valor de ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }
    
    /**
     * Método que establece un valor a calle.
     * @param calle nuevo valor de calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    /**
     * Método que establece un valor a numero.
     * @param numero nuevo valor de numero.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Método que establece un valor a piso.
     * @param piso nuevo valor de piso.
     */
    public void setPiso(String piso) {
        this.piso = piso;
    }
    
    /**
     * Método que establece un valor a ciudad.
     * @param ciudad nuevo valor de ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    /**
     * Método que devuelve los datos de la dirección.
     * @return cadena con los datos de la dirección.
     */
    @Override
    public String toString() {
        return "\n\tCalle: " + calle 
                + "\n\tNúmero: " + numero
                + "\n\tPiso: " + piso
                + "\n\tCiudad: " + ciudad;
    }
}