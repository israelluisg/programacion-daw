package ejercicio15;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUsuario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número para calcular su tabla de multiplicar: ");
        numUsuario = entrada.nextInt();
        
        for (int i = 0; i <= 10; i++){
            System.out.println(numUsuario + " x " + i + " = " + numUsuario * i);
        }
    }
}