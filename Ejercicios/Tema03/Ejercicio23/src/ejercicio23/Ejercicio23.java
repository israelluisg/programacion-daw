
package ejercicio23;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * Programa que pide al usuario introducir un número, posteriormente se
 * muestra por pantalla los números entre 1 y el número del usuario.
 *
 * @author israel
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable numUsuario
        int numUsuario = 0;

        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);

        // Creo un bucle do-while para asegurar que el usuario introduce un
        // número mayor que 1, si no se le muestra un error por pantalla
        do {
            System.out.print("Introduzca un número: ");

            try {
                numUsuario = entrada.nextInt();

                if (numUsuario <= 1) {
                    System.out.println("Error, introduzca un número mayor que 1.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entero.");
                entrada.next();
            }

        } while (numUsuario <= 1);

        // Muestro por pantalla los números entre 1 y numUsuario
        for (int i = 2; i < numUsuario; i++) {
            System.out.println(i);
        }
    }
}
