package ejercicio19;

import java.util.Scanner;
/**
 *
 * Programa que pide un día de la semana al usuario y determina cuál es su posición.
 * 
 * @author israel
 */
public class Ejercicio19 {
    
    /**
     * Método que pide al usuario introducir un día.
     * @return Devuelve el día introducido por el usuario.
     */
    public static String pedirDia () {
        Scanner entrada = new Scanner (System.in);
        return entrada.nextLine();
    }
    
    /**
     * Método que dependiendo del día de la semana introducido por el usuario
     * muestra por pantalla su posición.
     * @param diaUsuario Día de la semana introducido por el usuario.
     */
    public static void posicionarDia (String diaUsuario) {
        switch (diaUsuario.toLowerCase()) {
            case "lunes" -> System.out.println ("El lunes es el primer día de la semana.");
            case "martes" -> System.out.println ("El martes es el segundo día de la semana.");
            case "miércoles" -> System.out.println ("El miércoles es el tercer día de la semana.");
            case "jueves" -> System.out.println ("El jueves es el cuarto día de la semana.");
            case "viernes" -> System.out.println ("El viernes es el quinto día de la semana.");
            case "sábado" -> System.out.println ("El sábado es el sexto día de la semana.");
            case "domingo" -> System.out.println ("El domingo es el séptimo día de la semana.");
            default -> System.out.println ("Introduzca un día de la semana válido.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Introduzca un día de la semana: ");
        
        posicionarDia(pedirDia());
    }
}