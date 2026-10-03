package retocreadordepersonaje;

import java.util.Scanner;

/**
 * Programa que crea un personaje a partir de datos introducidos por teclado
 * y calcula automáticamente sus atributos.
 *
 * @author israel
 */
public class RetoCreadorDePersonaje {

    // Constantes del juego
    static final int VIDA_POR_NIVEL = 20;
    static final int XP_POR_NIVEL = 200;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Datos del personaje
        char letraInicial;
        int edad, nivel, vidaInicial, xp;
        double altura;

        // Datos del juego
        int danio = 35;

        // Atributos calculados
        int vidaMaxima, xpSiguienteNivel, vidaRestante;

        // Creación de Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Comencemos con la creación de personaje,"
                + " introduce los siguientes datos:");

        // FASE 1: LECTURA DE DATOS
        System.out.print("Indica tu letra inicial: ");
        letraInicial = entrada.next().charAt(0);

        System.out.print("Indica tu edad: ");
        edad = entrada.nextInt();

        System.out.print("Indica tu altura: ");
        altura = entrada.nextDouble();

        System.out.print("Indica tu nivel: ");
        nivel = entrada.nextInt();

        System.out.print("Indica tu vida inicial: ");
        vidaInicial = entrada.nextInt();

        System.out.print("Indica tu experiencia: ");
        xp = entrada.nextInt();

        // Datos introducidos
        System.out.println("\n================================");
        System.out.println("CREACIÓN DE PERSONAJE");
        System.out.println("================================");
        System.out.println("Inicial: " + letraInicial);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida inicial: " + vidaInicial);
        System.out.println("Experiencia: " + xp);

        // FASE 2: ATRIBUTOS CALCULADOS
        vidaMaxima = nivel * VIDA_POR_NIVEL;
        xpSiguienteNivel = nivel * XP_POR_NIVEL;
        vidaRestante = vidaInicial - danio;

        // Ficha final del personaje
        System.out.println("\n================================");
        System.out.println("PERSONAJE");
        System.out.println("================================");
        System.out.println("Nombre: " + letraInicial
                + " | Edad: " + edad + " años");
        System.out.println("Vida inicial: " + vidaInicial
                + " | Vida máx: " + vidaMaxima);
        System.out.println("Experiencia: " + xp
                + " | XP sig. nivel: " + xpSiguienteNivel);
        System.out.println("[!] Tras recibir " + danio + " pts de daño:");
        System.out.println("Vida restante: " + vidaRestante);

    }

}