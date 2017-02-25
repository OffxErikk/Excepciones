package Excepciones;

public class ProvocarExcepcion3 {
	private int metodoExcepcion(int div) {
		int resultado = 0;
		resultado = 10 / div;
		return resultado;
	}

	public static void main(String[] args) {
		ProvocarExcepcion3 miPrograma = new ProvocarExcepcion3();
		try {
			miPrograma.metodoExcepcion(0);
		} catch (Exception e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}
		System.out.println("Ahora sí se imprime");
	}
}
