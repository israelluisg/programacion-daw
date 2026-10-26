package ejercicio15;

import java.util.Scanner;
/**
 *
 * Programa que pide dos números al usuario y posteriormente le da opciones
 * para realizar diferentes opciones con ellos.
 * 
 * @author israel
 */
public class Ejercicio15 {
    
    /**
     * Método que pide al usuario introducir un número.
     * @return se devuelve el número introducido por el usuario.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que crea una interfaz con diferentes opciones mediante un switch.
     * @param num1 Primer número introducido por el usuario.
     * @param num2 Segundo número introducido por el usuario.
     */
    public static void mostrarInterfaz (int num1, int num2) {
        int numOpcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nSeleccione una opción: ");
            System.out.println("\n1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            numOpcion = entrada.nextInt();
            switch (numOpcion) {
                case 1 -> sumar(num1, num2);
                case 2 -> restar(num1, num2);
                case 3 -> multiplicar(num1, num2);
                case 4 -> dividir(num1, num2);
                case 5 -> System.out.println("Cerrando programa...");
                default -> System.out.println("Error, introduzca una opción válida.");
            }
        } while (numOpcion != 5);
    }
    
    /**
     * Método que realiza la operación sumar.
     * @param num1 Primer número introducido por el usuario.
     * @param num2 Segundo número introducido por el usuario.
     */
    public static void sumar (int num1, int num2) {
        System.out.println("La suma de " + num1 + " + " + num2 + " es " 
                + (num1 + num2));
    }
    
    /**
     * Método que realiza la operación restar.
     * @param num1 Primer número introducido por el usuario.
     * @param num2 Segundo número introducido por el usuario.
     */
    public static void restar (int num1, int num2) {
        System.out.println("La resta de " + num1 + " - " + num2 + " es " 
                + (num1 - num2));
    }
    
    /**
     * Método que realiza la operación multiplicar.
     * @param num1 Primer número introducido por el usuario.
     * @param num2 Segundo número introducido por el usuario.
     */
    public static void multiplicar (int num1, int num2) {
        System.out.println("La multiplicación de " + num1 + " x " + num2 + " es " 
                + (num1 * num2));
    }
    
    /**
     * Método que realiza la operación dividir.
     * @param num1 Primer número introducido por el usuario.
     * @param num2 Segundo número introducido por el usuario.
     */
    public static void dividir (int num1, int num2) {
        try {
            System.out.println("La división de " + num1 + " / " + num2 + " es " 
                    + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir entre cero.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        mostrarInterfaz(num1, num2);
    }

}