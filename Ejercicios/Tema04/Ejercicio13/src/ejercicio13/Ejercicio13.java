package ejercicio13;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio13 {
    
    public static int pedirNumero (Scanner entrada) {
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    public static boolean comprobarNumero (int numUsuario) {
        return numUsuario > 1;
    }
    
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
        int numUsuario = pedirNumero(entrada);
        boolean validar = comprobarNumero(numUsuario);
        
        mostrarNumeros(validar, numUsuario);
    }
}