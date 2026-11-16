package ejercicio01;

/**
 *
 * @author israel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche miCoche = new Coche ();
        Coche cochePadre = new Coche ();
        
        // Operaciones miCoche
        miCoche.setModelo("Modelo1");
        miCoche.setMarca("Marca1");
        miCoche.setColor("Color1");
        
        // Operaciones cochePadre
        cochePadre.setModelo("Modelo2");
        cochePadre.setMarca("Marca2");
        cochePadre.setColor("Color2");
        
        // Arrancar
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        // Acelerar miCoche
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche(); 
        }
        
        // Frenar miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche(); 
        }
        
        // Acelerar cochePadre
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche(); 
        }
        
        // Apagar cochePadre
        cochePadre.apagarCoche();
        
        // Mostrar estados del coche
        miCoche.obtenerEstado();
        System.out.println("");
        cochePadre.obtenerEstado();
    }
}