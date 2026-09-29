package ejercicio01;

import java.util.Scanner;

/**
 *
 * Programa diseñado para determinar si un número es positivo o negativo.
 * 
 * @author israel
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Declaro la variable numUsuario donde se almacenará el número
         * introducido por el usuario.
         */
        int numUsuario;
        
        // Creo el objeto escaner para leer y almacenar numUsuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número: ");
        numUsuario = entrada.nextInt();
        
        // Se crea una condición para determinar si el número es positivo o no.
        if(numUsuario > 0){
            System.out.println("El número introducido es positivo.");
        } else{
            System.out.println("El número introducido es negativo.");
        }
        
    }
    
}
