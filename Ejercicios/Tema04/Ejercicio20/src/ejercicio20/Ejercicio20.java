package ejercicio20;

import java.util.Scanner;
/**
 *
 * Programa que hace un examen al usuario, indicandole si las respuestas son 
 * correctas o no y la puntuación final del examen.
 * 
 * @author israel
 */
public class Ejercicio20 {
    
    // Inicializo las constantes
    public static final String RESPUESTA1 = "Madrid";
    public static final String RESPUESTA2 = "Colón";
    
    /**
     * Método que pide la palabra al usuario.
     * @return Devuelve la palabra introducida por el usuario.
     */
    public static String pedirPalabra () {
        Scanner entrada = new Scanner (System.in);
        
        return entrada.nextLine();
    }
    
    /**
     * Método que hace la primera pregunta y la valída.
     * @return Devuelve la puntuación obtenida de la pregunta.
     */
    public static int hacerPregunta1 () {
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        boolean validar = verificarRespuesta(RESPUESTA1, pedirPalabra());
        if (validar) {
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería Madrid.");
            return 0;
        }
        
    }
    
    /**
     * Método que hace la segunda pregunta y la valída.
     * @return Devuelve la puntuación obtenida de la pregunta.
     */
    public static int hacerPregunta2 () {
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");
        boolean validar = verificarRespuesta(RESPUESTA2, pedirPalabra());
        if (validar) {
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería Colón.");
            return 0;
        }
        
    }
    
    /**
     * Método que verifica si la respuesta introducida por el usuario es correcta.
     * @param respuesta Dato de una de las constantes.
     * @param respuestaUsuario Dato introducido por el usuario.
     * @return Devuelve si es correcta o no.
     */
    public static boolean verificarRespuesta (String respuesta, String respuestaUsuario) {
        return respuesta.equals(respuestaUsuario);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacion = 0;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        puntuacion += hacerPregunta1();
        puntuacion += hacerPregunta2();
        
        System.out.println("NOTA DEL EXAMEN: " + puntuacion);
    }
}