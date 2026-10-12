package ejercicio31;

/**
 *
 * Programa que genera 3 números aleatorios impares y los muestra por pantalla.
 * 
 * @author israel
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro e inicializo las variables
        int aleatorio;
        int impar1 = 0, impar2 = 0, impar3 = 0;
        int numGenerados = 0;

        do {
            aleatorio = (int) (Math.random() * 100 + 1);

            // Compruebo si el número generado es impar
            if (aleatorio % 2 != 0) {
                if (impar1 == 0) {
                    impar1 = aleatorio;
                } else if (impar2 == 0) {
                    impar2 = aleatorio;
                } else {
                    impar3 = aleatorio;
                }
            }
            numGenerados++;
        } while (impar1 == 0 || impar2 == 0 || impar3 == 0);

        // Muestro los tres números impares y la cantidad de números generados
        System.out.println("Se han generado aleatoriamente los números impares "
                + impar1 + ", " + impar2 + " y " + impar3
                + ". Se han necesitado generar " + numGenerados
                + " números aleatorios.");
    }
}