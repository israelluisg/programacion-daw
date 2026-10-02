package ejercicio02;

/**
 *
 * @author israel
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1 = 0.5F;
        long numero2;
        float resultado;
        numero2 = 178823419991L;
        resultado = numero1 * numero2;
        System.out.println("El resultado de multiplicar " + numero1 
                + " y " + numero2 + " es igual a " + resultado);
        
        /*
         * Se han corregido varios errores como que la variable1 esta mal
         * escrita ya que es numero1 no numero 1, además faltaba un + después
         * de numero1, numero2 estaba escrita como numero 2 y estaba dentro de
         * comillas y por tanto no estabamos mostrando la variable, por último,
         * había un + a la derecha de resultado el cual era incorrecto.
         */
    }
    
}
