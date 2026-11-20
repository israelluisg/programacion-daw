package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que solicita las notas de seis asignaturas y calcula
 * la nota media del curso.
 *
 * @author israel
 */
public class Ejercicio05 {
    
    /**
     * Método que solicita una nota y valida que sea numérica.
     * @return nota introducida.
     */
    public static double pedirNota () {
        Scanner entrada = new Scanner(System.in);
        
        double nota = 0;
        boolean validar;
        
        do {
            try {
                nota = entrada.nextDouble();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número válido: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return nota;
    }
    
    /**
     * Método que muestra un mensaje y asigna una nota a una asignatura.
     * @param asignatura asignatura a la que se asigna la nota.
     * @param mensaje mensaje que se muestra por pantalla.
     */
    public static void asignarNota (Asignatura asignatura, String mensaje) {
        System.out.print(mensaje);
        asignatura.setNota(pedirNota());
    }

    /**
     * Método que calcula la media de seis notas.
     * @param nota1 primera nota.
     * @param nota2 segunda nota.
     * @param nota3 tercera nota.
     * @param nota4 cuarta nota.
     * @param nota5 quinta nota.
     * @param nota6 sexta nota.
     * @return media de las seis notas.
     */
    public static double hacerNotaMedia (double nota1, double nota2,
            double nota3, double nota4, double nota5, double nota6) {
        
        return (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura prog = new Asignatura("Programación");
        Asignatura lmsgi = new Asignatura("Lenguajes de Marcas");
        Asignatura bd = new Asignatura("Bases de Datos");
        Asignatura ed = new Asignatura("Entornos de Desarrollo");
        Asignatura si = new Asignatura("Sistemas Informáticos");
        Asignatura fold = new Asignatura("Formación y Orientación Laboral");
        
        asignarNota(prog, "Por favor, introduzca la nota de Programación: ");
        asignarNota(lmsgi, "Introduzca la nota de Lenguajes de Marcas: ");
        asignarNota(bd, "Introduzca la nota de Bases de Datos: ");
        asignarNota(ed, "Introduzca la nota de Entornos de Desarrollo: ");
        asignarNota(si, "Introduzca la nota de Sistemas Informáticos: ");
        asignarNota(fold, "Por último, introduzca la nota de Formación y Orientación Laboral: ");
        
        System.out.println("Su nota media del curso es de: "
                + hacerNotaMedia(prog.getNota(), lmsgi.getNota(), 
                        bd.getNota(), ed.getNota(), si.getNota(),
                        fold.getNota()));
    }
}