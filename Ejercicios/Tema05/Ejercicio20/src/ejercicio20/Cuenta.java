package ejercicio20;

/**
 *
 * @author israel
 */
public class Cuenta {
    // Atributos
    private float saldo;
    
    public Cuenta() {
        saldo = 0;
    }
    
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }
    
    // Getters y Setters
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    // Otros métodos
    
    public void ingresar(float c) {
        saldo += c;
    }
    
    public void extraer(float c) {
        saldo -= c;
    }
    
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
}
