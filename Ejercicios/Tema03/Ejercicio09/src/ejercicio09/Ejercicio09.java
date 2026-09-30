package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3,num4;
        int aux;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.print("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.print("Por último, introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        
        // Primera vuelta
        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        } 
        
        // Segunda vuelta
        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        } 
        
        // Tercera vuelta
        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        System.out.println("El orden de los números introducidos es el " 
                    + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
}
