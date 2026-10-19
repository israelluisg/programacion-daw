package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.print("Por último, introduzca un tercer numero: ");
        num3 = entrada.nextInt();
        
        operaciones.numeroMayor(num1, num2, num3);
        
    }
}