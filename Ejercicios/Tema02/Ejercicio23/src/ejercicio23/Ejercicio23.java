package ejercicio23;

import java.util.Scanner;

/**
 * Programa que calcula el precio total de la compra a partir del precio
 * y de las unidades de un producto.
 *
 * @author israel
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Se crea el objeto Scanner para registrar la entrada del usuario.
        Scanner entrada = new Scanner(System.in);

        /*
         * Se declaran las variables para almacenar el precio, las unidades
         * y el total de la compra.
         */
        double precioProducto, precioCompra;
        int unidadesProducto;

        // Se pide al usuario que introduzca un precio y se almacena.
        System.out.print("Por favor, introduzca el precio del modelo de "
                + "ordenador que desea comprar: ");
        precioProducto = entrada.nextDouble();

        // Se pide al usuario que introduzca las unidades del producto.
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        unidadesProducto = entrada.nextInt();

        // Se realiza la operación para determinar el precio total.
        precioCompra = precioProducto * unidadesProducto;

        // Se imprime por pantalla el precio total de la compra.
        System.out.println("El precio total de su compra es de: " + precioCompra
                + " euros.");
    }
}