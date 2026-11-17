package ejercicio02;

/**
 *
 * @author israel
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    
    private static int numeroDeCursos = 0;
    
    // Set de nombre y numeroHoras
    public void establecerNombreyHoras (String nom, int num) {
        nombre = nom;
        numeroHoras = num;
    }
    
    // Get nombre
    public String obtenerNombre () {
        return nombre;
    }
    
    // Get numeroHoras
    public int obtenerHoras () {
        return numeroHoras;
    }
    
    public static void sumarCursos () {
        numeroDeCursos++;
    }
    
    public static int verNumeroCursos () {
        return numeroDeCursos;
    }
}
