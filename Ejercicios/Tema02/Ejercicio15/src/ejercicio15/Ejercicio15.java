package ejercicio15;

/**
 * 
 * Programa que convierte 10.000 segundos en horas, minutos y segundos.
 * 
 * @author israel
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se inicializa la variable tiempo.
        int tiempo = 10000;
        
        /* Se realizan las operaciones para pasar los segundos a horas, 
         * minutos y segundos.
         */
        int horas = tiempo / 3600;
        int minutos = ((tiempo % 3600) / 60);
        int segundos = (tiempo % 60);
        
        /* Se imprime por pantalla el tiempo descompuesto en horas, minutos y
         * segundos.
         */
        System.out.println(tiempo + " segundos hacen un total de: " + horas 
                + " horas " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
