package ejercicio21;

import java.util.Scanner;

/**
 * Programa que descompone un número de segundos en días, horas, minutos
 * y segundos.
 *
 * @author israel
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Se declaran las variables para almacenar el tiempo introducido
         * por el usuario y su descomposición.
         */
        int tiempoUsuario, dias, horas, minutos, segundos;

        // Se crea el objeto Scanner para registrar la entrada del usuario.
        Scanner entrada = new Scanner(System.in);

        /* Se pide al usuario que introduzca una cantidad de segundos
         * y se almacena.
         */
        System.out.print("Por favor, introduzca un número de segundos: ");
        tiempoUsuario = entrada.nextInt();

        /* Se realizan las operaciones para descomponer el tiempo en días,
         * horas, minutos y segundos.
         */
        dias = tiempoUsuario / 86400;
        horas = (tiempoUsuario % 86400) / 3600;
        minutos = (tiempoUsuario % 3600) / 60;
        segundos = tiempoUsuario % 60;

        /* Se muestra por pantalla el tiempo descompuesto en días, horas,
         * minutos y segundos.
         */
        System.out.println(tiempoUsuario + " segundos hacen un total de: "
                + dias + " días, " + horas + " horas, " + minutos
                + " minutos y " + segundos + " segundos.");
    }
}