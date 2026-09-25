package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioProducto, precioCompra;
        int unidadesProducto; 
        
        System.out.print("Por favor, introduzca el precio del modelo de " 
                + "ordenador que desea comprar: ");
        precioProducto = entrada.nextDouble();
        
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        unidadesProducto = entrada.nextInt();
        
        precioCompra = precioProducto * unidadesProducto;
        
        System.out.println("El precio total de su compra es de: " + precioCompra 
                + " Euros.");
        
    }
    
}
