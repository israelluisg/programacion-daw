package ejercicio13;

/**
 *
 * Programa que muestra por pantalla los números pares del número 11 al 133.
 * 
 * @author israel
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Inicializo la variable num
        int num = 11;
        
        // Creo un bucle while que solo muestra por pantalla números pares
        while (num < 133) {
            if ((num % 2) == 0) {
                System.out.println(num);    
            }
            num++;
        }
    }
}