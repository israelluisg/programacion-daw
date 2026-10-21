package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio10 {
    
    /**
     * Método que pide al usuario introducir un número, repitiendose hasta que 
     * el usuario introduzca un número entero.
     * @param entrada donde se registra la entrada del usuario.
     * @return devuelve el número introducido por el usuario.
     */
    public static int pedirNumero (Scanner entrada) {
        do {
            try {
                System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
                return entrada.nextInt();
                
            } catch(InputMismatchException e) {
                System.out.println("Error, introduzca un número entero.");
                entrada.nextLine();
            }
        } while (true);
    }
    
    /**
     * Método que apartir de un número hace una tabla de multiplicar hasta el
     * número 10.
     * @param numUsuario el número entero con el que se realiza la tabla.
     */
    public static void hacerTabla (int numUsuario) {
        for (int i = 0; i < 11; i++) {
            System.out.println(numUsuario + " x " + i + " = " + (numUsuario * i));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        // Llamo al método hacerTabla y dentro al método pedirNúmero
        hacerTabla(pedirNumero(entrada));
    }
}