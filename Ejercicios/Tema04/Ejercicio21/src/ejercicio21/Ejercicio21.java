package ejercicio21;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio21 {
    
    public static int pedirNumero1 () {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el primer número: ");
        
        return entrada.nextInt();
    }
    
    public static int pedirNumero2 (int numUsuario1) {
        Scanner entrada = new Scanner (System.in);
        int numUsuario2;
        System.out.print("Introduzca el segundo número: ");
        do {
            numUsuario2 = entrada.nextInt();
            if (numUsuario2 < numUsuario1) {
                System.out.print("Error, introduzca un número mayor que el primero: ");
            }
        } while (numUsuario2 < numUsuario1);
        return numUsuario2;
    }
    
    public static void mostrarNumeros (int numUsuario1, int numUsuario2) {
        for (int i = numUsuario1; i < numUsuario2; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUsuario1 = pedirNumero1();
        int numUsuario2 = pedirNumero2(numUsuario1);
        mostrarNumeros(numUsuario1, numUsuario2);
    }
}