package operaciones;

/**
 *
 * @author israel
 */
public class NumeroMayor {
    
    /**
     * Método que muestra el número mayor de tres variables.
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void numeroMayor (int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número mayor de los introducidos es el " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número mayor de los introducidos es el " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("El número mayor de los introducidos es el " + num3);
        }
        
    }
}
