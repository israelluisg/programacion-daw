package pruebaclases;

/**
 *
 * @author israel
 */
public class PruebaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear bici1
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setPrecio(100f);
        bici1.setAnios(5);
        
        // Incrementar contador de bicicleta
        Bicicleta.aumentarContadorBicicleta();
        
        // Crear bici2
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Merida");
        bici2.setColor("Azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        
        // Incrementar contador de bicicleta
        Bicicleta.aumentarContadorBicicleta();
        // Mostrar bici1
        bici1.mostrarBicicleta();
        
        // Mostrar bici2
        System.out.println(bici2.toString());
        
        // Mostrar color bici1
        System.out.println("Color de bici1: " + bici1.getColor());
        
        // Mostrar contador de bicicletas
        System.out.println("Contador de bicicletas: " 
                + Bicicleta.getContadorBicicletas());
    }
}