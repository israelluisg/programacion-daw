package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempoUsuario, dias, horas, minutos, segundos;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número de segundos: ");
        tiempoUsuario = entrada.nextInt();
        
        dias = tiempoUsuario / 86400;
        horas = (tiempoUsuario % 86400) / 3600;
        minutos = ((tiempoUsuario % 86400) % 3600) / 60;
        segundos = (tiempoUsuario % 3600) % 60;
        
        System.out.println(dias);
        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(segundos);
    }
}
