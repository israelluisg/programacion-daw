package ejercicio32;

import java.util.Scanner;

/**
 * Programa que descompone de forma óptima un importe en euros en billetes
 * y monedas.
 *
 * @author israel
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* 
         * Se declaran las variables para almacenar el importe, el dinero
         * restante y la cantidad de billetes y monedas de cada tipo.
         */
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        int euros, restante;

        // Se crea el objeto Scanner para registrar la entrada del usuario.
        Scanner entrada = new Scanner(System.in);

        /* 
         * Se pide al usuario que introduzca una cantidad de dinero
         * y se almacena.
         */
        System.out.print("Por favor, indique una cantidad de dinero: ");
        euros = entrada.nextInt();

        /* 
         * Se calcula la cantidad de billetes y monedas de cada tipo y se
         * actualiza el importe restante después de cada operación.
         */
        billetes50 = euros / 50;
        restante = euros % 50;

        billetes20 = restante / 20;
        restante = restante % 20;

        billetes10 = restante / 10;
        restante = restante % 10;

        billetes5 = restante / 5;
        restante = restante % 5;

        monedas2 = restante / 2;

        monedas1 = restante % 2;

        /* 
         * Se muestra por pantalla el importe de euros descompuesto en billetes
         * y monedas.
         */
        System.out.println(euros + " euros se descomponen en " + billetes50
                + " billetes de 50, " + billetes20 + " billetes de 20, "
                + billetes10 + " billetes de 10, " + billetes5
                + " billetes de 5, " + monedas2 + " monedas de 2 euros y "
                + monedas1 + " monedas de 1 euro.");
    }
}