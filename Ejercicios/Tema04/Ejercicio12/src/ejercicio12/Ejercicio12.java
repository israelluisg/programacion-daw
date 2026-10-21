package ejercicio12;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio12 {
    
    final static int CONTRASENIA = 1234;
    
    public static int pedirContrasenia (Scanner entrada) {
        System.out.print("Introduzca la contraseña: ");
        return entrada.nextInt();
    }
    
    public static boolean comprobarContrasenia (int numUsuario) {
        return numUsuario == CONTRASENIA;
    }
    
    public static void resultadoContrasenia (boolean validar) {
        if (validar) {
            System.out.println("Enhorabuena, la contraseña es correcta.");
        } else {
            System.out.println("Error, contraseña incorrecta.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean validar = true;
        int numUsuario;
        int intentos = 0;
        
        do {
            numUsuario = pedirContrasenia(entrada);
            validar = comprobarContrasenia(numUsuario);

            resultadoContrasenia(validar);
            
        } while (!validar && intentos < 3);
    }
}