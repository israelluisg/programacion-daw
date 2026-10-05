package pruebat03;

import java.util.Scanner;

/**
 *
 * @author israel
 */
public class Bucles {
    public static void main(String[] args) {
        int indice = 0;

        // WHILE
        System.out.println("WHILE");
        while(indice < 10){
        System.out.println(indice);
        indice++;
        }
        
        // DO WHILE
        // indice = 0;
        System.out.println("\nDO WHILE");
        do{
            System.out.println(indice);
            indice++;
        } while(indice < 10);
        
        // FOR
        System.out.println("\nFOR");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        
        // MENÚS
        int opc = 0;
        Scanner entrada = new Scanner(System.in);
        
        do {
            // Mostramos el menú al usuario
            System.out.println("- MENÚ -");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Solicitar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            
            // Pedir opción
            System.out.print("Elija una opción: ");
            opc = entrada.nextInt();
            
            // Ejecutar la opción elegida por el usuario
            switch(opc) {
                case 1 -> System.out.println("Has elegido ver el catálogo.");
                case 2 -> System.out.println("Has elegido solicitar un libro.");
                case 3 -> System.out.println("Has elegido devolver un libro.");
                case 4 -> System.out.println("Gracias por usar nuestro prpgrama.");
                
            }
        } while(opc != 4);
    }
}
