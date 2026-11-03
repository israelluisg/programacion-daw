package ejercicio26;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que pide introducir un número al usuario y posteriormente determina
 * si el número es primo o no y lo muestra por pantalla.
 * 
 * @author israel
 */
public class Ejercicio26 {
    
    /**
     * Método que pide al usuario introducir un número.
     * @return Devuelve el número introducido por el usuario.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner (System.in);
        // Inicializo la variable validar para controlar que el usuario introduzca un entero.
        boolean validar = true;
        int numUsuario = 0;
        
        do {
            try {
                System.out.print("Introduzca un número: ");
                numUsuario = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un entero.");
                entrada.nextLine();
            }
        } while (validar);
        
        return numUsuario;
    }
    
    /**
     * Método que determina si el número introducido por el usuario es primo
     * o no.
     * @param numUsuario Número introducido por el usuario.
     * @return Devuelve un booleano determinando si es primo o no.
     */
    public static boolean esPrimo (int numUsuario) {   
        int i = 2;
        boolean esPrimo = true;
        if (numUsuario <= 1) {
            return !esPrimo;
        }
        
        while (i < numUsuario && esPrimo) {
            if ((numUsuario % i) == 0) {
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
    }
    
    /**
     * Método que interpreta si el número introducido por el usuario es primo
     * o no y muestra por pantalla el resultado.
     * @param esPrimo Booleano que indica si el número introducido es primo o no.
     */
    public static void interpretarResultado (boolean esPrimo) {
        if (esPrimo) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        interpretarResultado(esPrimo(pedirNumero()));
    }
}