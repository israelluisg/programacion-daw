package ejercicio19;

/**
 *
 * Programa que realiza distintas operaciones.
 * 
 * @author israel
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se inicializan las variables a y b, se declara la variable c.
        int a = 3, b = 6, c;
        
        // Division entera de 3 / 6 = 0
        c = a / b;
        System.out.println("El valor de c es: " + c);
        
        // Módulo de dividir 3 entre 6 = 3
        c = a % b;
        System.out.println("El valor de c es: " + c);
        
        // Se le suma 1 a 'a' pasando a 4
        a++;
        System.out.println("El valor de a es: " + a);
        
        // Se le suma 1 a 'a' pasando a 5
        ++a;
        System.out.println("El valor de a es: " + a);
        
        /*
         * Primero se le suma 1 a 'a', pasando de 5 a 6, y se usa el valor 6
         * en la suma. En 'b++' se usa primero el valor 6 y después se le suma
         * 1 a 'b', pasando a 7. Por tanto, c = 6 + 6 = 12.
         */
        c = ++a + b++;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        
        /*
         * Primero se le suma 1 a 'a', pasando a 7, y 1 a 'b', pasando a 8.
         * Después se suman ambos valores, por lo que c = 7 + 8 = 15.
         */
        c = ++a + ++b;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
    }

}