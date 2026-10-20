package operaciones;

/**
 *
 * @author israel
 */
public class Operaciones {
    
    /**
     * Método que determina y muestra por pantalla si numUsuario es par o impar.
     * @param numUsuario numero entero a determinar su paridad.
     */
    public static void paridad (int numUsuario) {
        // Mediante condiciones determino si numUsuario es par o impar
        if ((numUsuario % 2) == 0) {
            System.out.println("El número " + numUsuario + " es par.");
        } else {
            System.out.println("El número " + numUsuario + " es impar.");
        }
    }
}