package ejercicio27;

import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio27 {
    
    public static String pedirCara (){
        System.out.print("Introduzca cara o cruz: ");
        Scanner entrada = new Scanner (System.in);
        
        return entrada.nextLine();
    }
    
    public static String determinarCara () {
        int cara =  (int) (Math.random() * 2);
        
        if (cara == 0) {
            return "Cara";
        } else {
            return "Cruz";
        }
    }
    
    public static boolean verificarResultado (String caraUsuario, String caraSistema) {
        if (caraUsuario.equalsIgnoreCase(caraSistema)) {
            System.out.println("Enhorabuena, era la moneda era " + caraSistema);
            return true;
        } else {
            System.out.println("Vuelvelo a intentar, la moneda era " + caraSistema);
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verificar;
        do {
            String caraSistema= determinarCara();
            String caraUsuario = pedirCara();
            verificar = verificarResultado(caraUsuario, caraSistema);
        } while (!verificar);
    }
}