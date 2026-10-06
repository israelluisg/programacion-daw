package ejercicio12;

/**
 *
 * @author israel
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 5;
        
        // Se muestra 7 por pantalla
        num += num - 1 * 4 + 1;
        
        System.out.println(num);
        
        num = 4;
        
        // Se muestra 1 por pantalla
        num %= 7 * num % 3 * 7 >> 1;
        
        System.out.println(num);
    }
}