package ejercicio25;

/**
 *
 * Programa que muestra por pantalla la suma de todos los números pares entre
 * num1 y num2.
 * 
 * @author israel
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializo las variables
        int num1 = 17;
        int num2 = 139;
        int suma = 0;
        
        // Creo un bucle que suma todos los números pares
        for (int i = num1; i < num2; i++) {
            if ((i % 2) == 0){
                suma += i;
            }
        }
        
        // Muestro por pantalla la suma de todos los números pares
        System.out.println("La suma total de todos los números pares entre " 
                + num1 + " y " + num2 + " es " + suma + ".");
    }

}