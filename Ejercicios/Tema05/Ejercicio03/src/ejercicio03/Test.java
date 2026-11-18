package ejercicio03;

/**
 *
 * Programa que crea objetos de las clases Rueda y Coche, los relaciona entre sí
 * y muestra sus datos por pantalla.
 * 
 * @author israel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crean los objetos rueda1 y rueda2
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        // Se establecen los valores a rueda1
        rueda1.establecerMaterial("Acero");
        rueda1.establecerPulgadas(16);
        
        // Se establecen los valores a rueda2
        rueda2.establecerMaterial("Aleación de aluminio");
        rueda2.establecerPulgadas(18);
        
        // Se muestran los datos de rueda1 y rueda2
        System.out.println(rueda1);
        System.out.println(rueda2);
        
        // Se crean los objetos coche1, coche2 y coche3
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        // Se establecen los datos de coche1, coche2 y coche3
        coche1.establecerMarca("Toyota");
        coche1.establecerModelo("Corolla");
        
        coche2.establecerMarca("SEAT");
        coche2.establecerModelo("León");
        
        coche3.establecerMarca("Volkswagen");
        coche3.establecerModelo("Golf GTI");
        
        // Se establece rueda1 para coche1 y coche2
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        
        // Se establece rueda2 para coche3
        coche3.establecerRueda(rueda2);
        
        // Se muestran los datos de los coches
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
    }
}