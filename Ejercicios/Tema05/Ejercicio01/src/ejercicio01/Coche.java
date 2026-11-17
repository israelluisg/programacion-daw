package ejercicio01;

/**
 *
 * Clase que representa un coche mediante sus características y permite
 * realizar operaciones sobre su estado.
 * 
 * @author israel
 */
public class Coche {
    
    // Declaro los atributos de la clase Coche
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    
    // Inicializo el estado del motor como apagado
    private boolean motorEncendido = false;
      
    /**
     * Método que establece la marca del coche.
     * @param ma Marca que se asignará al coche.
     */
    public void establecerMarca (String ma) {
        marca = ma;
    }
    
    /**
     * Método que establece el modelo del coche.
     * @param mo Modelo que se asignará al coche.
     */
    public void establecerModelo (String mo) {
        modelo = mo;
    }
    
    /**
     * Método que establece el color del coche.
     * @param co Color que se asignará al coche.
     */
    public void establecerColor (String co) {
        color = co;
    }
    
    /**
     * Arranca el coche, establece motorEncendido en true y la velocidad en 10.
     */
    public void arrancarCoche () {
        motorEncendido = true;
        velocidad = 10;
    }
    
    /**
     * Apaga el coche, establece motorEncendido en false y la velocidad en 0.
     */
    public void apagarCoche () {
        motorEncendido = false;
        velocidad = 0;
    }
    
    /**
     * Método que suma 20 a velocidad.
     */
    public void acelerarCoche () {
        velocidad += 20;
    }
    
    /**
     * Método que resta 6 a velocidad.
     */
    public void frenarCoche () {
        velocidad -= 6;
    }
    
    /**
     * Método que muestra el valor de los atributos de un objeto de la clase
     * Coche.
     */
    public void obtenerEstado () {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Estado del motor: " + motorEncendido);
    } 
}
