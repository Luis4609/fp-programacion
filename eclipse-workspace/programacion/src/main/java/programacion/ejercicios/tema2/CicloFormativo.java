/**
 * 
 */
package programacion.ejercicios.tema2;

enum Curso {
	PRIMERO, SEGUNDO;
}

enum Asignaturas {
	PROGRAMACION, SISTEMAS, BaseDeDATOS, INGLES, FOL, LENGUAJES, ENTORNOS;
}

//enum Id {
//	1, 2, 3 , 4 , 5 , 6 , 7;
//}

/**
 * @author Vespertino
 *
 */
public class CicloFormativo {

	// Declarar Asignaturas
	private Asignaturas asignaturas;
	private Curso curso;
	private int idAsignatura;

	/**
	 * @param asignaturas
	 * @param curso
	 * @param idAsignatura
	 */
	public CicloFormativo(Asignaturas asignaturas, Curso curso, int idAsignatura) {
		super();
		this.asignaturas = asignaturas;
		this.curso = curso;
		this.idAsignatura = idAsignatura;
	}

	/**
	 * 
	 */
	public CicloFormativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the asignaturas
	 */
	public Asignaturas getAsignaturas() {
		return asignaturas;
	}

	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(Asignaturas asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the idAsignatura
	 */
	public int getIdAsignatura() {
		return idAsignatura;
	}

	/**
	 * @param idAsignatura the idAsignatura to set
	 */
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	// Mostrar la info de cada asignatura
	public void mostrarAsignatura() {

		System.out.println("La asignatura " + getAsignaturas() + ", con el codigo " + getIdAsignatura()
				+ ", se cursa en " + getCurso());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Definir variable
		CicloFormativo asignaturaCiclo = new CicloFormativo();

		asignaturaCiclo.setAsignaturas(Asignaturas.PROGRAMACION);
		asignaturaCiclo.setIdAsignatura(1);
		asignaturaCiclo.setCurso(Curso.PRIMERO);

		asignaturaCiclo.mostrarAsignatura();

	}

}
