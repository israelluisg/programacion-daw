package ejercicio32;

import java.util.Scanner;
/**
 *
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
        int añoActual, mesActual, diaActual;
        int añoNacimiento, mesNacimiento, diaNacimiento;
        
        // Creo el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Pido los datos al usuario
        System.out.print("Introduzca el año actual: ");
        añoActual = entrada.nextInt();

        System.out.print("Introduzca el mes actual: ");
        mesActual = entrada.nextInt();

        System.out.print("Introduzca el día actual: ");
        diaActual = entrada.nextInt();

        System.out.print("Ahora, introduzca su año de nacimiento: ");
        añoNacimiento = entrada.nextInt();

        System.out.print("Introduzca su mes de nacimiento: ");
        mesNacimiento = entrada.nextInt();

        System.out.print("Por último, introduzca su día de nacimiento: ");
        diaNacimiento = entrada.nextInt();
        
        // Inicializo las variables con las operaciones
        int años = añoActual - añoNacimiento;
        int meses = mesActual - mesNacimiento;
        int dias = diaActual - diaNacimiento;
        
        // Condición para determinar meses negativos
        if (meses < 0) {
            meses += 12;
            años--;
        }
        
        // Condición para determinar días negativos
        if (dias < 0) {
            switch (dias) {
                case -1:
                case -3:
                case -5:
                case -7:
                case -8:
                case -10: {
                    dias += 31;
                    meses--;
                    break;
                }
                case -4:
                case -6:
                case -9:
                case -11: {
                    dias += 30;
                    meses--;
                    break;
                }
                case -2: {
                    dias += 28;
                    meses--;
                    break;
                }
            }
        }
        
        // Se muestra por pantalla la edad
        System.out.println("Su edad exacta es de " + años 
                + " años, " + meses + " meses y " 
                + dias + " días.");
    }
}