package ejercicio04;

/**
 *
 * @author israel
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte numexamen = 2;
        float nota1 = 7;
        float nota2 = 2;
        
        float media = (nota1 + nota2)/numexamen;
        
        System.out.println("Asignatura: Programación");
        System.out.println("Primera nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Media: " + media);
    }
    
}
