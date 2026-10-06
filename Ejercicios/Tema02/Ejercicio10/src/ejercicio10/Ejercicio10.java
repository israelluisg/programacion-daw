package ejercicio10;

/**
 *
 * Programa que suma dos variables y muestra por pantalla la suma, después
 * suma la suma previa más otra variable y la muestra por pantalla.
 * 
 * @author israel
 */
public class Ejercicio10 {
    
    static int n1 = 50;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma;
        int n2 = 30;
        int n3 = 5;
        
        suma = n1 + n2;
        
        System.out.println("LA SUMA ES: " + suma);
        
        suma = suma + n3;
        
        System.out.println(suma);
       
    }
}