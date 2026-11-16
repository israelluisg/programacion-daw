package pruebaclases;

/**
 *
 * @author israel
 */
public class Bicicleta {
    // Atributos (no se inicializa)
    private String marca;
    private String color;
    private float precio;
    private int anios;
    
    // Atributo static (se inicializa)
    private static int contadorBiciletas = 0;
    
    // Métodos
    // Getters / Setters
    public String getMarca () {
        return marca;
    }
    
    public void setMarca (String m) {
        marca = m;
    }
    
    public String getColor () {
        return color;
    }
    
    public void setColor (String c) {
        color = c;
    }
    
    public float getPrecio () {
        return precio;
    }
    
    public void setPrecio (float p) {
        precio = p;
    }
    
    public int getAnios () {
        return anios;
    }
    
    public void setAnios (int a) {
        anios = a;
    }
    
    public static int getContadorBicicletas () {
        return contadorBiciletas;
    }
    
    // Otros métodos
    public void mostrarAntiguedad () {
        if (anios > 10) {
            System.out.println("La bici es antigua.");
        } else {
            System.out.println("La bici es nueva");
        }
    }
    
    public static void aumentarContadorBicicleta () {
        contadorBiciletas++;
    }
    
    // Método mostrar / toString()
    public void mostrarBicicleta () {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Años: " + anios);
    }
    
    @Override
    public String toString () {
       return "Marca: " + marca 
               + ", Color: " + color 
               + ", Precio: " + precio 
               + ", Años: " + anios;
    }
}
