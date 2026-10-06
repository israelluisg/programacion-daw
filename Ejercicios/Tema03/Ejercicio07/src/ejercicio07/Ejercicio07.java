package ejercicio07;

import java.util.Scanner;
/**
 *
 * Programa que indica si un día de la semana es laborable o no.
 * 
 * @author israel
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable diasemana
        int diasemana;
        
        // Inicializo la variable laborable
        boolean laborable = false;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el número de un día de la semana: ");
        diasemana = entrada.nextInt();
        
        // Creo un switch para determinar si el día es laborable o no
        switch(diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
        }
        
        /* 
         * Creo una condición en caso de que el usuario introduzca un valor 
         * incorrecto y determino condiciones para mostrar por pantalla si es un
         * laborable o no
         */ 
        if (diasemana < 1 || diasemana > 7) {
            System.out.println("Día introducido invalido.");
        } else if (laborable == true) {
            System.out.println("El día " + diasemana + " es un día laborable.");
        } else {
            System.out.println("El día " + diasemana + " no es un día laborable");
        }
        
        
    }
}