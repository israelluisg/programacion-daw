package ejercicio22;

/**
 *
 * @author israel
 */
public class Producto {
    // Atributos
    private String nombre;
    private float precio;
    private int stock;
    
    /**
     * Constructor sin parámetros.
     */
    public Producto() {
        nombre = "";
        precio = 0.0f;
        stock = 0;
    }
    
    /**
     * Constructor con parámetros
     * @param nombre nombre inicial del producto.
     * @param precio precio inicial del producto.
     * @param stock  stock inicial del producto.
     */
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el nombre del producto.
     * @return nombre actual.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que devuelve el precio del producto.
     * @return precio actual.
     */
    public float getPrecio() {
        return precio;
    }
    
    /**
     * Método que devuelve el stock del producto.
     * @return stock actual.
     */
    public int getStock() {
        return stock;
    }
    
    /**
     * Método que devuelve los datos del producto.
     * @return String del valor de todos los atributos.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nPrecio: " + precio
                + "\nStock: " + stock;
    }
}