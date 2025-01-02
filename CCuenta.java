package cuentas;

/**
 * @author Raulondarra
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones como ingresar, retirar saldo y consultar el estado de la cuenta.
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío para crear una instancia de la clase CCuenta sin inicializar atributos.
     */
    public CCuenta(){
    }

    /**
     * Constructor para crear una instancia de la clase CCuenta con los valores proporcionados
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * Si la cantidad es negativa, lanza una excepción.
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta.
     * Si la cantidad es negativa o el saldo es insuficiente, lanza una excepción.
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Metodos get y set para los atributos de la clase generados en la primera parte del ejercicio.
     */
    
	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
