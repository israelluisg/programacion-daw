package pruebat03;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author israel
 */
public class ControlDeExcepciones {
    public static void main(String[] args) {
        int edad;
        // Pedir un dato
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad:");
        
        try {
//          int edad = entrada.nextInt(); // Variable local en try
            edad = entrada.nextInt();
            
            // Mostrar ese dato
            System.out.println("Tu edad es " + edad);
   
        } catch (InputMismatchException e) {
            System.out.println("Dato no válido; debes introducir un número entero.");
        } finally {
            System.out.println("Dato pedido al usuario.");
        }
        
    }   
}
