package ejercicio25;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio25 {
    
    public static int pedirNumero1 () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca el primero número: ");
        return entrada.nextInt();
    }
    
    public static int pedirNumero2 () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca el segundo número: ");
        return entrada.nextInt();
    }
    
    public static void calcularPotencia (int num1, int num2) {
        System.out.println("La potencia de " + num1 + " elevado a " + num2 
                + " es " + (Math.pow(num1, num2)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNumero1();
        int num2;
        do {
            num2 = pedirNumero2();
            
            if (num1 == 0 && num2 < 0) {
                System.out.println("Error de calculos, introduzca un número que no sea negativo.");
            }
        } while (num1 == 0 && num2 < 0);
        
        calcularPotencia(num1, num2);
    }
}