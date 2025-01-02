package cuentas;

/**
 * @author Raulondarra
 * Clase principal que realiza operaciones en una cuenta bancaria.
 * La clase contiene el método principal que realiza las operaciones de retiro e ingreso en una cuenta bancaria.
 */

public class Main {
	
	/**
	 * Método principal que ejecuta las operaciones de la cuenta.
	 * @param args
	 */
	public static void main(String[] args) {
		operativa_cuenta(2300);
	}
	
	/**
	 * Realiza la operativa de la cuenta, que incluye la visualización del saldo,
     * un retiro de una cantidad especificada y un ingreso en la cuenta.
	 * @param cantidad
	 */
	public static void  operativa_cuenta(float cantidad){
        CCuenta cuenta1;
        double saldoActual;

        // Se crea un objeto de tipo CCuenta

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        // Realiza un retiro de la cantidad especificada

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        // Realiza un ingreso en la cuenta

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
