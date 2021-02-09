package cuentas;

/*
 * Creamos la clase main desde donde lanzaremos operativas contra la clase CCuenta.
 */
public class Main {
	/**
	 * Metodo Main, creamos el objeto cuenta 1, en el punto 1 de la tarea se ha renombrado la variable micuenta a cuenta1
	 * @param args N/A
	 */
    public static void main(String[] args) {
        //punto 1 se cambia el nombre de la variable micuenta a cuenta1
    	CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 0);
    }
    /**
     * Metodo operativa cuenta, para comprobar el saldo actual de la cuenta y captura de errores con saldos mayores a los permitidos
     * @param cuenta1
     * @param catidad
     * viene del punto 3, se crea el metodo operativa_cuenta
     */
	private static void operativa_cuenta(CCuenta cuenta1, float catidad) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}