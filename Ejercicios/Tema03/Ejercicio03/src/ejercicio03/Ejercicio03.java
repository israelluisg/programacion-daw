package ejercicio03;

import java.util.Scanner;

/**
 *
 * Programa que determina el mayor de tres números.
 * 
 * @author israel
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables donde se almacenaran las entradas.
        int num1, num2, num3;
        
        // Creo el objeto Scanner para leer y almacenar los datos.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.print("Por último, introduzca un tercer numero: ");
        num3 = entrada.nextInt();
        
        /*
         * Se crean tres condiciones para determinar cual de los tres números
         * es el mayor.
         */
        if(num1 >= num2 && num1 >= num3){
            System.out.println("El número mayor de los introducidos es el " 
                    + num1);
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("El número mayor de los introducidos es el " 
                    + num2);
        } else {
            System.out.println("El número mayor de los introducidos es el " 
                    + num3);
        }
    }
    
}
