package ejercicio18;

import java.util.Scanner;
/**
 *
 * Programa que pide al usuario introducir una contraseña, si la introduce
 * correctamente se le felicita, si la introduce incorrectamente 3 veces
 * se muestra un error por pantalla.
 * 
 * @author israel
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables
        int intentos = 0;
        int contraseña = 1234;
        int entradaUsuario;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        /*
         * Creo un bucle do-while, si el usuario introduce correctamente el
         * número almacenado en la variable contraseña se le felicitará,
         * por el contrario si falla 3 veces se mostrará por pantalla un error.
         */
        do {
            System.out.print("Introduzca la contraseña: ");
            entradaUsuario = entrada.nextInt();
            intentos++;
        } while (intentos < 3 && entradaUsuario != contraseña);
        
        if (entradaUsuario == contraseña) {
            System.out.println("Enhorabuena, has introducido correctamente " 
                    + "la contraseña.");
        } else {
            System.out.println("Error de acceso.");
        }
    }
}