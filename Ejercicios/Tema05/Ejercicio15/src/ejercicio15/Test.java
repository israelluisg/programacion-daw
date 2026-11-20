package ejercicio15;

/**
 *
 * Programa que crea tres objetos Direccion, luego crea tres objetos Empleado y
 * le asigna cada direccion creada a un empleado, mostrando posteriormente los
 * datos de los objetos Empleado.
 * 
 * @author israel
 */
public class Test {
    
    /**
     * Método que muestra los datos de los tres objetos Empleado creados.
     * @param empleado1 primer objeto Empleado.
     * @param empleado2 segundo objeto Empleado.
     * @param empleado3 tercer objeto Empleado.
     */
    public static void mostrarEmpleados(Empleado empleado1, 
            Empleado empleado2, Empleado empleado3) {

        System.out.println("EMPLEADO 1:");
        System.out.println(empleado1);

        System.out.println("\nEMPLEADO 2:");
        System.out.println(empleado2);

        System.out.println("\nEMPLEADO 3:");
        System.out.println(empleado3);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo los tres objetos Direccion
        Direccion direccion1 = new Direccion("Avenida de España", 24, "3B", "Plasencia");
        Direccion direccion2 = new Direccion("Calle Mayor", 15, "1A", "Cáceres");
        Direccion direccion3 = new Direccion("Avenida de la Constitución", 8, "2C", "Salamanca");
        
        // Creo los tres objetos Empleado y le asigno una direccion a cada uno
        Empleado empleado1 = new Empleado("Carlos Martínez", 1850, direccion1);
        Empleado empleado2 = new Empleado("Lucía Fernández", 2300, direccion2);
        Empleado empleado3 = new Empleado("Alejandro Sánchez", 1675, direccion3);
        
        // Muestro los datos de los tres empleados
        mostrarEmpleados(empleado1, empleado2, empleado3);
    }
}