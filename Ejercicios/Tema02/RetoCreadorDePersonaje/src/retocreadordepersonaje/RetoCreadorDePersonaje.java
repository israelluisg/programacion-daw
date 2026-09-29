package retocreadordepersonaje;

import java.util.Scanner;

/**
 *
 * @author israel
 */
public class RetoCreadorDePersonaje {

    /**
     * @param args the command line arguments
     */
    
    // Constantes
    final int VIDA_POR_NIVEL = 20;
    final int XP_POR_NIVEL = 200;
    
    public static void main(String[] args) {
        
        int  edad, nivel, vidaInicial, xp;
        char letraInicial;
        double altura;
        // Variables locales del juego
        int vidaMaxima, xpSiguienteNivel, vidaRestante;
        
        // Creación de Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Comencemos con la creación de personaje," 
                + " introduce los siguientes datos:");
        
        System.out.print("Indica tu letra inicial: ");
        letraInicial = entrada.next().charAt(0);

        System.out.print("Indica tu edad: ");
        edad = entrada.nextInt();
        
        System.out.print("Indica tu altura: ");
        altura = entrada.nextDouble();
        
        
    }
    
}
