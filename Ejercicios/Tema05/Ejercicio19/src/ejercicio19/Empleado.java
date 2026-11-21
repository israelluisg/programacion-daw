package ejercicio19;

/**
 *
 * @author israel
 */
public class Empleado {
    // Atributos
    private String nombre;
    private int horas;
    private int tarifaHora;
    
    /**
     * 
     */
    public Empleado() {
        nombre = "";
        horas = 0;
        tarifaHora = 0;
    }
    
    /**
     * 
     * @param nombre
     * @param horas
     * @param tarifaHora 
     */
    public Empleado(String nombre, int horas, int tarifaHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }
    
    // Getters y Setters
    
    public String getNombre() {
        return nombre;
    }
    public int getHoras() {
        return horas;
    }
    public int getTarifaHora() {
        return tarifaHora;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre 
                + ", Horas: " + horas
                + ", Tarifa por hora: " + tarifaHora;
    }
}