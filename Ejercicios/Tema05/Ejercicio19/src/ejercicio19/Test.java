package ejercicio19;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que crea tres empleados, calcula y muestra
 * sus sueldos brutos.
 *
 * @author israel
 */
public class Test {
    
    /**
     * Método que solicita el nombre de un empleado.
     * @return nombre introducido.
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el nombre del empleado: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que solicita y valida las horas trabajadas.
     * @return número de horas introducido.
     */
    public static int pedirHoras() {
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean validar;
        
        System.out.print("Introduzca el número de horas que ha trabajado el empleado: ");
        
        do {
            try {
                numero = entrada.nextInt();
                
                if (numero >= 0) {
                    validar = false;
                } else {
                    System.out.print("Error, introduzca un número mayor o igual a 0: ");
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
    
    /**
     * Método que solicita y valida la tarifa por hora.
     * @return tarifa por hora introducida.
     */
    public static double pedirTarifaHora() {
        Scanner entrada = new Scanner(System.in);
        
        double numero = 0;
        boolean validar;
        
        System.out.print("Introduzca la tarifa por hora del empleado: ");
        
        do {
            try {
                numero = entrada.nextDouble();
                
                if (numero > 0) {
                    validar = false;
                } else {
                    System.out.print("Error, introduzca un número mayor a 0: ");
                    validar = true;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número válido: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);
        
        return numero;
    }
    
    /**
     * Método que calcula el sueldo bruto de un empleado.
     * @param horas horas trabajadas.
     * @param tarifaHora tarifa por hora.
     * @return sueldo bruto calculado.
     */
    public static double calcularSueldo(int horas, double tarifaHora) {
        double pago;
        
        if (horas < 40) {
            pago = horas * tarifaHora;
        } else {
            pago = (40 * tarifaHora) + ((horas - 40) * (tarifaHora * 1.5)); 
        }
        
        return pago;
    }
    
    /**
     * Método que muestra el sueldo bruto de un empleado.
     * @param empleado objeto Empleado que se muestra.
     */
    public static void mostrarSueldo(Empleado empleado) {
        String nombre = empleado.getNombre();
        int horas = empleado.getHoras();
        double tarifaHora = empleado.getTarifaHora();
        
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
        Empleado empleado1 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifaHora());
        
        System.out.println("\n---- Empleado 2 ----");
        Empleado empleado2 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifaHora());
        
        System.out.println("\n---- Empleado 3 ----");
        Empleado empleado3 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifaHora());
        
        mostrarSueldo(empleado1);
        mostrarSueldo(empleado2);
        mostrarSueldo(empleado3);
    }

}