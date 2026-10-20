package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide un número al usuario y posteriormente muestra por pantalla
 * si ese número es positivo, negativo o cero.
 * 
 * @author israel
 */
public class Ejercicio01 {
    
    /**
     * Método que verifica si el número introducido por el usuario es positivo, 
     * negativo o igual a cero y lo muestra por pantalla.
     * @param numUsuario número introducido por el usuario.
     */
    public static void signo (int numUsuario) {
        
        if (numUsuario < 0) {
            System.out.println("El número introducido es negativo.");
        } else if (numUsuario > 0) {
            System.out.println("El número introducido es positivo.");
        } else {
            System.out.println("El número introducido es cero.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable numUsuario
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