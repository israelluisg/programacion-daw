package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que ordena los números introducidos por el usuario de menor a mayor.
 * 
 * @author israel
 */
public class Ejercicio07 {
    
    /**
     * Método que registra la entrada del usuario.
     * @return la entrada del usuario.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método que ordena de menor a mayor los números introducidos.
     * @param num1 primer número.
     * @param num2 segundo número.
     * @param num3 tercer número.
     * @param num4 cuarto número.
     * @param aux variable auxiliar para intercambiar variables.
     */
    public static void ordenarMayor (int num1, int num2, int num3, int num4) {
        int aux;
        do {
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            } if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            } if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        } while (num1 > num2 || num2 > num3 || num3 > num4);
        
        System.out.println("El orden de los números introducidos es el " 
                + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables num1, num2, num3 y num4
        int num1, num2, num3, num4;
        
        // Pido al usuario introducir los datos llamando al método pedirNumero
        try {
            System.out.print("Introduzca el primer número: ");
            num1 = pedirNumero();

            System.out.print("Ahora, introduzca el segundo número: ");
            num2 = pedirNumero();

            System.out.print("Introduzca el tercer número: ");
            num3 = pedirNumero();

            System.out.print("Por úlitmo, introduzca el cuarto número: ");
            num4 = pedirNumero();

            // Llamo al método ordenarMayor para determinar el orden de menor a mayor
            ordenarMayor(num1, num2, num3, num4);
            
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
        }
    }

}