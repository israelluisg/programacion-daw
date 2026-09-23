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
        
        /* Primero se le suma 1 a 'a' pasando a 6 y 1 a 'b' 7 
        *  luego se suma a + b = 12
        */
        c = ++a + b++;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        
        /* Primero se le suma 1 a 'a' pasando a 7 y 1 a 'b' 8 
        *  luego se suma a + b = 15
        */
        c = ++a + ++b;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
    }

}