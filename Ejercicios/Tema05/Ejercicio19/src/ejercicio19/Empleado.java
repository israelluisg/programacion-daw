package ejercicio19;

/**
 *
 * Clase que representa un empleado con su nombre,
 * horas trabajadas y tarifa por hora.
 * Permite consultar y modificar sus datos.
 *
 * @author israel
 */
public class Empleado {
    // Atributos
    private String nombre;
    private int horas;
    private double tarifaHora;
    
    /**
     * Constructor sin parámetros.
     */
    public Empleado() {
        nombre = "";
        horas = 0;
        tarifaHora = 0;
    }
    
    /**
     * Constructor con parámetros.
     * @param nombre nombre del empleado.
     * @param horas horas trabajadas.
     * @param tarifaHora tarifa por hora.
     */
    public Empleado(String nombre, int horas, double tarifaHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el nombre del empleado.
     * @return nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que devuelve las horas trabajadas.
     * @return número de horas trabajadas.
     */
    public int getHoras() {
        return horas;
    }
    /**
     * Método que devuelve la tarifa por hora.
     * @return tarifa por hora del empleado.
     */
    public double getTarifaHora() {
        return tarifaHora;
    }
    
    /**
     * Método que establece el nombre del empleado.
     * @param nombre nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que establece las horas trabajadas.
     * @param horas nuevo número de horas.
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * Método que establece la tarifa por hora.
     * @param tarifaHora nueva tarifa por hora.
     */
    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    /**
     * Método que devuelve los datos del empleado.
     * @return cadena con los datos del empleado.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre 
                + ", Horas: " + horas
                + ", Tarifa por hora: " + tarifaHora;
    }
}