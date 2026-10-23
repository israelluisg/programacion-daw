
package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que pide introducir una contraseña al usuario, si la introduce
 * correctamente lo felicita, si falla tres veces se le muestra un error.
 *
 * @author israel
 */
public class Ejercicio12 {

    // Inicializo la constante CONTRASENIA
    final static int CONTRASENIA = 1234;

    /**
     * Método que pide una contraseña al usuario.
     * @param entrada Scanner que registra la entrada del usuario.
     * @return devuelve la contraseña introducida o 0 si la entrada no es válida.
     */
    public static int pedirContrasenia (Scanner entrada) {
        try {
            System.out.print("Introduzca la contraseña: ");
            return entrada.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero.");
            entrada.nextLine();
            return 0;
        }
    }

    /**
     * Método que comprueba si el número introducido por el usuario es igual a
     * CONTRASENIA.
     * @param numUsuario número introducido por el usuario.
     * @return devuelve true si la contraseña es correcta y false si no lo es.
     */
    public static boolean comprobarContrasenia (int numUsuario) {
        return numUsuario == CONTRASENIA;
    }

    /**
     * Método que muestra si la contraseña es correcta o si se ha denegado
     * el acceso.
     * @param validar indica si la contraseña es correcta.
     */
    public static void mostrarResultado (boolean validar) {
        if (validar) {
            System.out.println("Enhorabuena, tu contraseña es correcta.");
        } else {
            System.out.println("Error de acceso.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables necesarias e inicializo el Scanner y el contador
        Scanner entrada = new Scanner(System.in);
        int numUsuario;
        boolean validar;
        int intentos = 0;

        // Repito la petición hasta acertar la contraseña o alcanzar 3 intentos
        do {
            intentos++;
            numUsuario = pedirContrasenia(entrada);
            validar = comprobarContrasenia(numUsuario);
        } while (!validar && intentos < 3);

        // Muestro el resultado por pantalla
        mostrarResultado(validar);
    }
}
