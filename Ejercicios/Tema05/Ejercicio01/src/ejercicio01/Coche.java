package ejercicio01;

/**
 *
 * @author israel
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    
    private boolean motorEncendido = false;
    
    // Get / Set de marca
    public String getMarca () {
        return marca;
    }
    
    public void setMarca (String ma) {
        marca = ma;
    }
    
    // Get / Set de modelo
    public String getModelo () {
        return modelo;
    }
    
    public void setModelo (String mo) {
        modelo = mo;
    }
    
    // Get / Set de color
    public String getColor () {
        return color;
    }
    
    public void setColor (String co) {
        color = co;
    }
    

    public void arrancarCoche () {
        motorEncendido = true;
        velocidad = 10;
    }
    
    public void apagarCoche () {
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche () {
        velocidad += 20;
    }
    
    public void frenarCoche () {
        velocidad -= 6;
    }
    
    public void obtenerEstado () {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Estado del motor: " + motorEncendido);
    } 
}
