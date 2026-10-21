package ejercicio14;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio14 {
    
    public static int pedirNumero (Scanner entrada) {
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    public static boolean comprobarNumero (int numUsuario) {
        return numUsuario > 0;
    }
    
    public static void mostrarNumeros (boolean validar, int numUsuario) {
        int numMostrados = 0;
        if (validar) {
            for (int i = 1; i * 3 < numUsuario; i++) {
                System.out.println(i * 3);
                numMostrados++;
            }
            
            System.out.println("Se han mostrado " + numMostrados + " números.");
        } else {
            System.out.println("Error.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUsuario;
        boolean validar;
        
        do {
            numUsuario = pedirNumero(entrada);
            validar = comprobarNumero(numUsuario);
            
            if (!validar) {
                System.out.println("Error, introduzca un número mayor que 0.");
            }
        } while (!validar);
        
        mostrarNumeros(validar, numUsuario);
    }
}