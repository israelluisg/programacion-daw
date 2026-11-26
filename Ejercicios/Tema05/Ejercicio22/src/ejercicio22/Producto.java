package ejercicio22;

/**
 *
 * Clase que representa un producto de una tienda con su nombre, precio y stock.
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
     * Constructor con parámetros.
     *
     * @param nombre nombre inicial del producto.
     * @param precio precio inicial del producto.
     * @param stock stock inicial del producto.
     */
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters

    /**
     * Método que devuelve el nombre del producto.
     *
     * @return nombre actual.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el precio del producto.
     *
     * @return precio actual.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Método que devuelve el stock del producto.
     *
     * @return stock actual.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método que establece el nombre del producto.
     *
     * @param nombre nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que establece el precio del producto.
     *
     * @param precio nuevo precio del producto.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Método que establece el stock del producto.
     *
     * @param stock nuevo stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Otros métodos

    /**
     * Método que comprueba si hay stock suficiente para la compra.
     *
     * @param unidadesCompra unidades que se desean comprar.
     * @return true si la cantidad es positiva y hay stock suficiente.
     */
    public boolean verificarStock(int unidadesCompra) {
        return unidadesCompra > 0 && unidadesCompra <= stock;
    }

    /**
     * Método que reduce el stock del producto. La cantidad debe haberse
     * comprobado previamente.
     *
     * @param unidadesCompra unidades compradas.
     */
    public void reducirStock(int unidadesCompra) {
        stock -= unidadesCompra;
    }

    /**
     * Método que devuelve los datos del producto.
     *
     * @return cadena con los datos del producto.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nPrecio: " + precio
                + "\nStock: " + stock;
    }
}
