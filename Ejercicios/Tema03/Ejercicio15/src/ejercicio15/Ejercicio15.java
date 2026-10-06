package ejercicio15;

import java.util.Scanner;
/**
 *
 * Programa que muestra la tabla de multiplicar de un número introducido
 * por el usuario.
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
        
        System.out.print("Introduzca un número para calcular su tabla de " 
                + "multiplicar: ");
        numUsuario = entrada.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numUsuario + " x " + i + " = " + numUsuario * i);
        }
    }
}