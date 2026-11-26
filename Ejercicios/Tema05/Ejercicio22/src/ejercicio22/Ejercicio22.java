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
    static boolean compra = true;
    
    // CONSTANTES
    final static String SI = "si";
    final static String NO = "no";

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
                    System.out.print("Error, introduzca un número mayor a 0: ");
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
    
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        boolean validar;
        String respuesta;
        
        do {
            respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase(SI) || respuesta.equalsIgnoreCase(NO)) {
                validar = true;
            } else {
                System.out.print("Error, introduzca si o no: ");
                validar = false;
            }
        } while (!validar);
        
        return respuesta.toLowerCase();
    }
    
    public static boolean verificarStock(int unidadesCompra, Producto producto) {
        return unidadesCompra <= producto.getStock();
    }

    public static void pedirUnidades(Producto producto) {
        int unidadesCompra;
        int stock = producto.getStock();
        
        System.out.println("Ha elegido comprar " + producto.getNombre() + ".");
        System.out.println("¿Cúantas unidades desea?");

        unidadesCompra = pedirEntero();

        if (verificarStock(unidadesCompra, producto)) {
            producto.setStock(stock - unidadesCompra);
            precioCompra += producto.getPrecio() * unidadesCompra;
            System.out.println("Venta realizada con éxito.");
        } else {
            System.out.println("Lo sentimos, solo tenemos disponibles " 
                    + stock + " unidades.");
        }
    }

    public static void finalizarCompra() {
        System.out.println("El total de su compra asciende a "
                + precioCompra + " €");
        System.out.println("Muchas gracias. Vuelva cuando quiera.");
        compra = false;
    }

    public static void mostrarMenuProductos(Producto producto1, Producto producto2, Producto producto3) {
        int numOpcion;
        
        System.out.println("-- Bienvenido a mi Tienda de Mascotas --");
        
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
            
            System.out.println("Pules 4 para salir.");

            numOpcion = pedirEntero();

            switch (numOpcion) {
                case 1 -> mostrarMenuCompra(producto1);
                case 2 -> mostrarMenuCompra(producto2);
                case 3 -> mostrarMenuCompra(producto3);
                case 4 -> System.out.println("Cerrando programa...");
                default -> System.out.print("Error, introduzca una opción válida.");
            }
        } while (numOpcion != 4 && compra);
    }

    public static void mostrarMenuCompra(Producto producto) {
        pedirUnidades(producto);
        
        System.out.println("¿Desea comprar otro producto?");
        
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
