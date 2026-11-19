package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que solicita cuatro números enteros y los muestra
 * ordenados de forma creciente utilizando objetos de la clase Numero.
 *
 * @author israel
 */
public class Ejercicio10 {

    /**
     * Solicita un número entero y valida la entrada.
     *
     * @return El número entero introducido.
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
     * Ordena los valores de cuatro objetos Numero y los muestra
     * por pantalla de menor a mayor.
     *
     * @param num1 Primer objeto Numero.
     * @param num2 Segundo objeto Numero.
     * @param num3 Tercer objeto Numero.
     * @param num4 Cuarto objeto Numero.
     */
    public static void ordenarNumeros(Numero num1, Numero num2,
            Numero num3, Numero num4) {
        int aux;

        int numero1 = num1.getValor();
        int numero2 = num2.getValor();
        int numero3 = num3.getValor();
        int numero4 = num4.getValor();

        for (int i = 0; i < 3; i++) {
            if (numero1 > numero2) {
                aux = numero1;
                numero1 = numero2;
                numero2 = aux;
            }

            if (numero2 > numero3) {
                aux = numero2;
                numero2 = numero3;
                numero3 = aux;
            }

            if (numero3 > numero4) {
                aux = numero3;
                numero3 = numero4;
                numero4 = aux;
            }
        }

        System.out.println("Números ordenados de forma creciente: "
                + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        Numero num1 = new Numero(pedirNumero());

        System.out.print("Introduzca el segundo número: ");
        Numero num2 = new Numero(pedirNumero());

        System.out.print("Introduzca el tercer número: ");
        Numero num3 = new Numero(pedirNumero());

        System.out.print("Introduzca el cuarto número: ");
        Numero num4 = new Numero(pedirNumero());

        ordenarNumeros(num1, num2, num3, num4);
    }
}
