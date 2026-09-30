package podiocarrera;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class PodioCarrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo1, tiempo2, tiempo3, tiempo4;
        int diferencia;
        // Se declara la variable para intercambiar valores entre variables.
        int aux;
        
        // Se crea el objeto Scanner para leer y almacenar las entradas.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el tiempo del primer participante: ");
        tiempo1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca el tiempo " 
                + "del segundo participante: ");
        tiempo2 = entrada.nextInt();
        
        System.out.print("Introduzca el tiempo del tercer participante: ");
        tiempo3 = entrada.nextInt();
        
        System.out.print("Por último, Introduzca el tiempo " 
                + "del cuarto participante: ");
        tiempo4 = entrada.nextInt();
        
        // Se crean condiciones para ordenar de menor a mayor.
        // Primera vuelta
        if (tiempo1 > tiempo2){
            aux = tiempo1;
            tiempo1 = tiempo2;
            tiempo2 = aux;
        }
        if (tiempo2 > tiempo3){
            aux = tiempo2;
            tiempo2 = tiempo3;
            tiempo3 = aux;
        }
        if (tiempo3 > tiempo4){
            aux = tiempo3;
            tiempo3 = tiempo4;
            tiempo4 = aux;
        } 
        
        // Segunda vuelta
        if (tiempo1 > tiempo2){
            aux = tiempo1;
            tiempo1 = tiempo2;
            tiempo2 = aux;
        }
        if (tiempo2 > tiempo3){
            aux = tiempo2;
            tiempo2 = tiempo3;
            tiempo3 = aux;
        }
        if (tiempo3 > tiempo4){
            aux = tiempo3;
            tiempo3 = tiempo4;
            tiempo4 = aux;
        } 
        
        // Tercera vuelta
        if (tiempo1 > tiempo2){
            aux = tiempo1;
            tiempo1 = tiempo2;
            tiempo2 = aux;
        }
        if (tiempo2 > tiempo3){
            aux = tiempo2;
            tiempo2 = tiempo3;
            tiempo3 = aux;
        }
        if (tiempo3 > tiempo4){
            aux = tiempo3;
            tiempo3 = tiempo4;
            tiempo4 = aux;
        }
        
        // Se muestra los puestos de los participantes.
        System.out.println("1º. puesto: " + tiempo1 
                + " | 2º. puesto:" + tiempo2);
        System.out.println("3º. puesto: " + tiempo3 
                + " | 4º. puesto: " + tiempo4);
        // Se determina si hay un empate en el primer puesto.
        if (tiempo1 == tiempo2){
            System.out.println("> Hay empate en el primer puesto.");
        }
        
        if (tiempo1 == tiempo2 && tiempo2 == tiempo3 && tiempo3 == tiempo4){
            System.out.println("> Hay 4 participantes empatados.");
        } else if (tiempo1 == tiempo2 && tiempo2 == tiempo3){
            System.out.println("> Hay 3 participantes empatados.");
        
        diferencia = tiempo2 - tiempo1;
        if (diferencia == 0){
            System.out.println("> Diferencia 1.º 2.º: " + diferencia 
                    + "s |Hay tiempos iguales.");
        } else {
            System.out.println("> Diferencia 1.º 2.º: " + diferencia + "s.");
        }
    }
}
