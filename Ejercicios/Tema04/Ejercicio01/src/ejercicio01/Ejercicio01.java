package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio01 {
    
    /**
     * Método que verifica si el número introducido por el usuario es positivo, 
     * negativo o igual a cero y lo muestra por pantalla.
     * @param numUsuario 
     */
    public static void signo (int numUsuario) {
        
        if (numUsuario < 0) {
            System.out.println("El número introducido es impar.");
        } else if (numUsuario > 0) {
            System.out.println("El número introducido es par");
        } else if (numUsuario == 0) {
            System.out.println("El número introducido es neutro.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la varuable numUsuario
        int numUsuario;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        try {
            // Pido al usuario introducir un número
            System.out.print("Introduzca un número: ");
            numUsuario = entrada.nextInt();
            
            // Llamo al método signo
            signo(numUsuario);
            
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
        }
        
    }
}