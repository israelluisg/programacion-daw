package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide introducir una contraseña al usuario
 * 
 * @author israel
 */
public class Ejercicio12 {
    
    final static int CONTRASENIA = 1234;
    
    public static int pedirContrasenia (Scanner entrada) {
        try {
            System.out.print("Introduzca la contraseña: ");
            return entrada.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
            entrada.nextLine();
            return 0;
        }
    }
    
    public static boolean comprobarContrasenia (int numUsuario) {        
        return numUsuario == CONTRASENIA;
    }
    
    public static void mostrarResultado (boolean validar) {
        if (validar) {
            System.out.println("Enhorabuena, tu contraseña es correcta.");
        } else {
            System.out.println("Error de acceso.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUsuario;
        boolean validar;
        int intentos = 0;
        
        do {
            intentos++;
            numUsuario = pedirContrasenia(entrada);
            validar = comprobarContrasenia(numUsuario);
        } while (!validar && intentos < 3);
        
        mostrarResultado(validar);
    }
}