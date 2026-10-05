package ejercicio18;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables
        int i = 0;
        int contraseña = 1234;
        int entradaUsuario;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        /*
         * Creo un bucle do-while, si el usuario introduce correctamente el
         * número almacenado en la variable contraseña se le felicitará,
         * por el contrario si falla 3 veces se mostrará por pantalla un error
         */
        do{
            System.out.print("Introduzca la contraseña: ");
            entradaUsuario = entrada.nextInt();
            if (entradaUsuario == contraseña){
                System.out.println("Enhorabuena has introducido correctamente la contraseña.");
                i = 4;
            } 
            i++;
        } while (i < 3);
        
        // Creo el for para mostrar el error por pantalla
        if (i == 3){
            System.out.println("Error al introducir la contraseña.");
        }
    }
}