package ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUsuario;
        boolean verificacion = false;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        do {
            try{
                numUsuario = entrada.nextInt();

                if (numUsuario < 1) {
                    System.out.println("Introduce un número mayor a 1.");
                } else {
                    verificacion = true;
                }

                for (int i = 1; i < numUsuario; i++){
                    System.out.println(i);
                }
            } catch (InputMismatchException e) {
                System.out.println("Añada un dato válido.");
            }
            
        } while (verificacion = false);
        
    }
}