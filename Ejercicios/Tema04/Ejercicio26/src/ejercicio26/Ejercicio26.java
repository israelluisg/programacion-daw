package ejercicio26;

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
     * @return devuelve el número introducido por el usuario.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que determina si el número introducido por el usuario es primo
     * o no.
     * @param numUsuario Número introducido por el usuario.
     * @return Devuelve un booleano determinando si es primo o no.
     */
    public static boolean esPrimo (int numUsuario) {   
        if (numUsuario <= 1) {
            return false;
        }
        for (int i = 2; i < numUsuario; i++) {
            if ((numUsuario % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método que interpreta si el número introducido por el usuario era primo
     * o no y muestra por pantalla el resultado.
     * @param validar Booleano que se determina en el método esPrimo.
     */
    public static void interpretarResultado (boolean validar) {
        if (validar) {
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