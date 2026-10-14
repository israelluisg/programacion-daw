package ejercicio34;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
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
        int dias, horas, minutos;
        boolean datosInvalidos;

        // Creo el objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Solicito los datos hasta que sean válidos
        do {
            try {
                // Datos de llegada
                System.out.print("Introduzca el día de llegada: ");
                diaLlegada = entrada.nextInt();

                System.out.print("Introduzca la hora de llegada: ");
                horaLlegada = entrada.nextInt();

                System.out.print("Introduzca el minuto de llegada: ");
                minutoLlegada = entrada.nextInt();

                // Datos de salida
                System.out.print("Ahora, introduzca el dia de salida: ");
                diaSalida = entrada.nextInt();

                System.out.print("Introduzca la hora de salida: ");
                horaSalida = entrada.nextInt();

                System.out.print("Por último, introduzca el minuto de salida: ");
                minutoSalida = entrada.nextInt();

                // Calculo las diferencias entre las fechas
                dias = diaLlegada - diaSalida;
                horas = horaLlegada - horaSalida;
                minutos = minutoLlegada - minutoSalida;

                // Convierto toda la diferencia a minutos
                minutos = minutos + (dias * 1440) + (horas * 60);

                // Convierto los minutos totales a horas y minutos
                horas = minutos / 60;
                minutos = minutos % 60;

                // Compruebo que los datos sean válidos y que el tiempo no sea negativo
                if (horas < 0 || minutos < 0
                        || diaLlegada < 1 || diaLlegada > 31
                        || diaSalida < 1 || diaSalida > 31
                        || horaLlegada < 0 || horaLlegada > 23
                        || horaSalida < 0 || horaSalida > 23
                        || minutoLlegada < 0 || minutoLlegada > 59
                        || minutoSalida < 0 || minutoSalida > 59) {

                    System.out.println("Introduzca unas fechas de llegada y salidas válidas");
                    datosInvalidos = true;

                } else {
                    datosInvalidos = false;

                    // Muestro por pantalla el tiempo total del viaje
                    System.out.println("El tren ha tardado " + horas + " horas y "
                            + minutos + " minutos en llegar al destino.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Introduzca números enteros.");
                entrada.nextLine();
                datosInvalidos = true;
            }

        } while (datosInvalidos);
    }
}