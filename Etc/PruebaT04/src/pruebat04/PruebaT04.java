package pruebat04;

import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * @author alumno
 */
public class PruebaT04 {
    /**
     * Método que imprime por pantalla "Hola, Mundo".
     */
    public static void saludar () {
        System.out.println("Hola, mundo");
    }
    
    /**
     * Método que pide al usuario un número entero.
     * @return el número que escribe el usuario.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que multiplica dos números recibidos por parámetros.
     * @param num1
     * @param num2
     * @return el resultado.
     */
    public static int multiplicar (int num1, int num2) {
        return num1 * num2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        saludar();
        
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        int resultado = multiplicar (num1, num2);
        
        System.out.println("El resultado es: " + resultado);
        System.out.println(multiplicar (num1, num2));
        
        System.out.println("\nMultiplicar pasando método por parámetro:");
        System.out.println(multiplicar (pedirNumero(), pedirNumero()));
        
        // Llamo al método sumar() de la clase Operaciones, que está en el paquete operaciones
        Operaciones.sumar(num1, num2);
        
    }
}