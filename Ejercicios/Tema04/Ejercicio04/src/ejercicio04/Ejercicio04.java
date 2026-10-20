package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que pide 3 números al usuario y muestra el menor por pantalla.
 * 
 * @author israel
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables num1, num2 y num3
        int num1, num2, num3;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        // Pido los datos al usuario
        try {
            System.out.print("Por favor, introduzca el primer número: ");
            num1 = entrada.nextInt();

            System.out.print("Ahora, introduzca un segundo número: ");
            num2 = entrada.nextInt();

            System.out.print("Por último, introduzca un tercer número: ");
            num3 = entrada.nextInt();

            // Llamo al método numeroMenor para determinar el menor de los 3
            Operaciones.numeroMenor(num1, num2, num3);
            
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
        }
        
    }
}