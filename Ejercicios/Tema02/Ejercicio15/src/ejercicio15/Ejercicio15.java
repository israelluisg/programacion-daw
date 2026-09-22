package ejercicio15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        
        int horas = tiempo / 3600;
        int minutos = ((tiempo % 3600) / 60);
        int segundos = (tiempo % 60);
        
        
        System.out.println(tiempo + " segundos hacen un total de: " + horas 
                + " horas " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
