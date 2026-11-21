package ejercicio18;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide dos números y permite realizar
 * operaciones aritméticas mediante un menú.
 *
 * @author israel
 */
public class Ejercicio18 {
    
    /**
     * Método que solicita un número entero al usuario.
     * @param mensaje texto que se muestra al pedir el número.
     * @return número entero introducido.
     */
    public static int pedirNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean validar;
        
        System.out.print(mensaje);
        
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
     * Método que suma dos números y muestra el resultado.
     * @param num1 primer número.
     * @param num2 segundo número.
     */
    public static void sumarNumeros(int num1, int num2) {
        System.out.println("La suma de " + num1 + " + " + num2 
                + " es igual a " + (num1 + num2));
    }
    
    /**
     * Método que resta dos números y muestra el resultado.
     * @param num1 primer número.
     * @param num2 segundo número.
     */
    public static void restarNumeros(int num1, int num2) {
        System.out.println("La resta de " + num1 + " - " + num2 
                + " es igual a " + (num1 - num2));
    }
    
    /**
     * Método que multiplica dos números y muestra el resultado.
     * @param num1 primer número.
     * @param num2 segundo número.
     */
    public static void multiplicarNumeros(int num1, int num2) {
        System.out.println("La multiplicación de " + num1 + " x " + num2 
                + " es igual a " + (num1 * num2));
    }
    
    /**
     * Método que divide dos números y muestra el resultado.
     * Controla la división entre cero.
     * @param num1 dividendo.
     * @param num2 divisor.
     */
    public static void dividirNumeros(int num1, int num2) {      
        try {
            System.out.println("La división de " + num1 + " / " + num2 
                + " es igual a " + (num1 / num2));
        } catch(ArithmeticException e) {
            System.out.println("Error al intentar dividir entre cero.");
        }
    }
    
    /**
     * Método que muestra el menú y realiza la operación seleccionada.
     * @param num1 primer objeto Numero.
     * @param num2 segundo objeto Numero.
     */
    public static void mostrarMenu(Numero num1, Numero num2) {
        int opcion;
        int numero1 = num1.getValor();
        int numero2 = num2.getValor();
        
        do {
            System.out.println("\n1. - Sumar los números.");
            System.out.println("2. - Restar los números.");
            System.out.println("3. - Multiplicar los números.");
            System.out.println("4. - Dividir los números.");
            System.out.println("5. - Salir del programa.");
            opcion = pedirNumero("Introduzca una opción: ");
            
            switch (opcion) {
                case 1 -> sumarNumeros(numero1, numero2);
                case 2 -> restarNumeros(numero1, numero2);
                case 3 -> multiplicarNumeros(numero1, numero2);
                case 4 -> dividirNumeros(numero1, numero2);
                case 5 -> System.out.println("Cerrando programa...");
                default -> System.out.print("Opción introducida no válida.");
            }
        } while (opcion != 5);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero num1 = new Numero(pedirNumero("Introduzca el primer número: "));
        Numero num2 = new Numero(pedirNumero("Introduzca el segundo número: "));
        
        mostrarMenu(num1, num2);
    }
}