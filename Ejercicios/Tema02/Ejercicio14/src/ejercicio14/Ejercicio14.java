package ejercicio14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    final static float PI = 3.1415926535f;
    
    public static void main(String[] args) {
        float radio = 5.2f;
        
        float area = PI * radio * radio;
        
        System.out.println("El área de una circunferencia cuyo radio vale " 
                + radio + " sería igual a: " + area + " metros.");
    }
    
}
