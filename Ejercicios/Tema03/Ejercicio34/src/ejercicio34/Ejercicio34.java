package ejercicio34;

import java.util.Scanner;

/**
 *
 * Programa que calcula el tiempo total desde que un tren sale hasta que llega.
 * 
 * @author israel
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables
        int diaLlegada, horaLlegada, minutoLlegada;
        int diaSalida, horaSalida, minutoSalida;
        
        // Creo el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Pido los datos al usuario y los registro
        System.out.print("Introduzca el día de llegada: ");
        diaLlegada = entrada.nextInt();

        System.out.print("Introduzca la hora de llegada: ");
        horaLlegada = entrada.nextInt();

        System.out.print("Introduzca el minuto de llegada: ");
        minutoLlegada = entrada.nextInt();

        System.out.print("Ahora, introduzca el dia de salida: ");
        diaSalida = entrada.nextInt();

        System.out.print("Introduzca la hora de salida: ");
        horaSalida = entrada.nextInt();

        System.out.print("Por último, introduzca el minuto de salida: ");
        minutoSalida = entrada.nextInt();
        
        // Inicializo las variables con las operaciones
        int dias = diaLlegada - diaSalida;
        int horas = horaLlegada - horaSalida;
        int minutos = minutoLlegada - minutoSalida;
        
        // Condición por si las horas son negativas
        if (horas < 0) {
            horas += 24;
            dias--;
        }
        
        // Condición por si los minutos son negativos
        if (minutos < 0) {
            minutos += 60;
            horas--;
        }
        
        // Se muestra por pantalla el tiempo total
        System.out.println("Tardó " + dias 
                + " días, " + horas + " horas y " 
                + minutos + " minutos.");
    }
}