package ejercicio02;

import java.util.Scanner;

/**
 *
 * Programa que multiplica dos valores introducidos por el usuario si el
 * valor es mayor que 10, y los suma en caso contrario.
 * 
 * @author israel
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * Declaro las variables para almacenar los datos introducidos por el
         * usuario y el resultado de las operaciones posteriores.
         */
        int num1, num2, resultado;
        
        // Creo el objeto Scanner para leer y almacenar los valores.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        /*
         * Se crea un condicional que realiza diferentes operaciones dependiendo
         * de si el valor introducido se mayor o menor de 10.
        */
        if(num1 > 10){
            resultado = num1 * num2;
            
            System.out.println("La operación que se realizó es producto y el "
                    + "resultado es " + resultado);
        } else{
            resultado = num1 + num2;
            
            System.out.println("La operación que se realizó es suma y el " 
                    + "resultado es " + resultado);
        }
    }
    
}
