package ejercicio20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Programa que simula un cajero automático mediante un menú. Permite crear una
 * cuenta, ingresar, retirar y consultar el saldo.
 *
 * @author israel
 */
public class Ejercicio20 {

    /**
     * Método que solicita y valida una cantidad mayor a 0.
     *
     * @return cantidad introducida.
     */
    public static float pedirFloat() {
        Scanner entrada = new Scanner(System.in);

        float numero = 0.0f;
        boolean validar;

        do {
            try {
                numero = entrada.nextFloat();

                if (numero > 0) {
                    validar = false;
                } else {
                    System.out.print("Error, introduzca una cantidad mayor a 0: ");
                    validar = true;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número válido: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);

        return numero;
    }

    /**
     * Método que solicita un número entero al usuario.
     *
     * @return número entero introducido.
     */
    public static int pedirEntero() {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean validar;

        do {
            try {
                numero = entrada.nextInt();
                validar = false;
            } catch (InputMismatchException e) {
                System.out.print("Error, introduzca un número entero: ");
                validar = true;
                entrada.nextLine();
            }
        } while (validar);

        return numero;
    }

    /**
     * Método que crea una cuenta con saldo 0.
     *
     * @return objeto Cuenta creado.
     */
    public static Cuenta crearCuentaVacia() {
        System.out.println("Se ha creado una cuenta vacía.");
        return new Cuenta();
    }

    /**
     * Método que crea una cuenta con el saldo inicial introducido.
     *
     * @return objeto Cuenta creado.
     */
    public static Cuenta crearCuentaConSaldo() {
        System.out.print("Introduzca el saldo inicial de su cuenta: ");
        Cuenta cuenta = new Cuenta(pedirFloat());
        System.out.println("Se ha creado una cuenta correctamente.");
        return cuenta;
    }

    /**
     * Método que solicita e ingresa dinero en la cuenta.
     *
     * @param cuenta objeto Cuenta.
     * @param validarCuenta indica si se ha creado una cuenta.
     */
    public static void ingresarDinero(Cuenta cuenta, boolean validarCuenta) {
        float ingreso;

        if (validarCuenta) {
            System.out.print("Introduzca la cantidad que desea ingresar: ");

            ingreso = pedirFloat();

            cuenta.ingresar(ingreso);

            System.out.println("Se han ingresado correctamente "
                    + ingreso + " €.");
        } else {
            System.out.println("Error, tienes que crear una cuenta primero.");
        }
    }

    /**
     * Método que solicita y retira dinero de la cuenta.
     *
     * @param cuenta objeto Cuenta.
     * @param validarCuenta indica si se ha creado una cuenta.
     */
    public static void sacarDinero(Cuenta cuenta, boolean validarCuenta) {
        float retiro;

        if (validarCuenta) {
            System.out.print("Introduzca la cantidad que desea retirar: ");

            retiro = pedirFloat();

            cuenta.extraer(retiro);

            System.out.println("Se han retirado correctamente "
                    + retiro + " €.");
        } else {
            System.out.println("Error, tienes que crear una cuenta primero.");
        }
    }

    /**
     * Método que muestra el saldo actual de la cuenta.
     *
     * @param cuenta objeto Cuenta.
     * @param validarCuenta indica si se ha creado una cuenta.
     */
    public static void verSaldo(Cuenta cuenta, boolean validarCuenta) {
        if (validarCuenta) {
            System.out.println("Su saldo actual es de " + cuenta.getSaldo() + " €.");
        } else {
            System.out.println("Error, tienes que crear una cuenta primero.");
        }
    }

    /**
     * Método que muestra el menú y realiza la opción seleccionada. Se repite
     * hasta que el usuario elige salir.
     */
    public static void gestionarMenu() {
        int numOpcion;
        boolean validarCuenta = false;

        Cuenta cuenta = new Cuenta();

        do {
            System.out.println("\n1.- Crear cuenta vacía.");
            System.out.println("2.- Crear cuenta con saldo inicial.");
            System.out.println("3.- Ingresar dinero.");
            System.out.println("4.- Sacar dinero.");
            System.out.println("5.- Ver saldo.");
            System.out.println("6.- Salir.");
            System.out.print("Elija una opción: ");

            numOpcion = pedirEntero();

            switch (numOpcion) {
                case 1 -> {
                    cuenta = crearCuentaVacia();
                    validarCuenta = true;
                }
                case 2 -> {
                    cuenta = crearCuentaConSaldo();
                    validarCuenta = true;
                }
                case 3 ->
                    ingresarDinero(cuenta, validarCuenta);
                case 4 ->
                    sacarDinero(cuenta, validarCuenta);
                case 5 ->
                    verSaldo(cuenta, validarCuenta);
                case 6 ->
                    System.out.println("Cerrando programa...");
                default ->
                    System.out.println("Error, introduzca una opción válida.");
            }
        } while (numOpcion != 6);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gestionarMenu();
    }
}
