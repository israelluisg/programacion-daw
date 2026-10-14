package cajeroautomatico;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion; 
        double ingreso, retiro;
        double saldo = 1000;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            try {
                System.out.println("Seleccione una de las siguientes opciones: ");
                System.out.println("1. Consultar");
                System.out.println("2. Ingresar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Su saldo actual es: " + saldo + "€");
                        break;
                    }
                    case 2 -> {
                        System.out.println("Ingrese una cantidad a ingresar: ");
                        ingreso = entrada.nextDouble();

                        if (ingreso > 0) {
                            saldo += ingreso;
                        } else {
                            System.out.println("Ingrese un una cantidad válida.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese una cantidad a retirar: ");
                        retiro = entrada.nextDouble();

                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro; 
                        } else {
                            System.out.println("Ingrese una cantidad correcta y menor a su saldo.");
                        }
                    }
                    case 4 -> {
                        System.out.println("Cerrando programa...");
                    }
                }
                
            } catch (InputMismatchException e) {
                
            }
        } while (opcion != 4);
    }
}