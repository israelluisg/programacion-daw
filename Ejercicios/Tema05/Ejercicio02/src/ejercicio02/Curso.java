package ejercicio02;

/**
 *
 * @author israel
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    
    private static int numeroDeCursos;
    
    // Set de nombre y numeroHoras
    public void establecerNombreyHoras (String nom, int num) {
        nombre = nom;
        numeroHoras = num;
    }
}
