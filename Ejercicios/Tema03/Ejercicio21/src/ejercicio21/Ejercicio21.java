package ejercicio21;

import java.util.Scanner;
/**
 *
 * Programa que pide dos datos al usuario para realizar una división, en caso
 * de que el divisor sea 0 se le mostrará un error al usuario.
 * 
 * @author israel
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables dividendo y divisor
        int dividendo, divisor;
        
        // Creo el objeto Scanner para registrar la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Pido los datos al usuario
        System.out.print("Introduzca el dividendo: ");
        dividendo = entrada.nextInt();
        
        System.out.print("Introduzca el divisor: ");
        divisor = entrada.nextInt();
        
        // Muestro por pantalla la operación y un try en caso de error
        try {
            System.out.println("El resultado de la división de " + dividendo 
                    + " entre " + divisor + " es " + (dividendo / divisor));
            
        } catch (ArithmeticException e) {
            System.out.println("Datos introducidos no válidos.");
            System.out.println("Error: " + e.getMessage());
        } 
    }
}