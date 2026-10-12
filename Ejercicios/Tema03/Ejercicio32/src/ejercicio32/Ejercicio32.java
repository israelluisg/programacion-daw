package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int añoActual, mesActual, diasActual;
        int añoNacimiento, mesNacimiento, diasNacimiento;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el año actual: ");
        añoActual = entrada.nextInt();

        System.out.print("Introduzca el mes actual: ");
        mesActual = entrada.nextInt();

        System.out.print("Introduzca el día actual: ");
        diasActual = entrada.nextInt();

        System.out.print("Ahora, introduzca su año de nacimiento: ");
        añoNacimiento = entrada.nextInt();

        System.out.print("Introduzca su mes de nacimiento: ");
        mesNacimiento = entrada.nextInt();

        System.out.print("Por último, introduzca su día de nacimiento: ");
        diasNacimiento = entrada.nextInt();
        
        System.out.println("Su edad exacta es de " + (añoActual - añoNacimiento) 
                + " años, " + (mesActual - mesNacimiento) + " meses y " 
                + (diasActual - diasNacimiento) + " días.");
    }
}