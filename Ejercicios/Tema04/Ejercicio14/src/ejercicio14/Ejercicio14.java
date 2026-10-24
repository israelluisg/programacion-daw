package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide al usuario un número y muestra por pantalla los números 
 * múltiplos de 3 entre el 1 y el número del usuario.
 * 
 * @author israel
 */
public class Ejercicio14 {
    
    
    /**
     * Método que pide al usuario introducir un número.
     * @param entrada objeto Scanner que registra la entrada.
     * @return devuelve el número del usuario.
     */
    public static int pedirNumero (Scanner entrada) {
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que dependiendo de si el número es mayor de 1 devuelve un booleano.
     * @param numUsuario número introducido por el usuario.
     * @return valor booleano.
     */
    public static boolean comprobarNumero (int numUsuario) {
        return numUsuario > 0;
    }
    
    /**
     * Método que si recibe un true muestra todos los números múltiplos de 3 
     * por pantalla desde el 1 hasta el numero introducido por el usuario.
     * @param validar valor booleano recibido.
     * @param numUsuario número del usuario.
     */
    public static void mostrarNumeros (boolean validar, int numUsuario) {
        int numMostrados = 0;
        if (validar) {
            for (int i = 1; i * 3 < numUsuario; i++) {
                System.out.println(i * 3);
                numMostrados++;
            }
            System.out.println("Se han mostrado " + numMostrados + " números.");
        } else {
            System.out.println("Error, introduzca un número mayor que 0.");
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
                numUsuario = pedirNumero(entrada);
                validar = comprobarNumero(numUsuario);
                mostrarNumeros(validar, numUsuario);
            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entero.");
                entrada.nextLine();
            }
        } while (!validar);
    }
}