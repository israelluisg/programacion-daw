package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Ejercicio22 {

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
                case 1, 2, 3 -> mostrarMenuCompra(numOpcion);
                case 4 -> System.out.print("Cerrando programa...");
                default -> System.out.print("Error, introduzca una opción válida: ");
            }
        } while (numOpcion != 4);
    }
    
    public static void mostrarMenuCompra(int numOpcion) {
        System.out.println("Funciona");
} 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();
        mostrarMenuProductos(producto1, producto2, producto3);
    }

}
