package ejercicio21;

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
    
    public void crearCuentaClave(String clave) {
        CuentaClave cuentaClave = new CuentaClave(clave);
    }
    
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
    
    public class CuentaClave {
        // Atributos
        private String clave;
        
        public CuentaClave() {
            clave = "";
        }
        
        public CuentaClave(String clave) {
            this.clave = clave;
        }
        
        // Getters y Setters
        
        public String getClave() {
            return clave;
        }
        
        public void setClave(String clave) {
            this.clave = clave;
        }
        
        public void extraer(float c) {
            if (c < saldo) {
                saldo -= c;
            } else {
                System.out.println("No se pudo completar la operación, ya que " 
                        + " su saldo es inferior a la cantidad que desea retirar.");
            }
        }
        
        @Override
        public String toString() {
            return "Clave: " + clave;
        }
    }
}
