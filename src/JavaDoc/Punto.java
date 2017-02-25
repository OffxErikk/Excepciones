package JavaDoc;
/**
 * Esta clase define un punto en un espacio de dos dimensiones.
 * 
 * @author Óscar Belmonte Fernández
 * @version 1.0, 27 de Octubre de 2004
 */
public class Punto {
	/**
	 * @param x
	 *            Coordenada x del punto
	 */
	protected float x;
	
	/**
	 * @param y
	 *            Coordenada y del punto
	 */
	protected float y;

	/**
	 * Constructor por defecto
	 */
	public Punto() {
		x = 0.0f;
		y = 0.0f;
	}

	/**
	 * Constructor con argumentos.
	 * 
	 * @param x
	 *            La coordenada ’x’ del punto.
	 * @param y
	 *            La coordenada ’y’ del punto.
	 */
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Con esta función se recupera el valor de la coordenada solicitada
	 * 
	 * @param coordenada
	 *            La coordenada que se solicita ’x’ o ’y’
	 * @return El valor de la coordenada
	 * @deprecated Esta función se eliminará en próximas versiones
	 * @see #getX()
	 * @see #getY()
	 */
	public float get(String coordenada) {
		if (coordenada.equals("x"))
			return x;
		else if (coordenada.equals("y"))
			return y;
		return x;
	}

	/**
	 * Esta función devuelve el valor de la coordenada ’x’
	 * 
	 * @return El valor de la coordenada ’x’
	 */
	public float getX() {
		return x;
	}

	/**
	 * Esta función cambia el valor de la coordenada ’x’
	 * 
	 * @param x
	 *            El nuevo valor de la coordenada ’x’
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Esta función cambia el valor de la coordenada ’y’
	 * 
	 * @param x
	 *            El nuevo valor de la coordenada ’y’
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * Esta función devuelve el valor de la coordenada ’y’
	 * 
	 * @return El valor de la coordenada ’y’
	 */
	public float getY() {
		return y;
	}

	/**
	 * Esta función devuelve un punto que es el inverso del punto
	 * 
	 * @return Punto El inverso de este punto
	 */
	public Punto inverso() {
		return new Punto(-x, -y);
	}

	/**
	 * Sobre escritura de toString()
	 * 
	 * @return String Una cadena con la información a mostrar
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
