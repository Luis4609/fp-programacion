/**
 * 
 */
package programacion.ejercicios.tema4;

/**
 * @author Vespertino
 *
 */
public class Ejercicio3_3 {

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
	public Ejercicio3_3(int ano, int mes, int dia) {
		super();
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	/**
	 * Constructor Año
	 */
	public Ejercicio3_3() {
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
	 * @param ano
	 * @param mes
	 * @param dia
	 * @param anoBisieto
	 */
	public Ejercicio3_3(int ano, int mes, int dia, Ejercicio20 anoBisieto) {
		super();
		if (ano >= 0 || ano <= 9999) {
			this.ano = ano;

			if (mes >= 1 || mes <= 12) {
				this.mes = mes;
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
					this.dia = dia;
				}
				if (mes == 2) {
					if (dia <= 28) {
						this.dia = dia;
					}
					if (anoBisieto.isBisiesto(ano) && dia <= 29) {
						this.dia = dia;
					}

				}
			}
		}

//		this.anoBisieto = anoBisieto;
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

//	/**
//	 * Este metodo recibe un objeto de la clase
//	 * 
//	 * @param isValido Objeto de la clase Ejercicio3_3
//	 * @return true = fechaValida, false = !fechaValida
//	 */
//	public boolean validarFecha(Ejercicio3_3 isValido) {
//
//		boolean fechaValida = false;
//
//		// Primeras 3 comprobaciones
//		if (isValido.ano >= 0 || isValido.ano <= 9999) {
//			if (isValido.mes >= 1 || isValido.mes <= 12) {
//				if (isValido.dia >= 1 || isValido.dia <= 31) {
//					// Comprobamos el resto de condiciones logicas
//					if (anoBisieto.isBisiesto(ano) == true) {
//						if (isValido.mes == 2 && isValido.dia <= 29) {
//							if ((isValido.mes == 4 || isValido.mes == 6 || isValido.mes == 9 || isValido.mes == 11)
//									&& isValido.dia <= 30) {
//								fechaValida = true;
//							} else {
//								fechaValida = false;
//							}
//						} else {
//							if (isValido.mes == 2 && isValido.dia <= 28) {
//								if ((isValido.mes == 4 || isValido.mes == 6 || isValido.mes == 9 || isValido.mes == 11)
//										&& isValido.dia <= 30) {
//									fechaValida = true;
//								} else {
//									fechaValida = false;
//								}
//							} else {
//								fechaValida = false;
//							}
//						}
//					}
//				}
//			}
//
//		} else {
//			fechaValida = false;
//		}
//		return fechaValida;
//	}

	/**
	 * Este metodo recibe un objeto de la clase
	 * 
	 * @param isValido Objeto de la clase Ejercicio3_3
	 * @return true = fechaValida, false = !fechaValida
	 */
	public boolean validarFechaNew(Ejercicio3_3 isValido) {

		boolean fechaValida = false;

		// Primeras 3 comprobaciones
		if (isValido.getAno() >= 0 || isValido.getAno() <= 9999) {
			if (isValido.getMes() >= 1 || isValido.getMes() <= 12) {
				if (isValido.getDia() >= 1 || isValido.getDia() <= 31) {
					// Comprobamos el resto de condiciones logicas
					if (anoBisieto.isBisiesto(isValido.getAno()) == true) {
						if (isValido.getMes() == 2 && isValido.getDia() <= 29) {
							fechaValida = true; // TRUE IF IS BISIESTO Y FEBRERO TIENE MENOS DE 29 DIAS
							if ((isValido.getMes() == 4 || isValido.getMes() == 6 || isValido.getMes() == 9
									|| isValido.getMes() == 11) && isValido.getDia() <= 30) {
								fechaValida = true; // TRUE IF IS BISIESTO Y LOS MESES TIENEN MENOS DE 30 DIAS
							} else {
								fechaValida = false;
							}
						} else { // SI NO ES BISIESTO
							if (isValido.getMes() == 2 && isValido.getDia() <= 28) {
								fechaValida = true; // TRUE IF IS NOT BISIESTO Y FEBRERO TIENE 28 O MENOS
								if ((isValido.getMes() == 4 || isValido.getMes() == 6 || isValido.getMes() == 9
										|| isValido.getMes() == 11) && isValido.getDia() <= 30) {
									fechaValida = true; // TRUE IF IS NOT BISIESTO Y LOS MESES TIENEN 30 O MENOS
								} else {
									fechaValida = false;
								}
							} else {
								fechaValida = false;
							}
						}
					}
				} else {
					fechaValida = false;
				}
			} else {
				fechaValida = false;
			}

		} else {
			fechaValida = false;
		}
		return fechaValida;
	}

}
