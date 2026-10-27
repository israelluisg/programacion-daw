package ejercicio17;

import java.util.Scanner;
/**
 *
 * Programa que juega con el usuario a adivinar una letra, indicandole que tan
 * cerca está.
 * 
 * @author israel
 */
public class Ejercicio17 {
    
    /**
     * Método que pide la letra al usuario.
     * @return el número de la letra.
     */
    public static int pedirNumero () {
        Scanner entrada = new Scanner (System.in);
        return entrada.nextLine().charAt(0);
    }
    
    /**
     * Método que determina un número aleatorio que se utiliza como letra.
     * @return devuelve la letra aleatoria.
     */
    public static int determinarLetra () {
        return  (int) (Math.random () * 26) + 97;
    }
    
    /**
     * Método que determina que tan cerca está el usuario de acertar la letra
     * correcta.
     * @param letraUsuario Dato introducido por el usuario.
     * @param letraSistema Dato introducido por el programa de forma aleatoria.
     */
    public static void determinarResultado (int letraUsuario, int letraSistema) {
        if (letraUsuario == letraSistema) {
            System.out.println("Enhorabuena, has acertado la letra.");
        } else if (letraUsuario < letraSistema) {
            System.out.println("La letra está después.");
        } else {
            System.out.println("La letra está antes.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int letraUsuario;
        int intentos = 0;
        
        int letraSistema = determinarLetra();
        
        do {
            System.out.print("Introduzca la letra: ");
            intentos++;
            letraUsuario = pedirNumero();
            determinarResultado(letraUsuario, letraSistema);
        } while (letraUsuario != letraSistema);
        
        System.out.println("Lo conseguiste en " + intentos + " intentos.");
    }
}