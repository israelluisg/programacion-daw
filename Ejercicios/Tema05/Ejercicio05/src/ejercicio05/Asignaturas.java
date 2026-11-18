package ejercicio05;

/**
 *
 * @author israel
 */
public class Asignaturas {
    // Atributos
    private String nombre;
    private double nota;
    
    // Constructor sin parámetros
    public Asignaturas () {
        nombre = "";
        nota = 0;
    }
    
    // Constructor con parámetros
    public Asignaturas (String nombre) {
        this.nombre = nombre;
    }
    
    // Getters y Setters
    
    public String getNombre () {
        return nombre;
    }
    
    public double getNota () {
        return nota;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public void setNota (double nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString () {
        return "Nombre: " + nombre 
                + ", Nota: " + nota;
    }
}
