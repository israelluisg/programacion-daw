package ejercicio15;

/**
 *
 * Clase que representa un empleado con su dirección.
 * Permite consultar y modificar sus datos.
 * 
 * @author israel
 */
public class Empleado {
    // Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    /**
     * Constructor sin parámetros.
     */
    public Empleado() {
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    
    /**
     * Constructor con parámetros
     * @param nombre valor que se asigna a nombre.
     * @param salario valor que se asigna a salario.
     * @param direccion valor que se asigna a direccion.
     */
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el valor de nombre.
     * @return valor de nombre.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que devuelve el valor de salario.
     * @return valor de salario.
     */
    public int getSalario() {
        return salario;
    }
    
    /**
     * Método que devuelve el valor de direccion.
     * @return valor de direccion.
     */
    public Direccion getDireccion() {
        return direccion;
    }
    
    /**
     * Método que establece un valor a nombre.
     * @param nombre nuevo valor de nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que establece un valor a salario.
     * @param salario nuevo valor de salario.
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    /**
     * Método que establece un valor a direccion.
     * @param direccion nuevo valor de direccion.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Método que devuelve los datos del empleado.
     * @return cadena con los datos del empleado.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nSalario: " + salario
                + "\nDirección:" + direccion;
    }
}