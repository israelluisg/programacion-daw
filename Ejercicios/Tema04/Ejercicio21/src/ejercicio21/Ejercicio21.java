package ejercicio21;

import java.util.Scanner;
/**
 *
 * Programa que pide introducir al usuario dos números y posteriormente realiza
 * la suma de los números pares comprendidos entre estos dos.
 * 
 * @author israel
 */
public class Ejercicio21 {
    
    /**
     * Método que pide al usuario introducir el primer número.
     * @return Devuelve el número introducido.
     */
    public static int pedirNumero1 () {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el primer número: ");
        
        return entrada.nextInt();
    }
    
    /**
     * Método que pide al usuario introducir el segundo número.
     * @param numUsuario1 Primer número introducido por el usuario.
     * @return Devuelve el número introducido.
     */
    public static int pedirNumero2 (int numUsuario1) {
        Scanner entrada = new Scanner (System.in);
        int numUsuario2;
        System.out.print("Introduzca el segundo número: ");
        do {
            numUsuario2 = entrada.nextInt();
            // Verifico que el segundo número es mayor que el primero.
            if (numUsuario2 <= numUsuario1) {
                System.out.print("Error, introduzca un número mayor que el primero: ");
            }
        } while (numUsuario2 <= numUsuario1);
        return numUsuario2;
    }
    
    /**
     * Método que suma los números pares comprendidos entre dos números y lo
     * muestra por pantalla.
     * @param numUsuario1 Dato desde el que se parte.
     * @param numUsuario2 Dato límite hasta el que se llega.
     */
    public static void mostrarNumeros (int numUsuario1, int numUsuario2) {
        int sumaPares = 0;
        for (int i = numUsuario1; i <= numUsuario2; i++) {
            if ((i % 2) == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de los números pares comprendidos entre " 
                + numUsuario1 + " y " + numUsuario2 + " es " + sumaPares);
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