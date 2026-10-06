package ejercicio08;

/**
 *
 * Programa que inicializa dos variables, las suma y muestra la suma por 
 * pantalla.
 * 
 * @author israel
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable suma donde se guardará n1 + n2
        int suma;
        
        // Inicializo n1 y n2
        int n1 = 50;
        int n2 = 30;
        
        // Realizo la suma
        suma = n1 + n2;
        
        // Se muestra por pantalla la suma de n1 y n2
        System.out.println("LA SUMA ES: " + suma);
    }
}