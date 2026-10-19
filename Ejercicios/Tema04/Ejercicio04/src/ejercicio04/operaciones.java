package ejercicio04;

/**
 *
 * @author israel
 */
public class operaciones {
    public static void numeroMayor (int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("El número menor de los introducidos es el " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("El número menor de los introducidos es el " + num2);
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("El número menor de los introducidos es el " + num3);
        }
        
    }
}
