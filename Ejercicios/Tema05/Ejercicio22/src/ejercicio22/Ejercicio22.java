package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que simula una tienda de mascotas y gestiona las compras de sus
 * productos, actualizando el stock y calculando el importe total.
 *
 * @author israel
 */
public class Ejercicio22 {

    // Variables globales
    static float precioCompra = 0.0f;
    static boolean compra = true;

    // CONSTANTES
    final static String SI = "si";
    final static String NO = "no";

    /**
     * Método que solicita y valida un número entero mayor que 0.
     *
     * @return número entero introducido.
     */
    public static int pedirEntero() {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean validar;

        do {
            try {
                numero = entrada.nextInt();

                if (numero > 0) {
                    validar = true;
                } else {
                    System.out.print("Error, introduzca un número mayor que 0: ");
                    validar = false;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = false;
                entrada.nextLine();
            }
        } while (!validar);

        return numero;
    }

    /**
     * Método que solicita y valida una respuesta afirmativa o negativa.
     *
     * @return respuesta introducida en minúsculas.
     */
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        boolean validar;
        String respuesta;

        do {
            respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase(SI) || respuesta.equalsIgnoreCase(NO)) {
                validar = true;
            } else {
                System.out.print("Error, introduzca sí o no (sin tilde): ");
                validar = false;
            }
        } while (!validar);

        return respuesta.toLowerCase();
    }

    /**
     * Método que solicita las unidades, comprueba el stock y realiza la compra.
     *
     * @param producto producto elegido.
     */
    public static void pedirUnidades(Producto producto) {
        int unidadesCompra;
        int stock = producto.getStock();

        System.out.println("Ha elegido comprar " + producto.getNombre() + ".");
        System.out.println("¿Cuántas unidades desea?");

        unidadesCompra = pedirEntero();

        if (producto.verificarStock(unidadesCompra)) {
            producto.reducirStock(unidadesCompra);
            precioCompra += producto.getPrecio() * unidadesCompra;
            System.out.println("Venta realizada con éxito.");
        } else {
            System.out.println("Lo sentimos, solo tenemos disponibles "
                    + stock + " unidades.");
        }
    }

    /**
     * Método que finaliza la compra y muestra el importe total si se ha
     * comprado algún producto.
     */
    public static void finalizarCompra() {
        if (precioCompra > 0) {
            System.out.println("El total de su compra asciende a "
                    + precioCompra + " €");
            System.out.println("Muchas gracias. Vuelva cuando quiera.");
        } else {
            System.out.println("Cerrando programa...");
        }
        compra = false;
    }

    /**
     * Método que muestra el menú de productos y gestiona las opciones hasta
     * que finaliza la compra.
     *
     * @param producto1 primer producto.
     * @param producto2 segundo producto.
     * @param producto3 tercer producto.
     */
    public static void mostrarMenuProductos(Producto producto1, Producto producto2, Producto producto3) {
        int numOpcion;

        System.out.println("-- Bienvenido a mi tienda de mascotas --");

        do {
            System.out.println("Pulse 1 para comprar " + producto1.getNombre()
                    + " cuyo precio es de " + producto1.getPrecio()
                    + " euros y el stock es de " + producto1.getStock() + " unidades.");

            System.out.println("Pulse 2 para comprar " + producto2.getNombre()
                    + " cuyo precio es de " + producto2.getPrecio()
                    + " euros y el stock es de " + producto2.getStock() + " unidades.");

            System.out.println("Pulse 3 para comprar " + producto3.getNombre()
                    + " cuyo precio es de " + producto3.getPrecio()
                    + " euros y el stock es de " + producto3.getStock() + " unidades.");

            System.out.println("Pulse 4 para salir.");

            numOpcion = pedirEntero();

            switch (numOpcion) {
                case 1 -> mostrarMenuCompra(producto1);
                case 2 -> mostrarMenuCompra(producto2);
                case 3 -> mostrarMenuCompra(producto3);
                case 4 -> finalizarCompra();
                default -> System.out.print("Error, introduzca una opción válida.");
            }
        } while (compra);
    }

    /**
     * Método que realiza la compra de un producto y pregunta si se desea
     * seguir comprando.
     *
     * @param producto producto elegido.
     */
    public static void mostrarMenuCompra(Producto producto) {
        pedirUnidades(producto);

        System.out.println("¿Desea comprar otro producto? (si/no)");

        switch (pedirRespuesta()) {
            case SI -> {}
            case NO -> finalizarCompra();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pienso para perros", 15.50f, 20);
        Producto producto2 = new Producto("Collar para gatos", 8.95f, 10);
        Producto producto3 = new Producto("Juguete para perros", 5.50f, 15);

        mostrarMenuProductos(producto1, producto2, producto3);
    }
}
