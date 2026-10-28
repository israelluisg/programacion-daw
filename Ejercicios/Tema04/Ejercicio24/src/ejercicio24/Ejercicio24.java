package ejercicio24;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio24 {
    
    public static String pedirNombre () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca su nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirEdad () {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduzca su edad: ");
        return entrada.nextInt();
    }
    
    public static void mayorDeEdad (String nombreUsuario, int edadUsuario) {
        if (edadUsuario >= 18) {
            System.out.println(nombreUsuario + " es mayor de edad.");
        } else {
            System.out.println(nombreUsuario + " no es mayor de edad.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mayorDeEdad(pedirNombre(), pedirEdad());
    }
}