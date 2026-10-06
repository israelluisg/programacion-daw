package ejercicio11;

/**
 *
 * Programa que muestra por pantalla el mensaje Hola seguido de un número que
 * va del 1 al 6.
 * 
 * @author israel
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Bucle que muestra por pantalla Hola repetido de un número del 1 al 6
        System.out.print("- ");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Hola" + i + " - ");
        }
    }
}