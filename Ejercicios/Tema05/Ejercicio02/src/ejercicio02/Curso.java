package ejercicio02;

/**
 *
 * Clase que representa un curso mediante su nombre y número de horas.
 * Permite establecer y consultar sus características, además de
 * llevar un registro del número de cursos creados.
 *
 * @author israel
 */
public class Curso {
    
    // Declaro los atributos de la clase Curso
    private String nombre;
    private int numeroHoras;
    
    // Inicializo el contador de cursos compartido por todos los objetos
    private static int numeroDeCursos = 0;
    
    /**
     * Método que establece el nombre y el número de horas del curso.
     *
     * @param nom Nombre que se asignará al curso.
     * @param num Número de horas que se asignará al curso.
     */
    public void establecerNombreyHoras (String nom, int num) {
        nombre = nom;
        numeroHoras = num;
    }
    
    /**
     * Método que establece el nombre del curso.
     *
     * @param nom Nuevo nombre del curso.
     */
    public void establecerNombre (String nom) {
        nombre = nom;
    }

    /**
     * Método que establece el número de horas del curso.
     *
     * @param num Nuevo número de horas del curso.
     */
    public void establecerHoras (int num) {
        numeroHoras = num;
    }

    /**
     * Método que obtiene el nombre del curso.
     *
     * @return Nombre del curso.
     */
    public String obtenerNombre () {
        return nombre;
    }
    
    /**
     * Método que obtiene el número de horas del curso.
     *
     * @return Número de horas del curso.
     */
    public int obtenerHoras () {
        return numeroHoras;
    }
    
    /**
     * Método que incrementa en una unidad el número de cursos registrados.
     */
    public static void sumarCursos () {
        numeroDeCursos++;
    }
    
    /**
     * Método que obtiene el número total de cursos registrados.
     *
     * @return Número total de cursos registrados.
     */
    public static int verNumeroCursos () {
        return numeroDeCursos;
    }

    /**
     * Método que establece el número total de cursos registrados.
     *
     * @param num Nuevo número de cursos registrados.
     */
    public static void establecerNumeroDeCursos (int num) {
        numeroDeCursos = num;
    }
}
