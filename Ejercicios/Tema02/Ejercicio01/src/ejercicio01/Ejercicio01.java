package ejercicio01;

/**
 *
 * Programa que suma dos números enteros y muestra la suma por pantalla.
 * 
 * @author israel
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2;
        int resultado;
        
        /*
         * ERROR: numero2 = 700; El error se encuentra en que estamos 
         * intentando asignar el valor entero 700 a la variable numero2
         * definida como un boolean.
         */
        // SOLUCIÓN: Cambiar la declaración de boolean de numero2 por int.
        numero2 = 700;
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es " + resultado);
        
    }
    
}
