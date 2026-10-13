package ejercicio28;

/**
 *
 * Programa que genera un número aleatorio entre el 1 y el 100 y muestra por
 * pantalla si es par o impar.
 * 
 * @author israel
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se guarda en la variable aleatorio un número aleatorio entre 1 y 100
        int aleatorio = (int) (Math.random() * 100 + 1);
        
        // Se determina si el número aleatorio es par o impar
        if ((aleatorio % 2) == 0) {
            System.out.println("El número aleatorio " + aleatorio + " es par.");
        } else {
            System.out.println("El número aleatorio " + aleatorio + " es impar.");
        }
    }

}