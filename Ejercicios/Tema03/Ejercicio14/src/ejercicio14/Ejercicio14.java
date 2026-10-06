package ejercicio14;

/**
 *
 * Programa que muestra por pantalla los 100 primeros números pares.
 * 
 * @author israel
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Inicializo las variables num y par
        int num = 0;
        int contadorPares = 0; // Esta variable es usada para contar cuantas
                               // veces se muestra un número par
        
        // Creo un bucle que muestra los 100 primeros números pares
        while(contadorPares < 100){
            if ((num % 2) == 0){
                System.out.println(num);
                contadorPares++;
            }
            num++;
        }
    }
}