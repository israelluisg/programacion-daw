package ejercicio09;

/**
 *
 * @author israel
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    final static float PI = 3.14159265358979323846f;

    public static void main(String[] args) {
        float radio = 3.55f;
        
        double longCircunferencia = 2 * PI * radio;
        
        System.out.println("La longitud de una circunferencia cuyo radio vale " 
                + radio + " sería igual a : " 
                + longCircunferencia + " metros.");
    }
    
}
