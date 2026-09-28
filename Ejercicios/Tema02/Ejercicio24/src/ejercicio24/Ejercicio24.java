package ejercicio24;
import java.util.Scanner;
/**
 *
 * @author israel
 */
public class Ejercicio24 {

    /**
     * Programa que solicita las notas de las seis asignaturas y calcula la
     * nota media del curso.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración de las variables para almacenar las notas y la media.
        double notaProgramacion, notaLenguajeDeMarcas, notaBaseDeDatos,
                notaEntornosDeDesarrollo, notaSistemasInformaticos, notaFol, 
                notaMedia;
        
        /* Se crea el objeto Scanner para leer los datos introducidos 
         * por el usuario.
         */
        Scanner entrada = new Scanner(System.in);
        
        // Se solicita y almacena la nota de cada asignatura.
        System.out.print("Por favor, introduzca la nota de Programación: ");
        notaProgramacion = entrada.nextDouble();
        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        notaLenguajeDeMarcas = entrada.nextDouble();
        System.out.print("Introduzca la nota de Bases de Datos: ");
        notaBaseDeDatos = entrada.nextDouble();
        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        notaEntornosDeDesarrollo = entrada.nextDouble();
        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        notaSistemasInformaticos = entrada.nextDouble();
        System.out.print("Por último, introduzca la nota de Formación y " 
                + "Orientación Laboral: ");
        notaFol = entrada.nextDouble();
        
        // Se calcula la nota media de las seis asignaturas.
        notaMedia = (notaProgramacion + notaLenguajeDeMarcas + notaBaseDeDatos 
                + notaEntornosDeDesarrollo + notaSistemasInformaticos 
                + notaFol) / 6;
        
        // Se muestra por pantalla la nota media.
        System.out.println("Su nota media del curso es de: " + notaMedia);
    }
    
}
