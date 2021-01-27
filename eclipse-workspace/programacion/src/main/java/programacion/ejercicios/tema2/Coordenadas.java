/**
 * 
 */
package programacion.ejercicios.tema2;

/**
 * @author Vespertino
 *
 */
public class Coordenadas {

	private double x;
	private double y;

	/**
	 * 
	 */
	public Coordenadas() {
		super();
		x = 0.0;
		y = 0.0;

	}

	/**
	 * @param x
	 * @param y
	 */
	public Coordenadas(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	public void infoCoordenadas() {
		System.out.println("Punto( Punto x:" + getX() + " Punto Y:" + getY() + ")");
	}

	/**
	 * Metodo para calcular distancia recibiendo como entrada dos valores decimales
	 * 
	 * @param coordenadaX
	 * @param coordenadaY
	 * @return resultado
	 */
	public double calcularDistancia(double coordenadaX, double coordenadaY) {

		double resultado = Math.sqrt(Math.pow(coordenadaX - x, 2) + Math.pow(coordenadaY - y, 2));

		return resultado;
	}

	/**
	 * Metodo para calcular distancia recibiendo como entrada un objeto tipo
	 * Coordenadas
	 * 
	 * @param punto
	 * @return resultado
	 */
	public double calcularDistancia2(Coordenadas punto) {

		double resultado = Math.sqrt(Math.pow(punto.x - x, 2) + Math.pow(punto.y - y, 2));
		System.out.print(resultado);

		return resultado;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coordenadas origen = new Coordenadas();
		origen.x = 0;
		origen.y = 0;
		origen.infoCoordenadas();
		
		

		Coordenadas punto1 = new Coordenadas();
		punto1.x = 1;
		punto1.y = 5;
		punto1.infoCoordenadas();

		Coordenadas punto2 = new Coordenadas();
		punto2.x = 8;
		punto2.y = 20;
		punto2.infoCoordenadas();

		Coordenadas puntoIntermedio = new Coordenadas();
		puntoIntermedio.x = (punto1.x + punto2.x) / 2;
		puntoIntermedio.y = (punto1.y + punto2.y) / 2;
		puntoIntermedio.infoCoordenadas();

		// Calcular distancia
		
		origen.calcularDistancia2(punto1);
		

	}

}
