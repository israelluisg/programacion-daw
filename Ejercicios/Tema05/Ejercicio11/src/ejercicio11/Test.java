package ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que crea dos objetos Numero, el usuario les asigna un valor y
 * dependiendo de su valor se realizan distintas operaciones.
 * 
 * @author israel
 */
public class Test {
    
    /**
     * Método que pide introducir un número al usuario.
     * @return Devuelve el número introducido.
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean validar;
        
        do {
            try {
                numero = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return numero;
    }
    
    /**
     * Devuelve la suma de dos objetos Numero.
     * @param num1 Primer objeto Numero.
     * @param num2 Segundo objeto Numero.
     * @return Devuelve la suma de los objetos num1 y num2.
     */
    public static int sumarNumeros(Numero num1, Numero num2) {
        return num1.getValor() + num2.getValor();
    }
    
    /**
     * Devuelve la multiplicación de dos objetos Numero.
     * @param num1 Primer objeto Numero.
     * @param num2 Segundo objeto Numero.
     * @return Devuelve la multiplicación de los objetos num1 y num2.
     */
    public static int multiplicarNumeros(Numero num1, Numero num2) {
        return num1.getValor() * num2.getValor();
    }
    
    /**
     * Dependiendo del valor de numero1 se realiza una multiplicación o una
     * suma entre numero1 y numero2 y se muestra por pantalla.
     * @param num1 Primer objeto Numero.
     * @param num2 Segundo objeto Numero.
     */
    public static void realizarOperacion(Numero num1, Numero num2) {
        // Le asigno a cada variable el valor de los objetos Numero
        int numero1 = num1.getValor();
        int numero2 = num2.getValor();
        
        if (numero1 > 10) {
            System.out.println("La multiplicación de " + numero1 + " x " + numero2 
                + " es igual a " + (multiplicarNumeros(num1, num2)));
        } else {
            System.out.println("La suma de " + numero1 + " + " + numero2 
                + " es igual a " + (sumarNumeros(num1, num2)));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo los objetos Numero num1 y num2
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        
        // Se establece un valor a num1
        System.out.print("Introduzca el primer número: ");
        num1.setValor(pedirNumero());
        
        // Se establece un valor a num2
        System.out.print("Introduzca el segundo número: ");
        num2.setValor(pedirNumero());
        
        realizarOperacion(num1, num2);
    }
}