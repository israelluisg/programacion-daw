package ejercicio13;

/**
 *
 * Programa que crea un objeto Saludo y lo muestra 5 veces por pantalla.
 * 
 * @author israel
 */
public class Ejercicio13 {
    
    /**
     * Método que muestra el valor del objeto Saludo por pantalla 5 veces.
     * @param frase objeto Saludo que se mostrará por pantalla.
     */
    public static void mostrarFrase(Saludo frase) {
        for (int i = 0; i < 5; i++) {
            System.out.println(frase.getFrase());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarFrase(new Saludo("Hola, que tal"));
    }

}