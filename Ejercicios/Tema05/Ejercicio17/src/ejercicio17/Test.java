package ejercicio17;

import java.util.Scanner;
/**
 *
 * Programa que realiza un examen de cuatro preguntas
 * y muestra la nota obtenida.
 *
 * @author israel
 */
public class Test {
    // Atributo global
    static double nota = 0;
    
    /**
     * Método que solicita una respuesta al usuario.
     * @return respuesta introducida.
     */
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextLine();
    }
    
    /**
     * Método que comprueba si la respuesta es correcta.
     * @param pregunta objeto Enunciado que se comprueba.
     * @param respuesta respuesta introducida por el usuario.
     * @return true si es correcta, false en caso contrario.
     */
    public static boolean comprobarRespuesta(Enunciado pregunta, String respuesta) {
        return (pregunta.getRespuesta().equalsIgnoreCase(respuesta));
    }
    
    /**
     * Método que muestra el resultado de una pregunta
     * y suma puntos si es correcta.
     * @param comprobacion resultado de comprobar la respuesta.
     * @param pregunta objeto Enunciado de la pregunta.
     */
    public static void mostrarResultado(boolean comprobacion, Enunciado pregunta) {
        if (comprobacion) {
            System.out.println("Enhorabuena! la respuesta era: " 
                    + pregunta.getRespuesta());
            nota += 2.5;
        } else {
            System.out.println("Fallaste! la respuesta correcta era: " 
                    + pregunta.getRespuesta());
        }
    }
    
    /**
     * Método que muestra una pregunta y comprueba la respuesta.
     * @param pregunta objeto Enunciado que se muestra.
     */
    public static void mostrarPregunta(Enunciado pregunta) {
        System.out.println(pregunta.getPregunta());
        mostrarResultado(comprobarRespuesta(pregunta, pedirRespuesta()), pregunta);
    }
    
    /**
     * Método que muestra la nota final del examen.
     */
    public static void mostrarPuntuacion() {
        System.out.println("Tu nota es un: " + nota);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo los 4 objeto Enunciado
        Enunciado pregunta1 = new Enunciado("¿Cuál es la capital de España?", "Madrid");
        Enunciado pregunta2 = new Enunciado("¿Cuánto es 5 + 5?", "10");
        Enunciado pregunta3 = new Enunciado("¿Cuántos días tiene una semana?", "7");
        Enunciado pregunta4 = new Enunciado("¿Cuántos meses tiene un año?", "12");
        
        // Realizo las pregunta al usuario
        mostrarPregunta(pregunta1);
        mostrarPregunta(pregunta2);
        mostrarPregunta(pregunta3);
        mostrarPregunta(pregunta4);
        
        // Muestro la nota obtenida a partir de las preguntas al usuario
        mostrarPuntuacion();
        
    }

}