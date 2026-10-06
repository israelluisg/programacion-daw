package ejercicio05;

import java.util.Scanner;
/**
 *
 * Programa que solicita introducir un número al usuario y posteriormente
 * determina si ese número es par o impar y lo muestra por pantalla.
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
        
        System.out.print("Introduzca un número: ");
        numUsuario = entrada.nextInt();
        
        // Condición para determinar si numUsuario es par o impar
        if ((numUsuario % 2) == 0) {
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }
    }
}