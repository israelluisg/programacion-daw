package ejercicio03;

/**
 *
 * Programa que crea objetos de clase Rueda y Coche y es enlazan entre ellos,
 * mostrando sus datos por pantalla.
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
        rueda1.establecerMaterial("Material1");
        rueda1.establecerPulgadas(2);
        
        // Se establecen los valores a rueda2
        rueda2.establecerMaterial("Material2");
        rueda2.establecerPulgadas(4);
        
        // Se muestran los datos de rueda1 y rueda2
        System.out.println(rueda1);
        System.out.println(rueda2);
        
        // Se crean los objetos coche1, coche2 y cohe3
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        // Se establecen los datos de coche1, coche2 y coche3
        coche1.establecerMarca("Marca1");
        coche1.establecerModelo("Modelo1");
        
        coche2.establecerMarca("Marca2");
        coche2.establecerModelo("Modelo2");
        
        coche3.establecerMarca("Marca3");
        coche3.establecerModelo("Modelo3");
        
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