package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Test {
    
    public static int pedirNumero () {
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
    
    public static void esPar (Numero numUsuario) {
        int numero = numUsuario.getValor();
        if ((numero % 2) == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int valor = pedirNumero();
        
        Numero numUsuario = new Numero(valor);
        
        esPar(numUsuario);
    }
}