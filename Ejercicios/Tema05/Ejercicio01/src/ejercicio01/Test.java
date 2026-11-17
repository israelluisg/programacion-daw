package ejercicio01;

/**
 *
 * Programa que crea dos objetos de la clase Coche, establece sus
 * características, realiza distintas operaciones y muestra sus estados.
 * 
 * @author israel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo los objetos miCoche y cochePadre de la clase Coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        // Establezco las características de miCoche
        miCoche.establecerModelo("Corolla");
        miCoche.establecerMarca("Toyota");
        miCoche.establecerColor("Azul");
        
        // Establezco las características de cochePadre
        cochePadre.establecerModelo("León");
        cochePadre.establecerMarca("SEAT");
        cochePadre.establecerColor("Gris");
        
        // Llamo al método arrancarCoche para ambos objetos
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        // Llamo al método acelerarCoche para miCoche 5 veces
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche(); 
        }
        
        // Llamo al método frenarCoche para miCoche 2 veces
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche(); 
        }
        
        // Llamo al método acelerarCoche para cochePadre 3 veces
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche(); 
        }
        
        // Llamo al método apagarCoche para cochePadre
        cochePadre.apagarCoche();
        
        // Muestro el estado de ambos coches mediante obtenerEstado
        miCoche.obtenerEstado();
        System.out.println();
        cochePadre.obtenerEstado();
    }
}