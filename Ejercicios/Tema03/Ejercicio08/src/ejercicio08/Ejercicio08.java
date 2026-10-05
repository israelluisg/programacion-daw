package ejercicio08;

import java.util.Scanner;

/**
 *
 * Programa que divide euros en billetes y monedas de cada tipo, mostrando
 * solo aquellos cuyo valor sea distinto de cero.
 * 
 * @author israel
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaro las variables para almacenar la cantidad de billetes y
        // monedas.
        int dinero, billete50, billete20, billete10, billete5, moneda2, moneda1;
        
        // Declaro la variable para almacenar el módulo de las divisiones.
        int resto;
        
        // Creo el objeto Scanner para leer y almacenar las entradas.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, indique una cantidad de dinero: ");
        dinero = entrada.nextInt();
        
        // Hago las operaciones para determinar la cantidad de billetes y 
        // monedas.
        billete50 = dinero / 50;
        resto = dinero % 50;
        
        billete20 = resto / 20;
        resto = resto % 20;
        
        billete10 = resto / 10;
        resto = resto % 10;
        
        billete5 = resto / 5;
        resto = resto % 5;
        
        moneda2 = resto / 2;
        
        moneda1 = resto % 2;
        
        // Creo condiciones para que solo se muestren los billetes y monedas
        // distintos de cero.
        System.out.println(dinero + " Euros se descomponen en:");
        
        if (billete50 != 0){
            System.out.println("Billetes de 50: " + billete50);
        }
        if (billete20 != 0){
            System.out.println("Billetes de 20: " + billete20);
        }
        if (billete10 != 0){
            System.out.println("Billetes de 10: " + billete10);
        }
        if (billete5 != 0){
            System.out.println("Billetes de 5: " + billete5);
        }
        if (moneda2 != 0){
            System.out.println("Monedas de 2 euros: " + moneda2);
        }
        if (moneda1 != 0){
            System.out.println("Monedas de 1 euro: " + moneda1);
        }
    }
    
}
