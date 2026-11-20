package ejercicio05;

/**
 *
 * Clase que representa una asignatura mediante su nombre y nota.
 * Permite consultar y modificar sus datos.
 *
 * @author israel
 */
public class Asignatura {
    // Atributos
    private String nombre;
    private double nota;
    
    /**
     * Constructor sin parámetros.
     */
    public Asignatura () {
        nombre = "";
        nota = 0;
    }
    
    /**
     * Constructor que recibe el nombre de la asignatura.
     * @param nombre nombre de la asignatura.
     */
    public Asignatura (String nombre) {
        this.nombre = nombre;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el valor de nombre.
     * @return valor de nombre.
     */
    public String getNombre () {
        return nombre;
    }
    
    /**
     * Método que devuelve el valor de nota.
     * @return valor de nota.
     */
    public double getNota () {
        return nota;
    }
    
    /**
     * Método que establece un valor a nombre.
     * @param nombre nuevo valor de nombre.
     */
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que establece un valor a nota.
     * @param nota nuevo valor de nota.
     */
    public void setNota (double nota) {
        this.nota = nota;
    }
    
    /**
     * Método que devuelve los datos de la asignatura.
     * @return cadena con los datos de la asignatura.
     */
    @Override
    public String toString () {
        return "Nombre: " + nombre 
                + ", Nota: " + nota;
    }
}
