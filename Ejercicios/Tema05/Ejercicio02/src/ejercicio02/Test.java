
package ejercicio02;

/**
 *
 * Programa que crea dos objetos de la clase Curso, establece sus
 * características, muestra sus datos y el número total de cursos creados.
 *
 * @author israel
 */
public class Test {

    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        
        // Creo el objeto curso1 de la clase Curso
        Curso curso1 = new Curso ();
        
        // Establezco las características de curso1
        curso1.establecerNombreyHoras("Programación Java", 120);
        
        // Incremento el número de cursos creados
        Curso.sumarCursos();
        
        // Creo el objeto curso2 de la clase Curso
        Curso curso2 = new Curso ();
        
        // Establezco las características de curso2
        curso2.establecerNombreyHoras("Desarrollo Web", 80);
        
        // Incremento el número de cursos creados
        Curso.sumarCursos();
        
        // Muestro los datos de curso1
        System.out.println("Nombre: " + curso1.obtenerNombre());
        System.out.println("Número de horas: " + curso1.obtenerHoras());
        
        System.out.println();
        
        // Muestro los datos de curso2
        System.out.println("Nombre: " + curso2.obtenerNombre());
        System.out.println("Número de horas: " + curso2.obtenerHoras());
        
        System.out.println();
        
        // Muestro el número total de cursos creados
        System.out.println("Número de cursos creados: " + Curso.verNumeroCursos());
    }
}
