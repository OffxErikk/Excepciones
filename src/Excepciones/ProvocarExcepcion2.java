package Excepciones;

public class ProvocarExcepcion2 {
	private int metodoExcepcion (int div){
		int resultado = 0; 
		try {
			resultado = 10/div;
		} catch (Exception e) {
			System.out.println("Se ha producido un error: " + e.getMessage() );
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		ProvocarExcepcion2 miPrograma = new ProvocarExcepcion2 ();
		miPrograma.metodoExcepcion(0);
		System.out.println("Ahora sí se imprime");
	}
}
