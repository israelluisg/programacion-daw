package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide una nota al usuario y determina su calificación
 * 
 * @author israel
 */
public class Ejercicio06 {
    
    /**
     * Método que determina la calificación de una nota.
     * @param notaUsuario nota a calificar.
     */
    public static void calificar (int notaUsuario) {
        if (notaUsuario < 0 || notaUsuario > 10) {
            System.out.println("Error, introduzca una nota entre 0 y 10.");
        } else {
            if (notaUsuario <= 4) {
                System.out.println("Suspenso.");
            } else if (notaUsuario <= 6) {
                System.out.println("Bien.");
            } else if (notaUsuario <= 8) {
                System.out.println("Notable.");
            } else {
                System.out.println("Sobresaliente.");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable notaUsuario
        int notaUsuario;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        try {
            // Pido al usuario introducir el dato
            System.out.print("Ingrese su nota: ");
            notaUsuario = entrada.nextInt();
            
            // Llamo al método calificar para determinar su calificación
            calificar(notaUsuario);
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
        }
    }

}