package ejercicio27;

import java.util.Scanner;
/**
 *
 * Programa que permite al usuario adivinar si el resultado del lanzamiento
 * de una moneda será cara o cruz, repitiendo el juego cada vez que falla.
 * 
 * @author israel
 */
public class Ejercicio27 {
    
    /**
     * Método que pide al usuario introducir cara o cruz, comprobando que no
     * introduzca ninguna otra opción.
     * @return Devuelve la palabra introducida por el usuario.
     */
    public static String pedirCara (){
        Scanner entrada = new Scanner (System.in);
        boolean validar = true;
        String caraUsuario;

        do {
            System.out.print("Introduzca cara o cruz: ");
            caraUsuario = entrada.nextLine();
            
            // Compruebo que el usuario ha introducido cara o cruz.
            if (caraUsuario.equalsIgnoreCase("cara") || caraUsuario.equalsIgnoreCase("cruz")) {
                validar = false;
            } else {
                System.out.println("Error, introduzca cara o cruz.");
            }
        } while (validar);

        return caraUsuario;
    }
    
    /**
     * Método que genera aleatoriamente el resultado del lanzamiento de una moneda.
     * @return Devuelve cara o cruz.
     */
    public static String determinarCara () {
        int cara = (int) (Math.random() * 2);
        
        if (cara == 0) {
            return "Cara";
        } else {
            return "Cruz";
        }
    }
    
    /**
     * Método que verifica si el usuario ha acertado.
     * @param caraUsuario Palabra introducida por el usuario.
     * @param caraSistema Palabra generada aleatoriamente por el sistema.
     * @return Devuelve true si el usuario ha acertado o false si ha fallado.
     */
    public static boolean verificarResultado (String caraUsuario, String caraSistema) {
        if (caraUsuario.equalsIgnoreCase(caraSistema)) {
            System.out.println("¡Enhorabuena! Has acertado. La moneda era " + caraSistema + ".");
            return true;
        } else {
            System.out.println("Has perdido. La moneda era " + caraSistema + ". Vuelve a intentarlo.");
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verificar;
        do {
            String caraUsuario = pedirCara();
            String caraSistema = determinarCara();
            verificar = verificarResultado(caraUsuario, caraSistema);
        } while (!verificar);
    }
}