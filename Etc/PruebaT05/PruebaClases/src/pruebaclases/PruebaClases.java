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
        
        
        // Crear bici2
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Merida");
        bici2.setColor("Azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        

        // Mostrar bici1
        bici1.mostrarBicicleta();
        
        // Mostrar bici2
        System.out.println(bici2.toString());
        
        // Mostrar color bici1
        System.out.println("Color de bici1: " + bici1.getColor());
        
        // Mostrar contador de bicicletas
        System.out.println("Contador de bicicletas: " 
                + Bicicleta.getContadorBicicletas());
        
        // Creamos una bici con el constructor parametrizado
        // Bicicleta bici3 = new Bicicleta("Canyon", "Negro", 2000, 3);
        System.out.println("Contador de bicicletas: " 
                + Bicicleta.getContadorBicicletas());
        
        Ciclista ciclista1 = new Ciclista("Pepe", 1);
        System.out.println(ciclista1);
        
        Bicicleta bici4 = new Bicicleta("Canyon", "negro", 2000, 3, ciclista1);
        System.out.println(bici4);
        System.out.println();
        Bicicleta bici5 = new Bicicleta("Canyon", "negro", 2000, 3, new Ciclista());
        System.out.println(bici5);
        
        Bicicleta bici6 = new Bicicleta("Canyon", "negro", 2000, 3, new Ciclista("Ana", 5));
        System.out.println(bici6);
    }
}