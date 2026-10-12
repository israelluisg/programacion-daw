package ejercicio30;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que genera un número aleatorio y pide al usuario que lo adivine
 * indicandole si es mayor o menor.
 * 
 * @author israel
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaro e inicializo las variables
        int numUsuario = 0;
        int intentos = 0;
        int aleatorio = (int) (Math.random() * 100 + 1);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Intente adivinar el número aleatorio: ");
        
        // Creo un bucle que no termina hasta que el usuario adivine el número
        do {
            try {
                numUsuario = entrada.nextInt();

                // Condicional que determina si numUsuario es mayor o menor que aleatorio
                if (numUsuario < aleatorio) {
                    System.out.print("El número es mayor. Inténtalo de nuevo: ");
                } else if (numUsuario > aleatorio) {
                    System.out.print("El número es menor. Inténtalo de nuevo: ");
                }
                
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                entrada.nextLine();
            }
            intentos++;
        } while (numUsuario != aleatorio);
        
        // Se muestra por pantalla el número de intentos en los que el número
        // aleatorio ha sido adivinado
        System.out.println("¡Enhorabuena! El número correcto era "
                + aleatorio + ", lo adivinaste en " + intentos + " intentos.");
    }
}