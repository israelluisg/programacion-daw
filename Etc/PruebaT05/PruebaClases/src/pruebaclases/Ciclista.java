package pruebaclases;

/**
 *
 * @author israel
 */
class Ciclista {
    private String nombre;
    private int dorsal;
    
    public Ciclista () {
        nombre = "";
        dorsal = 0;
    }
    
    public Ciclista (String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public int getDorsal () {
        return dorsal;
    }
    
    public void setDorsal (int dorsal) {
        this.dorsal = dorsal;
    }
    
    @Override
    public String toString () {
        return "Nombre: " + this.nombre + " (" + this.dorsal + ")";
    }
}
