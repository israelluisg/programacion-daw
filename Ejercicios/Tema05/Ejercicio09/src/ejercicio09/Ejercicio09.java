package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio09 {
    
    public static int pedirNumero () {
     Scanner entrada = new Scanner(System.in);
     
     int numUsuario = 0;
     boolean validar;
     
     do {
         try {
             numUsuario = entrada.nextInt();
             validar = false;
         } catch (InputMismatchException e) {
             System.out.print("Error, introduzca un número entero: ");
             validar = true;
             entrada.nextLine();
         }
     } while (validar);
     
     return numUsuario;
    }
    
    public static void determinarMayor (Numero num1, Numero num2, Numero num3) {
        int numero1 = num1.getValor();
        int numero2 = num2.getValor();
        int numero3 = num3.getValor();
        
        System.out.println("El número mayor de " + numero1 + ", " + numero2 
                + " y " + numero3 + " es " + Math.max(numero3, Math.max(numero1, numero2)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        Numero num1 = new Numero(pedirNumero());
        
        System.out.print("Introduzca el segundo número: ");
        Numero num2 = new Numero(pedirNumero());
        
        System.out.print("Introduzca el tercer número: ");
        Numero num3 = new Numero(pedirNumero());
    }
}