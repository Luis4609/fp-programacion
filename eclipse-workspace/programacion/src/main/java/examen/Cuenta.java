/**
 * 
 */
package examen;

/**
 * @author Vespertino
 *
 */
public class Cuenta {

	// Atributos de la clase Cuenta
	private int id;
	private String nombreTitular;
	private String apellidoTitular;
	private double saldoCuenta;

	/**
	 * @param id
	 * @param nombreTitular
	 * @param apellidoTitular
	 */
	public Cuenta(int id, String nombreTitular, String apellidoTitular) {
		super();
		this.id = id;
		this.nombreTitular = nombreTitular;
		this.apellidoTitular = apellidoTitular;
		saldoCuenta = 0; // La cuenta se construye con el saldo 0
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombreTitular
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}

	/**
	 * @param nombreTitular the nombreTitular to set
	 */
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	/**
	 * @return the apellidoTitular
	 */
	public String getApellidoTitular() {
		return apellidoTitular;
	}

	/**
	 * @param apellidoTitular the apellidoTitular to set
	 */
	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	/**
	 * @return the saldoCuenta
	 */
	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	/**
	 * @param saldoCuenta the saldoCuenta to set
	 */
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	/**
	 * Realizar un ingreso en la cuenta, para esto añadimos al saldoCuenta el
	 * ingreso recibido
	 * 
	 * @param ingreso
	 */
	public void ingresoCuenta(double ingreso) {

		// Realizar en la cuenta un ingreso, se actualiza el valor de saldoCuenta
		setSaldoCuenta(getSaldoCuenta() + ingreso);
	}

	/**
	 * Realizar una operacion para extraer dinero
	 * 
	 * @param reintegro
	 */
	public void reintegroCuenta(double reintegro) {

		// Sacar dinero de la cuenta
		if (reintegro < getSaldoCuenta()) {
			System.out.print("No posee suficientes fondos para realizar dicha operacion");
		} else {
			setSaldoCuenta(getSaldoCuenta() - reintegro);
		}
	}

	/**
	 * Realizar una transferencia desde una cuenta origen hasta la cuenta
	 * recibirTransferencia(cuenta destino)
	 * 
	 * @param recibirTransferencia
	 * @param transferencia
	 */
	public void transferencia(Cuenta recibirTransferencia, double transferencia) {

		if (getSaldoCuenta() < transferencia) {
			// No se puede realizar la transferencia
			System.out.print("No posee suficientes fondos para realizar dicha operacion");
		} else {
			// Operaciones que ocurren por la transferencia
			setSaldoCuenta(getSaldoCuenta() - transferencia);
			recibirTransferencia.setSaldoCuenta(recibirTransferencia.getSaldoCuenta() + transferencia);
		}

	}

	/**
	 * Metodo transferencia utilizando los metodos anteriormente desarrollados
	 * 
	 * @param cuentaDestino
	 * @param transeferencia
	 */
	public void transferenciaMetodos(Cuenta cuentaDestino, double transeferencia) {

		reintegroCuenta(transeferencia); // La operacion de restar la transferencia en la cuentaOrigen
		cuentaDestino.ingresoCuenta(transeferencia); // Operacion de recibir la transferencia cuentaDestino
	}

}
