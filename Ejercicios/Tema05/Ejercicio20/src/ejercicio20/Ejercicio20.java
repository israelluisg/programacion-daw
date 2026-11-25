package ejercicio20;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio20 {
    
    public static float pedirFloat() {
            Scanner entrada = new Scanner(System.in);
            
            float numero = 0.0f;
            boolean validar;
            
            do {
               try {
                   numero = entrada.nextFloat();
                   
                   if (numero > 0) {
                       validar = false;
                   } else {
                       System.out.print("Error, introduzca una cantidad mayor a 0: "); 
                       validar = true;
                   }
               } catch (InputMismatchException e) {
                   System.out.print("Error, introduzca un número válida: ");
                   validar = true;
                   entrada.nextLine();
               }
            } while (validar);
            
            return numero;
        }
    
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
        
        public static Cuenta crearCuentaVacia() {
            System.out.println("Se ha creado una cuenta vacía.");
            return new Cuenta();
        }
        
        public static Cuenta crearCuentaConSaldo() {
            System.out.print("Introduzca el saldo inicial de su cuenta: ");
            return new Cuenta(pedirFloat());
        }
        
        
        public static void ingresarDinero(Cuenta cuenta, boolean validarCuenta) {
            float ingreso;
            
            if (validarCuenta) {
                System.out.print("Introduzca la cantidad que desea ingresar: ");
                
                ingreso = pedirFloat();
                
                cuenta.ingresar(ingreso); 
                
                System.out.println("Se han ingresado correctamente " 
                        + ingreso + " €.");
            } else {
                System.out.println("Error, tienes que crear una cuenta primero.");
            }
        }
        
        public static void sacarDinero(Cuenta cuenta, boolean validarCuenta) {
            float retiro;
            
            if (validarCuenta) {
                System.out.print("Introduzca la cantidad que desea retirar: ");
                
                retiro = pedirFloat();
                
                cuenta.extraer(retiro); 
                
                System.out.println("Se han retirado correctamente " 
                        + retiro + " €.");
            } else {
                System.out.println("Error, tienes que crear una cuenta primero.");
            }
        }
        
        public static void verSaldo(Cuenta cuenta, boolean validarCuenta) {
            if (validarCuenta) {
                System.out.println("Su saldo actual es de " + cuenta.getSaldo() + " €.");
            } else {
                System.out.println("Error, tienes que crear una cuenta primero.");
            }
        }
        
        public static void gestionarMenu() {
            int numOpcion;
            boolean validarCuenta = false;
            
            Cuenta cuenta = new Cuenta();
            
            do {
                System.out.println("\n1.- Crear cuenta vacía.");
                System.out.println("2.- Crear cuenta con saldo inicial.");
                System.out.println("3.- Ingresar dinero.");
                System.out.println("4.- Sacar dinero.");
                System.out.println("5.- Ver saldo.");
                System.out.println("6.- Salir.");
                System.out.print("Eliga una opción: ");
                
                numOpcion = pedirEntero();
                
                switch (numOpcion) {
                    case 1 -> {
                        cuenta = crearCuentaVacia();
                        validarCuenta = true;
                    }
                    case 2 -> {
                        cuenta = crearCuentaConSaldo();
                        validarCuenta = true;
                    }
                    case 3 -> ingresarDinero(cuenta, validarCuenta);
                    case 4 -> sacarDinero(cuenta, validarCuenta);
                    case 5 -> verSaldo(cuenta, validarCuenta);
                    case 6 -> System.out.println("Cerrando programa...");
                }
            } while (numOpcion != 6);
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gestionarMenu();
    }
}