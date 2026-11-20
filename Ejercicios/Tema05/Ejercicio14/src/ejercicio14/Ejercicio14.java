package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que crea un objeto Numero, luego se pide al usuario que le asigne
 * un valor y posteriormente se muestra una tabla de multiplicar a partir de
 * ese objeto.
 * 
 * @author israel
 */
public class Ejercicio14 {
    
    /**
     * Método que pide un número al usuario y lo valida.
     * @return número entero introducido.
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean validar;
        
        System.out.print("Introduzca un número: ");
        
        do {
            try {
                numero = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return numero;
    }
    
    /**
     * Muestra una tabla de multiplicar a partir del valor de un objeto Numero.
     * @param numero objeto Numero del cual se hace la tabla de multiplicar.
     */
    public static void mostrarTabla(Numero numero) {
        int numTabla = numero.getValor();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el objeto numero
        Numero numero = new Numero();
        
        // Se establece un valor a numero
        numero.setValor(pedirNumero());
        
        // Se muestra la tabla de multiplicar
        mostrarTabla(numero);
    }

}