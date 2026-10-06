package ejercicio16;

/**
 *
 * Programa que muestra por pantalla los números impares entre el número 20 y 
 * el 160, mostrando a su vez la cantidad de números que han sido mostrados por
 * pantalla.
 * 
 * @author israel
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numImpresos = 0;
        
        System.out.print("Los números impares existentes entre el número 20" 
                + " y el 160 son: ");
        for (int i = 20; i <= 160; i++) {
            if ((i % 2) != 0) {
                System.out.print(i + " - ");
                numImpresos++;
            }
        }
        System.out.println("\nLa cantidad de números impares impresos han sido: " 
                + numImpresos);
    }
}