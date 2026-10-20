package ejercicio05;

import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * Programa que pide un número al usuario y posteriormente determina y muestra
 * por pantalla si es par o impar.
 * 
 * @author israel
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUsuario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        numUsuario = entrada.nextInt();
        
        Operaciones.paridad(numUsuario);
    }

}