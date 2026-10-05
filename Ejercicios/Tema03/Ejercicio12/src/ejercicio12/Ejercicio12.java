package ejercicio12;

/**
 *
 * Programa que muestra por pantalla los números pares del número 11 al 133.
 * 
 * @author israel
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializo la variable num
        int num = 11;
        
        // Creo un bucle do-while que muestra por pantalla solo números pares
        do{
            if((num % 2) == 0)
                System.out.println(num);
            num++;
        } while (num < 133);
    }
}