package programacion.ejercicios.tema4;

/**
 * @author Vespertino
 *
 */
public class EntregaEjercicio3_3 {

	// Atributos de la clase Ejercicio3_3 Año
	private int ano;
	private int mes;
	private int dia;

	static // Comprobar si año es bisiesto
	Ejercicio20 anoBisieto = new Ejercicio20();

	/**
	 * @param ano
	 * @param mes
	 * @param dia
	 */
	public EntregaEjercicio3_3(int ano, int mes, int dia) {
		super();
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	/**
	 * Constructor Año
	 */
	public EntregaEjercicio3_3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Metodo que recibe como valores ano, mes y dia
	 * 
	 * @param ano
	 * @param mes
	 * @param dia
	 * @return true = fechaValida, false = !fechaValida
	 */
	public static boolean validarFecha(int ano, int mes, int dia) {

		// Si ano no se encuentra entre 0-9999 !fechaValida
		if (ano < 0 || ano > 9999) {
			return false;
		}
		// Si mes no se encuentra entre 1-12 !fechaValida
		if (mes < 1 || mes > 12) {
			return false;
		}
		// Si dia no se encuentra entre 1-31 !fechaValida
		if (dia < 1 || dia > 31) {
			return false;
		}
		// Comprobar el resto de condiciones
		else {
			// Si nos encontramos en Febrero => Dia < 28 || dia < 29 => fechaValida
			if (mes == 2) {
				// Comprobar febrero si el ano es bisiesto
				if (anoBisieto.isBisiesto(ano) == false && dia > 28) {
					return false;
				}
				if (anoBisieto.isBisiesto(ano) == true && dia > 29) {
					return false;
				} else {
					return true;
				}
			}
			// Si nos encontramos en Abril/Junio/Septiembre/Noviembre => dia < 30 =>
			// fechaValida
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

				// Si uno de estos meses tiene mas de 30 dias => !fechaValida
				if (dia > 30) {
					return false;
				}
				// fechaValida
				else {
					return true;
				}

			} else {
				return true;
			}
		}

	}

}