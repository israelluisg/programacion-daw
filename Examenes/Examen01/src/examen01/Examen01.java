package examen01;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * Programa que muestra un menú al usuario con distintas opciones, permitiendo 
 * gestionar un parque de atracciones.
 * 
 * @author israel
 */
public class Examen01 {
    
    // CONSTANTES
    public static final double PI = Math.PI;
    
    /**
     * Método que pide un número al usuario y controla que sea mayor de 0 y 
     * muestra errores en caso de que no se introduzca un entero.
     * @return Devuelve el número introducido por el usuario.
     */
    public static int pedirNumero () {
        // Creo el objeto Scanner para registrar la entrada del usuario
        Scanner entrada = new Scanner (System.in);
        // Declaro la variable validar para controlar el bucle do-while
        boolean validar;
        // Inicializo la variable numUsuario donde se almacenará el número introducido
        int numUsuario = 0;
        
        // Creo un bucle do-while hasta que no se confirme el valor correcto
        do {
            try {
                // Asigno a numUsuario el valor introducido por el usuario
                numUsuario = entrada.nextInt();
                
                // Controlo que numUsuario sea mayor que 1
                if (numUsuario < 1) {
                    System.out.print("Error, introduzca un número mayor que 0: ");
                    validar = true;
                } else {
                    validar = false;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
        }
        } while(validar);
        
        // Devuelvo el número entero numUsuario
        return numUsuario;
    }
   
    /**
     * Método que pide introducir un número de visitantes y los divide en grupos
     * exactos.
     */
    public static void formarGrupos () {
        // Declaro la variable numVisitantes donde se almacena el número de visitantes
        int numVisitantes;
        // Inicializo la variable validar para controlar el buclhe while
        boolean validar = true;
        // Inicializo la variable i
        int i = 1;
        
        System.out.print("Introduzca el número de visitantes: ");
        numVisitantes = pedirNumero();
        
        // Creo un bucle que busca un número exacto para formar grupos
        while (validar && i < numVisitantes) {
            i++;
            if ((numVisitantes % i) == 0 && numVisitantes != i) {
                validar = false;
            }
        }
        
        // Creo una condición  para verificar si existe un número para crear grupos exactos
        if (validar) {
            System.out.println("Los visitantes no se pueden dividir en grupos exactos.");
        } else {
            System.out.println("Cada grupo debe estar formado por " + i + " visitantes.");
        }
    }
    
    /**
     * Método que a partir de tres datos que introduce el usuario los ordena de
     * menor a mayor y lo muestra por pantalla.
     */
    public static void ordenarTiempos () {
        // Declaro las variables donde se almacenan los tres tiempos
        int atraccion1, atraccion2, atraccion3;
        // Declaro la variable para intercambiar entre dos variables
        int aux;
        
        System.out.print("Introduzca el tiempo de espera de la primera atracción: ");
        atraccion1 = pedirNumero();
        
        System.out.print("Introduzca el tiempo de espera de la segunda atracción: ");
        atraccion2 = pedirNumero();
        
        System.out.print("Introduzca el tiempo de espera de la tercera atracción: ");
        atraccion3 = pedirNumero();
        
        // Creo un bucle while para establecer un orden de menor a mayor
        while (atraccion1 > atraccion2 || atraccion2 > atraccion3) {
            if (atraccion1 >= atraccion2) {
                aux = atraccion2;
                atraccion2 = atraccion1;
                atraccion1 = aux;
            } if (atraccion2 >= atraccion3) {
                aux = atraccion3;
                atraccion3 = atraccion2;
                atraccion2 = aux;
            }
        }
        
        // Muestro por pantalla el orden de menor a mayor
        System.out.println("El orden de menor a mayor de los tiempos de espera es: " 
                + atraccion1 + " - " + atraccion2 + " - " + atraccion3);
    }
    
    /**
     * Método que calcula el área
     * @param radio variable utilizada para calcular el área
     * @return devuelve el área total
     */
    public static double calcularArea (int radio) {
        return (PI * Math.pow(radio, 2));
    }
    
    /**
     * Método que muestra por pantalla la superficie necesaria para construir un 
     * tiovivo.
     */
    public static void calcularSuperficieTiovivo () {        
        System.out.print("Introduzca el radio del tiovivo: ");
        
        System.out.println("El área necesaria para el tiovivo es de " 
                + calcularArea(pedirNumero()));
    }
    
    /**
     * Método que muestra por pantalla el nmenú principal del programa y permite
     * al usuario elegir entre diferentes opciones.
     */
    public static void menuUsuario () {
        int numOpcion;
        
        do {
            System.out.println("\n1. Formar grupos.");
            System.out.println("2. Ordenar los tiempos de espera de tres atracciones.");
            System.out.println("3. Calcular el área de la superficie.");
            System.out.println("4. Salir del programa.");
            System.out.print("Introduzca una de las opciones: ");
            
            numOpcion = pedirNumero();
            
            // Creo un switch para elegir la opción del usuario.
            switch (numOpcion) {
                case 1 -> formarGrupos();
                case 2 -> ordenarTiempos();
                case 3 -> calcularSuperficieTiovivo();
                case 4 -> System.out.println("Cerrando el programa...");
                default -> System.out.print("Error, introduzca una opción válida.");
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