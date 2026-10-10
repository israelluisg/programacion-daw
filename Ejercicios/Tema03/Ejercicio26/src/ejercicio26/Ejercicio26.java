
package ejercicio26;

/**
 *
 * Programa que muestra por pantalla la suma de todos los números impares entre
 * num1 y num2.
 *
 * @author israel
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializo las variables
        int num1 = 111;
        int num2 = 222;
        int suma = 0;

        // Creo un bucle que suma todos los números impares
        for (int i = num1 + 1; i < num2; i++) {
            if ((i % 2) != 0) {
                suma += i;
            }
        }

        // Muestro por pantalla la suma de todos los números impares
        System.out.println("La suma total de todos los números impares entre "
                + num1 + " y " + num2 + " es " + suma + ".");
    }
}
