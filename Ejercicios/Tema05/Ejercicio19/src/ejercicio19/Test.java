package ejercicio19;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Test {
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el nombre del empleado: ");
        return entrada.nextLine();
    }
    
    public static int pedirNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean validar;
        
        System.out.print(mensaje);
        
        do {
            try {
                numero = entrada.nextInt();
                
                if (numero > 0) {
                    validar = false;
                } else {
                    System.out.print("Error, introduzca un número mayor a 0: ");
                    validar = true;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return numero;
    }
    
    
    public static double calcularSueldo(int horas, int tarifaHora) {
        double pago;
        
        if (horas < 40) {
            pago = horas * tarifaHora;
        } else {
            pago = (40 * tarifaHora) + ((horas - 40) * (tarifaHora * 1.5)); 
        }
        
        return pago;
    }
    
    public static void mostrarSueldo(Empleado empleado) {
        String nombre = empleado.getNombre();
        int horas = empleado.getHoras();
        int tarifaHora = empleado.getTarifaHora();
        
        System.out.println(nombre + " trabajó " + horas + " horas, " 
                + "cobra " + tarifaHora 
                + " euros la hora por lo que le corresponde un sueldo de " 
                + calcularSueldo(horas, tarifaHora) + " euros.");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---- Empleado 1 ----");
        Empleado empleado1 = new Empleado(pedirNombre(), 
                pedirNumero("Introduzca el número de horas que ha trabajado el empleado: "), 
                pedirNumero("Introduzca la tarifa por hora del empleado: "));
        
        System.out.println("\n---- Empleado 2 ----");
        Empleado empleado2 = new Empleado(pedirNombre(), 
                pedirNumero("Introduzca el número de horas que ha trabajado el empleado: "), 
                pedirNumero("Introduzca la tarifa por hora del empleado: "));
        
        System.out.println("\n---- Empleado 3 ----");
        Empleado empleado3 = new Empleado(pedirNombre(), 
                pedirNumero("Introduzca el número de horas que ha trabajado el empleado: "), 
                pedirNumero("Introduzca la tarifa por hora del empleado: "));
        
        mostrarSueldo(empleado1);
        mostrarSueldo(empleado2);
        mostrarSueldo(empleado3);
    }

}