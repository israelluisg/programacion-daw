package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide introducir al usuario dos números, dependiendo si el
 * primero es mayor o menor de 10 se multiplica o se suma ambos números y se
 * muestra por pantalla.
 * 
 * @author israel
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables num1 y num2
        int num1, num2;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        // Pido los datos al usuario
        try {
            System.out.print("Introduzca el primer número: ");
            num1 = entrada.nextInt();

            System.out.print("Introduzca el segundo número: ");
            num2 = entrada.nextInt();

            // Creo la condición para determinar si multiplicar o sumar
            if (num1 > 10) {
                Operaciones.multiplicar(num1, num2);
            } else {
                Operaciones.sumar(num1, num2);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
        }
    }
}