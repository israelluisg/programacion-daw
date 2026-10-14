package ejercicio32;

import java.util.Scanner;

/**
 * Programa que calcula la edad de una persona dependiendo de su fecha de
 * nacimiento y la fecha actual.
 *
 * @author israel
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaro las variables
        int anioActual, mesActual, diaActual;
        int anioNacimiento, mesNacimiento, diaNacimiento;

        // Creo el objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Solicito los datos al usuario
        System.out.print("Introduzca el año actual: ");
        anioActual = entrada.nextInt();

        System.out.print("Introduzca el mes actual: ");
        mesActual = entrada.nextInt();

        System.out.print("Introduzca el día actual: ");
        diaActual = entrada.nextInt();

        System.out.print("Ahora, introduzca su año de nacimiento: ");
        anioNacimiento = entrada.nextInt();

        System.out.print("Introduzca su mes de nacimiento: ");
        mesNacimiento = entrada.nextInt();

        System.out.print("Por último, introduzca su día de nacimiento: ");
        diaNacimiento = entrada.nextInt();

        // Cálculo inicial de la edad
        int anios = anioActual - anioNacimiento;
        int meses = mesActual - mesNacimiento;
        int dias = diaActual - diaNacimiento;

        // Corrección de días negativos
        if (dias < 0) {

            switch (mesActual - 1) {

                // Meses de 31 días
                case 0, 1, 3, 5, 7, 8, 10 -> {
                    dias += 31;
                    meses--;
                }

                // Meses de 30 días
                case 4, 6, 9, 11 -> {
                    dias += 30;
                    meses--;
                }

                // Febrero: 28 o 29 días
                case 2 -> {

                    // Comprobación de año bisiesto
                    if ((anioActual % 4) == 0 && (anioActual % 100) != 0) {
                        dias += 29;
                    } else if ((anioActual % 400) == 0) {
                        dias += 29;
                    } else {
                        dias += 28;
                    }

                    meses--;
                }
            }
        }

        // Corrección de meses negativos
        if (meses < 0) {
            meses += 12;
            anios--;
        }

        // Mostrar la edad calculada
        System.out.println("Su edad exacta es de " + anios
                + " años, " + meses + " meses y "
                + dias + " días.");
    }
}
