package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio05 {
    
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
    
    public static double hacerNotaMedia (Asignaturas asignatura1, 
            Asignaturas asignatura2, Asignaturas asignatura3, 
            Asignaturas asignatura4, Asignaturas asignatura5, 
            Asignaturas asignatura6) {
        
        return ((asignatura1.getNota()) + asignatura2.getNota() 
                + asignatura3.getNota() + asignatura4.getNota() 
                + asignatura5.getNota() + asignatura6.getNota()) / 6;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignaturas prog = new Asignaturas("Programación");
        Asignaturas lmsgi = new Asignaturas("Lenguajes de Marcas");
        Asignaturas bd = new Asignaturas("Bases de Datos");
        Asignaturas ed = new Asignaturas("Entornos de Desarrollo");
        Asignaturas si = new Asignaturas("Sistemas Informáticos");
        Asignaturas fold = new Asignaturas("Formación y Orientación Laboral");
        
        System.out.print("Por favor, introduzca la nota de Programación: ");
        prog.setNota(pedirNota());
        
        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        lmsgi.setNota(pedirNota());
        
        System.out.print("Introduzca la nota de Bases de Datos: ");
        bd.setNota(pedirNota());
        
        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        ed.setNota(pedirNota());
        
        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        si.setNota(pedirNota());
        
        System.out.print("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        fold.setNota(pedirNota());
        
        System.out.println(hacerNotaMedia(prog, lmsgi, bd, ed, si, fold));
    }
}