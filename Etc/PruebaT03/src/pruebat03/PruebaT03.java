package pruebat03;

/**
 *
 * @author alumno
 */
public class PruebaT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 3;
        
        // IF
        System.out.println("IF");
        if(num1 % 2 == 0){
            System.out.println("El número es par.");
        }
        
        // IF-ELSE
        System.out.println("\nIF-ELSE");
        if(num1 % 2 == 0){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        // IF-ELSE IF-ELSE
        System.out.println("\nIF-ELSE IF-ELSE");
        if(num1 > 0){
            System.out.println("El número es positivo.");
        } else if(num1 < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        // SWITCH 1
        System.out.println("\nSWITCH 1");
        switch(num1){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("No existe ese día de la semana.");
        }
        
        // SWITCH 2
        System.out.println("\nSWITCH 2");
        switch(num1){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe ese día de la semana.");
        }
   }
    
    
}
