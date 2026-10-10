
package ejercicio24;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * Programa que muestra los múltiplos de 3 entre 1 y un número
 * introducido por el usuario, indicando la cantidad mostrada.
 *
 * @author israel
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables numUsuario y cantidad
        int numUsuario = 0;
        int cantidad = 0;

        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);

        // Pido al usuario un número mayor que 0
        do {
            System.out.print("Introduzca un número: ");

            try {
                numUsuario = entrada.nextInt();

                if (numUsuario <= 0) {
                    System.out.println("Error, introduzca un número mayor que 0.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entero.");
                entrada.next();
            }

        } while (numUsuario <= 0);

        // Muestro los múltiplos de 3 y cuento los números mostrados
        for (int i = 1; i * 3 < numUsuario; i++) {
            System.out.println(3 * i);
            cantidad++;
        }

        // Muestro la cantidad total de números
        System.out.println("Se han mostrado " + cantidad + " números.");
    }
}
