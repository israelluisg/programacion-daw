
package ejercicio21;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * Programa que pide dos datos al usuario para realizar una división, en caso
 * de que el divisor sea 0 se le mostrará un error al usuario.
 *
 * @author israel
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables dividendo y divisor
        int dividendo, divisor;

        // Creo el objeto Scanner para registrar la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        try {
            // Pido los datos al usuario
            System.out.print("Introduzca el dividendo: ");
            dividendo = entrada.nextInt();

            System.out.print("Introduzca el divisor: ");
            divisor = entrada.nextInt();

            // Muestro por pantalla el resultado de la división
            System.out.println("El resultado de la división de " + dividendo
                    + " entre " + divisor + " es " + (dividendo / divisor));

        } catch (ArithmeticException e) {
            // Muestro un error si se intenta dividir entre cero
            System.out.println("Error, no se puede dividir entre cero.");

        } catch (InputMismatchException e) {
            // Muestro un error si se introduce un dato no válido
            System.out.println("Error, debe introducir números enteros.");
        }
    }
}
