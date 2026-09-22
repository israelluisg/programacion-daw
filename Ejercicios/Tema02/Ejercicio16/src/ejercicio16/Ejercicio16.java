package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cartera = 130;
        int billetes50 = cartera / 50;
        int billetes10 = (cartera % 50) / 10;
        
        System.out.println(cartera + " euros hacen un total de: " 
                + billetes50  + " billetes de 50 euros y " + billetes10 
                + " billetes de 10 euros.");
        
    }
    
}
