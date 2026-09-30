package ejercicio06;

import java.util.Scanner;

/**
 *
 * Programa que determina el estado de una calificación según su valor.
 * 
 * @author israel
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable donde se almacena la nota.
        int notaAlumno;
        
        // Creo el objeto Scanner para leer y almacenar el dato.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca una nota entre 0 y 10: ");
        notaAlumno = entrada.nextInt();
        
        /*
         * Se crean condiciones para determinar el estado de la calificación,
         * si el valor introducido no es el contemplado se mostrará un error.
         */
        if (notaAlumno >= 0 && notaAlumno <= 4){
            System.out.println("Suspenso.");
        } else if (notaAlumno >= 5 && notaAlumno <= 6){
            System.out.println("Bien.");
        } else if (notaAlumno >= 7 && notaAlumno <= 8){
            System.out.println("Notable.");
        } else if (notaAlumno >= 9 && notaAlumno <= 10){
            System.out.println("Sobresaliente.");
        } else {
            System.out.println("Valor introducido incorrecto.");
        }
    }
    
}
