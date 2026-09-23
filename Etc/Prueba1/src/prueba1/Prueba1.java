package prueba1;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENTRADA DE DATOS DEL TECLADO
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuál es tu edad? ");
        int edad = entrada.nextInt();
        
        System.out.println("Tu edad es: " + edad);
    }
    
}
