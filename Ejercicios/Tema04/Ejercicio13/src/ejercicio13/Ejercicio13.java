package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide al usuario un número y muestra por pantalla los números 
 * entre el 1 y el número del usuario.
 * 
 * @author israel
 */
public class Ejercicio13 {
    
    
    /**
     * Método que pide al usuario introducir un número.
     * @return devuelve el número del usuario.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que dependiendo de si el número es mayor de 1 devuelve un booleano.
     * @param numUsuario número introducido por el usuario.
     * @return valor booleano.
     */
    public static boolean comprobarNumero (int numUsuario) {
        return numUsuario > 1;
    }
    
    /**
     * Método que si recibe un true muestra todos los números por pantalla desde
     * el 1 hasta el numero introducido por el usuario.
     * @param validar valor booleano recibido.
     * @param numUsuario número del usuario.
     */
    public static void mostrarNumeros (boolean validar, int numUsuario) {
        if (validar) {
            for (int i = 1; i < numUsuario; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Error, introduzca un número mayor que 1.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUsuario;
        boolean validar = false;
        
        do {
            try {
                numUsuario = pedirNumero();
                validar = comprobarNumero(numUsuario);
                mostrarNumeros(validar, numUsuario);
            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entero.");
                entrada.nextLine();
            }
        } while (!validar);
    }
}