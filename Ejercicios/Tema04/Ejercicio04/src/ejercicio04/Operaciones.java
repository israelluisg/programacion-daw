package ejercicio04;

/**
 *
 * @author israel
 */
public class Operaciones {
    /**
     * Método que identifica el número menor de tres variables.
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void numeroMenor (int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("El número menor de los introducidos es el " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("El número menor de los introducidos es el " + num2);
        } else {
            System.out.println("El número menor de los introducidos es el " + num3);
        }
        
    }
}
