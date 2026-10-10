
package ejercicio22;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * Programa que pide dos datos al usuario para realizar una suma, en caso
 * de que un dato no sea un entero se le mostrará un error al usuario.
 *
 * @author israel
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables num1 y num2
        int num1, num2;

        // Creo el objeto Scanner para registrar la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Creo un try en caso de no introducir el valor correcto
        try {
            // Pido al usuario introducir los datos
            System.out.print("Introduzca el primer número: ");
            num1 = entrada.nextInt();

            System.out.print("Introduzca el segundo número: ");
            num2 = entrada.nextInt();

            // Se muestra por pantalla la suma de los datos introducidos
            System.out.println("El resultado de la suma de " + num1
                    + " más " + num2 + " es " + (num1 + num2));

        } catch (InputMismatchException e) {
            // Este error se muestra en caso de datos introducidos inválidos
            System.out.println("Error, debe introducir un número entero.");
        }
    }
}
