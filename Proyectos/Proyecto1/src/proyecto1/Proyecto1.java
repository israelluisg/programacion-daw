package proyecto1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * Programa que muestra un menú al usuario y le permite decidir entre diferentes
 * opciones para generar un número aleatorio (de envío o de recogida), generarlos
 * en lotes o salir del programa.
 * 
 * @author israel
 */
public class Proyecto1 {
    
    // CONSTANTES
    public static final String ENVIAR = "Enviar";
    public static final String RECOGER  = "Recoger";
    
     /**
      * Método que pide un número al usuario y se asegura de que sea un número
      * entero.
      * @return Devuelve el número introducido por el usuario. 
      */
    public static int pedirNumero () {
        Scanner entrada = new Scanner (System.in);
        boolean validar = true;
        int numUsuario = 0;
        
        do {
            try {
                numUsuario = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero:");
                entrada.nextLine();
            }
        } while (validar);
        
        return numUsuario;
    }
    
    public static int aleatorizar () {
        return (int) (Math.random() * 100) + 1;
    }

    /**
     * Método que pide al usuario introducir un número de tickets múltiplo de 3.
     * @return Devuelve el número de tickets.
     */
    public static int pedirTicketsMultiploTres () {
        // Se declara la variable validar para verificar si el número es correcto
        boolean validar;
        // Se declara la variable numTickets para guardar el número de tickets
        int numTickets;
        
        System.out.print("Introduzca el número de tickets múltiplo de 3 que desea generar: ");
        
        do {
            // Se asigna a numTickets el varlo del método pedirNumero
            numTickets = pedirNumero();
            
            // Se verifica que numTickets sea múltiplo 3 y mayor a 0
            if ((numTickets % 3) == 0 && numTickets > 0) {
                validar = false;
            } else {
                System.out.print("Error, introduzca un número múltiplo de 3: ");
                validar = true;
            }
        } while (validar);
        
        return numTickets;
    }
    
    /**
     * Método que pide al usuario introducir el tipo de ticket que desea generar,
     * controla que introduzca una opción válida.
     * @return Devuelve el tipo de ticket elegido por el usuario.
     */
    public static String pedirTipoTicket () {
        // Se crea el objeto Scanner para registrar la entrada
        Scanner entrada = new Scanner (System.in);
        // Se declara la variable validar para verificar si el número es correcto
        boolean validar;
        // Se declara la variable tipoTickets para guardar una palabra
        String tipoTicket;
        
        System.out.print("Introduzca el tipo de tickets que quiere generar (Enviar o Recoger): ");
        
        
        do {
            // Asigno a tipoTicket el valor que introduzca el usuario
            tipoTicket = entrada.nextLine();
            
            // Verifico que el usuario introduzca una opción válida
            if (tipoTicket.equalsIgnoreCase(ENVIAR) || tipoTicket.equalsIgnoreCase(RECOGER)) {
                validar = false;
            } else {
                System.out.print("Error, introduzca opción válida: ");
                validar = true;
            }
        } while (validar);
        
        return tipoTicket;
    }
    
    /**
     * Método que genera una determinada cantidad y tipo de tickets dependiendo
     * de sus parámetros.
     * @param tipoTicket Valor del tipo de ticket.
     * @param numTickets Valor del número de tickets.
     */
    public static void generarTickets (String tipoTicket, int numTickets) {
        System.out.println("Se han generado los siguientes tickets: ");
        
        // Creo una condición para determinar el tipo de ticket que se va a generar
        if (tipoTicket.equalsIgnoreCase(ENVIAR)) {
            // Creo un bucle para generar el número de tickets
            for (int i = 0; i < numTickets; i++) {
                System.out.println("E-" + aleatorizar());
            }
        } else {
            // Creo un bucle para generar el número de tickets
            for (int i = 0; i < numTickets; i++) {
                System.out.println("R-" + aleatorizar());
            }
        }
    }
    
    /**
     * Método que muestra por pantalla un menú con determinadas opciones que 
     * realizan diferentes acciones.
     */
    public static void menuUsuario () {
        // Declaro la variable numOpcion para guardar el número de opción
        int numOpcion;
        
        
        do {
            // Muestro por pantalla el menú
            System.out.println("\n1. Enviar");
            System.out.println("2. Recoger");
            System.out.println("3. Generar lote de tickets");
            System.out.println("4. Salir");
            System.out.print("Eliga la acción que desea realizar: ");
            
            // Se asigna en numOpcion la opción a la que desea acceder el usuario
            numOpcion = pedirNumero();
            
            // Creo un switch que depende del valor de numOpcion
            switch (numOpcion) {
                case 1 -> System.out.println("Se ha generado el número de envío " 
                        + "E-" + aleatorizar());
                case 2 -> System.out.println("Se ha generado el número de recogida " 
                        + "R-" + aleatorizar());
                case 3 -> {
                    generarTickets(pedirTipoTicket(), pedirTicketsMultiploTres());
                }
                case 4 -> System.out.println("Cerrando el programa...");
                default -> System.out.println("Error, introduzca una opción válida.");
            }
        } while (numOpcion != 4);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuUsuario();
    }
}