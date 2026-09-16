package ejercicio02;

/**
 * Operaciones aritméticas con tres números enteros
 *
 * @author israel
 */
public class CAritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1, dato2, dato3; //Declaro las variables enteras dato1, dato2 y dato3
        int resultado; //Declaro la variable entera resultado

        //Asigno un valor a cada variable
        dato1 = 20;
        dato2 = 10;
        dato3 = 7;

        //SUMA
        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);

        //RESTA
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);

        //PRODUCTO
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
    }

}
