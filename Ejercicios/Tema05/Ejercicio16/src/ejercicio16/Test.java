package ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que crea tres alumnos, solicita sus nombres y notas
 * y muestra sus calificaciones.
 *
 * @author israel
 */
public class Test {
    
    /**
     * Método que solicita y valida una nota entera entre 0 y 10.
     * @return nota entera introducida.
     */
    public static int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        
        int nota = 0;
        boolean validar;
        
        System.out.print("Introduzca la nota del alumno: ");
        
        do {
            try {
                nota = entrada.nextInt();
                
                if (nota < 0 || nota > 10) {
                    System.out.print("Error, introduzca un número entre 0 y 10: ");
                    validar = true;
                } else {
                    validar = false;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return nota;
    }
    
    /**
     * Método que solicita el nombre de un alumno.
     * @return nombre introducido.
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el nombre del alumno: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que muestra un encabezado y crea un objeto Alumno
     * con los datos introducidos.
     * @param frase encabezado que se muestra por pantalla.
     * @return objeto Alumno creado.
     */
    public static Alumno crearAlumno(String frase) {
        System.out.println(frase);
        return new Alumno(pedirNombre(), pedirNota());
    }
    
    /**
     * Método que determina y muestra la calificación de un alumno
     * según su nota.
     * @param alumno objeto Alumno que se va a calificar.
     */
    public static void calificarNota(Alumno alumno) {
        String calificacion;
        
        switch (alumno.getNota()) {
            case 0, 1, 2, 3, 4 -> calificacion = "Suspenso";
            case 5, 6 -> calificacion = "Bien";
            case 7, 8 -> calificacion = "Notable";
            case 9, 10 -> calificacion = "Sobresaliente";
            default -> calificacion = "Nota inválida";
        }
        
        System.out.println("La calificación de " + alumno.getNombre() 
                + " es: " + calificacion);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calificarNota(crearAlumno("---- ALUMNO 1 ----"));
        calificarNota(crearAlumno("\n---- ALUMNO 2 ----"));
        calificarNota(crearAlumno("\n---- ALUMNO 3 ----"));
    }

}