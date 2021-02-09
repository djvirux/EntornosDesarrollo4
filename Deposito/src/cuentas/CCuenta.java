package cuentas;
/**
 * Creamos la clase CCuenta y sus distintos metodos para interactuar
 * @author ViRuX
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Metodo vacio
     */
    public CCuenta()
    {
    }
    /**
     * Metodo CCcuenta
     * @param nom para trabajar con el nombre del titular
     * @param cue para trabajar con el numero de cuenta
     * @param sal para trabajar con el saldo de la cuenta
     * @param tipo para trabajar con el tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Metodo para comprobar el estado de la cuenta
     * @return el saldo de la cuenta
     */
    
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Metodo para comprobar si la cantidad a ingresar es positiva
     * @param cantidad a ingresar, se analiza en la condicion si es positiva
     * @throws Exception se retorna mensaje en caso de cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Metodo retirar con dos condicionales para tratamiento de errores en la retirada
     * @param cantidad a retirar, se analiza en ambas condiciones
     * @throws Exception se retorna un mensaje de cantidad negativa o saldo insuficiente
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
     * Get para el atributo nombre
     * @return el valor de nombre
     */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo set para el atributo nombre
	 * @param nombre nombre que asignamos a la variable nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Get para el atributo cuenta
     * @return el valor de cuenta
     */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Metodo set para el atributo cuenta
	 * @param cuenta es el numero de cuenta que asignamos a la variable cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * Get para el atributo saldo
     * @return el valor de saldo
     */
	private double getSaldo() {
		return saldo;
	}
	/**
	 * Metodo set para el atributo saldo
	 * @param saldo saldo que asignamos a la variable saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
     * Get para el atributo tipointeres
     * @return el valor de tipointeres
     */
	private double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Metodo set para el atributo tipoInterés
	 * @param tipoInterés numero que asignamos a la variable tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
