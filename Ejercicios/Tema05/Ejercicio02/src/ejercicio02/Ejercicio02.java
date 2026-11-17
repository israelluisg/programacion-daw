package ejercicio02;

/**
 *
 * @author israel
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso ();
        curso1.establecerNombreyHoras("curso1", 1);
        Curso.sumarCursos();
        
        Curso curso2 = new Curso ();
        curso2.establecerNombreyHoras("curso2", 2);
        Curso.sumarCursos();
        
        System.out.println(curso1.obtenerHoras());
        System.out.println(curso1.obtenerNombre());
        
        System.out.println("");
        
        System.out.println(curso2.obtenerHoras());
        System.out.println(curso2.obtenerNombre());
        
        System.out.println("");
        
        Curso.verNumeroCursos();
    }
}