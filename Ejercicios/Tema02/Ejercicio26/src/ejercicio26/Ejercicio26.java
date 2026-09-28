package ejercicio26;
import java.util.Scanner;
/**
 * 
 * Programa que separa un número de 4 cifras y muestra cada una de sus cifras
 * por pantalla.
 * 
 * @author israel
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Se declaran las variables para almacenar el número introducido por
         * el usuario y cada una de sus cifras individualmente.
         */
        int numUsuario, primeraCifra, segundaCifra, terceraCifra, cuartaCifra;
        
        /* Se crea el objeto Scanner para leer los datos introducidos 
         * por el usuario.
         */
        Scanner entrada = new Scanner(System.in);
        
        // Se le pide al usuario que introduzca un número y se almacena.
        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        numUsuario = entrada.nextInt();
        
        
        // Se realizan las operaciones para separar las cifras.
        primeraCifra = numUsuario / 1000;
        segundaCifra = (numUsuario % 1000) / 100;
        terceraCifra = (numUsuario % 100) / 10;
        cuartaCifra = numUsuario % 10;
        
        // Se muestran por pantalla las cifras individualmente.
        System.out.println("La primera cifra es: " + primeraCifra);
        System.out.println("La segunda cifra es: " + segundaCifra);
        System.out.println("La tercera cifra es: " + terceraCifra);
        System.out.println("La cuarta cifra es: " + cuartaCifra);
    }
    
}
