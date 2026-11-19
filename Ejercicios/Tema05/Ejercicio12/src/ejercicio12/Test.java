package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que crea un objeto Triángulo y el usuario añade el valor de ambos
 * catetos, posteriormente calcula la hipotenusa y muestra el resultado por
 * pantalla.
 * 
 * @author israel
 */
public class Test {
    
    /**
     * Método que pide un número al usuario y lo valida.
     * @param mensaje mensaje personalizado que se muestra en el método
     * @return número introducido por el usuario.
     */
    public static double pedirNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        
        double numero = 0;
        boolean validar;
        
        System.out.print(mensaje);
        
        do {
            try {
                numero = entrada.nextDouble();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número válido: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return numero;
    }
    
    /**
     * Se calcula la hipotenusa a partir de dos catetos mediante el teorema de 
     * Pitágoras.
     * @param triangulo objeto Triángulo para realizar el cálculo.
     * @return la hipotenusa obtenida de los dos catetos del objeto.
     */
    public static double calcularHipotenusa(Triangulo triangulo) {
        return Math.sqrt(Math.pow(triangulo.getCateto1(), 2)
                + Math.pow(triangulo.getCateto2(), 2));
    }
    
    /**
     * Muestra el resultado de la hipotenusa a partir de dos catetos de un
     * objeto Triángulo.
     * @param triangulo objeto del cual se muestra el cálculo de la hipotenusa.
     */
    public static void mostrarHipotenusa(Triangulo triangulo) {
        System.out.println("La hipotenusa de un triángulo cuyos catetos son " 
                + triangulo.getCateto1() + " y " + triangulo.getCateto2() 
                + " es " + calcularHipotenusa(triangulo));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el objeto triángulo y se le añaden dos parámetros
        Triangulo triangulo = new Triangulo(
                pedirNumero("Introduzca el valor del primer cateto: "), 
                pedirNumero("Introduzca el valor del segundo cateto: "));
        
        // Se muestra el resultado del cálculo de la hipotenusa
        mostrarHipotenusa(triangulo);
    }

}