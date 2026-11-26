package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Ejercicio22 {
    
    // Variables globales
    static float precioCompra = 0.0f;
    
    public static int pedirEntero() {
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

    public static boolean verificarStock(int unidadesCompra, Producto producto) {
        return unidadesCompra <= producto.getStock();
    }

    public static void pedirUnidades(Producto producto) {
        int unidadesCompra;
        int stock = producto.getStock();

        System.out.print("Introduzca la cantidad de unidades que desa comprar: ");

        unidadesCompra = pedirEntero();

        if (verificarStock(unidadesCompra, producto)) {
            producto.setStock(stock - unidadesCompra);
            precioCompra +=
            
        } else {
            System.out.println("Error, solo quedan " + stock + " unidades.");
        }
    }
    
    public static void finalizarCompra() {
        
    }
    
    public static void mostrarMenuProductos(Producto producto1, Producto producto2, Producto producto3) {
        int numOpcion;

        do {
            System.out.println("1. " + producto1.getNombre());
            System.out.println("2. " + producto2.getNombre());
            System.out.println("3. " + producto3.getNombre());
            System.out.println("4. Salir");
            System.out.println("Elija el producto que desea comprar: ");

            numOpcion = pedirEntero();

            switch (numOpcion) {
                case 1 ->
                    mostrarMenuCompra(producto1);
                case 2 ->
                    mostrarMenuCompra(producto2);
                case 3 ->
                    mostrarMenuCompra(producto3);
                case 4 ->
                    System.out.print("Cerrando programa...");
                default ->
                    System.out.print("Error, introduzca una opción válida.");
            }
        } while (numOpcion != 4);
    }
    
    public static void mostrarMenuCompra(Producto producto) {
        pedirUnidades(producto);
        
        System.out.println("1. Comprar otro producto");
        System.out.println("2. Finalizar compra");
        System.out.println("Elija una de las opciones: ");
        
        switch (pedirEntero()) {
            case 1 -> {}
            case 2 -> 
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
