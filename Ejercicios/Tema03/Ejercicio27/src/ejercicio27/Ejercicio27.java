
package ejercicio27;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que permite realizar diferentes operaciones aritméticas con dos
 * números introducidos por el usuario mediante un menú de opciones.
 *
 * @author israel
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro e inicializo las variables
        int num1 = 0, num2 = 0, eleccion = 0;
        boolean numerosValidos = false;

        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);

        // Pido los números hasta que sean válidos
        do {
            try {
                System.out.print("Introduzca el primer número: ");
                num1 = entrada.nextInt();

                System.out.print("Introduzca el segundo número: ");
                num2 = entrada.nextInt();

                numerosValidos = true;

            } catch (InputMismatchException e) {
                // Muestro un error si se introduce un dato no válido
                System.out.println("Error, introduzca un número entero.");
                entrada.next();
            }
        } while (!numerosValidos);

        // Muestro el menú hasta que el usuario elija salir
        do {
            try {
                System.out.println("\nElija una de las siguientes opciones:");
                System.out.println("1.- Sumar los números.");
                System.out.println("2.- Restar los números.");
                System.out.println("3.- Multiplicar los números.");
                System.out.println("4.- Dividir los números.");
                System.out.println("5.- Salir del programa.");

                eleccion = entrada.nextInt();

                // Realizo la operación seleccionada por el usuario
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("La suma entre " + num1 + " y "
                                + num2 + " es " + (num1 + num2));
                    }
                    case 2 -> {
                        System.out.println("La resta entre " + num1 + " y "
                                + num2 + " es " + (num1 - num2));
                    }
                    case 3 -> {
                        System.out.println("La multiplicación entre " + num1 
                                + " y " + num2 + " es " + (num1 * num2));
                    }
                    case 4 -> {
                        System.out.println("La división entre " + num1 + " y "
                                + num2 + " es " + (num1 / num2));
                    }
                    case 5 -> {
                        System.out.println("Saliendo del programa.");
                    }
                    default -> {
                        System.out.println("Error, introduzca una opción válida.");
                    }
                }

            } catch (InputMismatchException e) {
                // Muestro un error si la opción introducida no es un entero
                System.out.println("Error, introduzca una opción válida.");
                entrada.next();

            } catch (ArithmeticException e) {
                // Capturo el error si se intenta dividir entre cero
                System.out.println("Error, no se puede dividir entre cero.");
            }

        } while (eleccion != 5);
    }
}
