package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que solicita un número entero y muestra si es par o impar.
 *
 * @author israel
 */
public class Test {
    
    /**
     * Método que solicita y valida un número entero.
     * @return número entero introducido.
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        
        int numUsuario = 0;
        boolean validar;
        
        do {
            try {
                numUsuario = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return numUsuario;
    }
    
    /**
     * Método que comprueba y muestra si un número es par o impar.
     * @param numero objeto Numero que se va a comprobar.
     */
    public static void comprobarParImpar(Numero numero) {
        int valor = numero.getValor();
        
        if ((valor % 2) == 0) {
            System.out.println("El número " + valor + " es par.");
        } else {
            System.out.println("El número " + valor + " es impar.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int valor = pedirNumero();
        
        Numero numero = new Numero(valor);
        
        comprobarParImpar(numero);
    }
}