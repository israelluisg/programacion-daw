package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio10 {
    
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
    
    public static void hacerTabla (int numUsuario) {
        for (int i = 0; i < 11; i++) {
            System.out.println(numUsuario + " x " + i + " = " + (numUsuario * i));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        hacerTabla(pedirNumero(entrada));
    }
}