package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 3, b = 6, c;
        
        // Division de 3 / 6 = 
        c = a / b;
        System.out.println("El valor de c es: " + c);

        c = a % b;
        System.out.println("El valor de c es: " + c);

        a++;
        System.out.println("El valor de a es: " + a);

        ++a;
        System.out.println("El valor de a es: " + a);

        c = ++a + b++;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);

        c = ++a + ++b;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
    }

}