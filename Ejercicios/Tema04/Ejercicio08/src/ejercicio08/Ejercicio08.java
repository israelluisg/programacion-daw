package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que pide un número al usuario y lo descompone en diferentes tipos de
 * bileltes y monedas mostrando solo los mayores que 0.
 * 
 * @author israel
 */
public class Ejercicio08 {
    
    /**
     * Método que descompone una cantidad de dinero en diferentes tipos de
     * billetes y monedas, mostrando por pantalla solo los mayores de 0.
     * @param cantidadDinero 
     */
    public static void descomponerDinero(int cantidadDinero) {
        // Declaro las variables
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        int restante;
        
        // Operaciones para descomponer cantidadDinero
        billetes50 = cantidadDinero / 50;
        restante = cantidadDinero % 50;

        billetes20 = restante / 20;
        restante = restante % 20;

        billetes10 = restante / 10;
        restante = restante % 10;

        billetes5 = restante / 5;
        restante = restante % 5;

        monedas2 = restante / 2;

        monedas1 = restante % 2;
        
        // Muestro solo los valores mayores que cero
        System.out.println(cantidadDinero + " euros se descomponen en:");
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        } if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        } if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        } if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        } if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        } if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro la variable cantidadDinero
        int cantidadDinero;
        
        // Creo el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner(System.in);
        
        try {
            // Pido al usuario el dato
            System.out.print("Por favor, indique una cantidad de dinero: ");
            cantidadDinero = entrada.nextInt();
            
            // Llamo al método descomponerDinero
            descomponerDinero(cantidadDinero);
            
        } catch (InputMismatchException e) {
            System.out.println("Error, introduzca un número entero");
        }
    }
}