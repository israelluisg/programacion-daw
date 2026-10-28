package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Ejercicio26 {
    
    public static int pedirNumero () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    public static boolean esPrimo (int numUsuario) {        
        for (int i = 2; i < numUsuario; i++) {
            if ((numUsuario % 1) == 0 && (numUsuario % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
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