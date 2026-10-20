package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * Programa que pide un número al usuario y posteriormente determina y muestra
 * por pantalla si es par o impar.
 * 
 * @author israel
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable numUsuario
        int numUsuario;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        try {
            // Pido al usuario introducir un núemero
            System.out.print("Introduzca un número: ");
            numUsuario = entrada.nextInt();

            // Llamo al método paridad
            Operaciones.paridad(numUsuario);
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
        }
    }

}