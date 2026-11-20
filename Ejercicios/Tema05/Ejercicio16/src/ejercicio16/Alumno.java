package ejercicio16;

/**
 *
 * Clase que representa un alumno mediante su nombre y nota.
 * Permite consultar y modificar sus datos.
 *
 * @author israel
 */
public class Alumno {
    // Atributos
    private String nombre;
    private int nota;
    
    /**
     * Constructor sin parámetros.
     */
    public Alumno() {
        nombre = "";
        nota = 0;
    }
    
    /**
     * Constructor con parámetros.
     * @param nombre valor que se asigna a nombre.
     * @param nota valor que se asigna a nota.
     */
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
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
     * Método que devuelve el valor de nota.
     * @return valor de nota.
     */
    public int getNota() {
        return nota;
    }
    
    /**
     * Método que establece un valor a nombre.
     * @param nombre nuevo valor de nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que establece un valor a nota.
     * @param nota nuevo valor de nota.
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    /**
     * Método que devuelve los datos del alumno.
     * @return cadena con los datos del alumno.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre 
                + ", Nota: " + nota;
    }
}