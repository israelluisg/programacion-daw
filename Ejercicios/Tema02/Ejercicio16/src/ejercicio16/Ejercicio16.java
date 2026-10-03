package ejercicio16;

/**
 *
 * Programa que descompone 130 euros en billetes de 50 y 10.
 * 
 * @author israel
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se inicializa la variable cartera.
        int cartera = 130;
        
        // Se realizan las operaciones para descomponer en billetes de 50 y 10.
        int billetes50 = cartera / 50;
        int billetes10 = (cartera % 50) / 10;
        
        // Se muestra por pantalla la cantidad descompuesta en billetes.
        System.out.println(cartera + " euros hacen un total de: " 
                + billetes50 + " billetes de 50 euros y " + billetes10 
                + " billetes de 10 euros.");
        
    }
    
}
