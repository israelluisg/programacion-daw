package ejercicio13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte num1 = 1;
        byte num2 = 2;
        byte aux;
        
        System.out.println("La variable num1 contiene el valor " + num1 
                + " y la variable num2 contiene el valor " + num2 + ".");
        
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("La variable num1 contiene el valor " + num1 
                + " y la variable num2 contiene el valor " + num2 + ".");
        
    }
    
}
