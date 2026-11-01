package ejercicio25;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide introducir dos números al usuario y posteriormente eleva
 * el primero al segundo, realizando el calculo y mostrandolo por pantalla.
 * 
 * @author israel
 */
public class Ejercicio25 {
    
    /**
     * Método que pide al usuario introducir el primer número.
     * @return Devuelve el número introducido por el usuario.
     */
    public static int pedirNumero1 () {
        Scanner entrada = new Scanner (System.in);
        // Inicializo la variable validar para controlar que el usuario introduzca un entero.
        boolean validar = true;
        int numUsuario = 0;
        
        do {
            try {
                System.out.print("Introduzca el primer número: ");
                numUsuario = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un entero.");
                entrada.nextLine();
            }
        } while (validar);
        
        return numUsuario;
    }
    
    /**
     * Método que pide al usuario introducir el segundo número.
     * @return Devuelve el número introducido por el usuario.
     */
    public static int pedirNumero2 () {
        Scanner entrada = new Scanner (System.in);
        // Inicializo la variable validar para controlar que introduzca un entero.
        boolean validar = true;
        int numUsuario = 0;
        
        do {
            try {
                System.out.print("Introduzca el segundo número: ");
                numUsuario = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un entero.");
                entrada.nextLine();
            }
        } while (validar);
        
        return numUsuario;
    }
    
    /**
     * Método que calcula la potencia del primer número elevado al segundo
     * y muestra el resultado por pantalla.
     * @param num1 Base de la potencia.
     * @param num2 Exponente de la potencia.
     */
    public static void calcularPotencia (int num1, int num2) {
        System.out.println("La potencia de " + num1 + " elevado a " + num2 
                + " es " + (Math.pow(num1, num2)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializo num1 con el método pedirNumero1.
        int num1 = pedirNumero1();
        int num2;
        do {
            // Le asigno a num2 el valor del método pedirNumero2.
            num2 = pedirNumero2();
            
            // Compruebo que el exponente no sea negativo cuando la base es 0.
            if (num1 == 0 && num2 < 0) {
                System.out.println("Error, el exponente no puede ser negativo cuando la base es 0.");
            }
        } while (num1 == 0 && num2 < 0);
        
        // Llamo al método calcularPotencia para mostrar por pantalla los cálculos.
        calcularPotencia(num1, num2);
    }
}