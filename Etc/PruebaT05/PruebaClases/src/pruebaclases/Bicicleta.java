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
    
    // Atributo de otra clase (composición de clases)
    private Ciclista ciclista;
    
    // Constructores
    // 1. Por defecto
    public Bicicleta () {
        marca = "";
        color = "";
        precio = 0.0f;
        anios = 0;
        
        ciclista = new Ciclista();
        
        aumentarContadorBicicleta();
    }
    
    // 2. Parametrizado
    public Bicicleta (String marca, String color, float precio, int anios, Ciclista ciclista) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.anios = anios;
        
        this.ciclista = ciclista;
        
        aumentarContadorBicicleta();
    }
    
    // 3. Otro ejemplo
    public Bicicleta (String color) {
        marca = "";
        this.color = color;
        precio = 0.0f;
        anios = 0;
        
        aumentarContadorBicicleta();
    }
    
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
    
    public Ciclista getCicilista () {
        return ciclista;
    }
    
    public void setCiclista (Ciclista ciclista) {
        this.ciclista = ciclista;
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
        System.out.println("Ciclista: " + ciclista);
    }
    
    @Override
    public String toString () {
       return "Marca: " + marca 
               + ", Color: " + color 
               + ", Precio: " + precio 
               + ", Años: " + anios
               + ", Ciclista: " + ciclista;
    }
}
