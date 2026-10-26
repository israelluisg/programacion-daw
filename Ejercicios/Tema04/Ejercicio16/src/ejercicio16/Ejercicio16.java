package ejercicio16;

/**
 *
 * Programa que realiza distintas operaciones matematicas con Math.
 * 
 * @author israel
 */
public class Ejercicio16 {
    
    public static double hacerRaiz () {
        return Math.sqrt(64);
    }
    
    public static double hacerExponente () {
        return Math.pow(8, 3);
    }
    
    public static double hacerExponencial () {
        return Math.exp(2);
    }
    
    public static double hacerLogaritmo () {
        return Math.log(2.71828);
    }
    
    public static int menorValor () {
        return Math.min(2, 3);
    }
    
    public static double hacerValorAbsoluto () {
        return Math.abs(-4.5);
    }
    
    public static double redondearNumero () {
        return Math.round(-4.5);
    }
    
    public static double hacerSeno () {
        return Math.sin(45);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hacerRaiz());
        System.out.println(hacerExponente());
        System.out.println(hacerExponencial());
        System.out.println(hacerLogaritmo());
        System.out.println(menorValor());
        System.out.println(hacerValorAbsoluto());
        System.out.println(redondearNumero());
        System.out.println(hacerSeno());
    }
}