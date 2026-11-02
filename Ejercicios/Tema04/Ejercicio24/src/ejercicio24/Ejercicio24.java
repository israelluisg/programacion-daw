package ejercicio24;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide introducir el nombre y la edad al usuario y le muestra por
 * pantalla si es mayor de edad o no.
 * 
 * @author israel
 */
public class Ejercicio24 {
    
    /**
     * Método que pide al usuario introducir su nombre.
     * @return Devuelve el nombre introducido por el usuario.
     */
    public static String pedirNombre () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca su nombre: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que pide al usuario introducir su edad y comprueba
     * que sea un número entero no negativo.
     * @return Devuelve la edad introducida por el usuario.
     */
    public static int pedirEdad () {
        Scanner entrada = new Scanner (System.in);
        boolean validarEdad = true;
        int edad = 0;
        
        do {
            try {
                System.out.print("Introduzca su edad: ");
                edad = entrada.nextInt();
                
                // Compruebo que no se introduce una edad negativa
                if (edad >= 0) {
                    validarEdad = false;
                } else {
                    System.out.println("Error, introduzca una edad válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entero.");
                entrada.nextLine();
            }
        } while (validarEdad);
        
        return edad;
    }
    
    /**
     * Método que comprueba si el usuario es mayor de edad y lo muestra por
     * pantalla.
     * @param nombreUsuario Nombre introducido por el usuario.
     * @param edadUsuario  Edad introducida por el usuario.
     */
    public static void mayorDeEdad (String nombreUsuario, int edadUsuario) {
        if (edadUsuario >= 18) {
            System.out.println(nombreUsuario + " es mayor de edad.");
        } else {
            System.out.println(nombreUsuario + " no es mayor de edad.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mayorDeEdad(pedirNombre(), pedirEdad());
    }
}