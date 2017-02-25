package Excepciones;

public class ProvocarExcepcion1 {
	private int metodoExcepcion (int div){
		int resultado = 0; 
		resultado = 10/div;
		return resultado;
	}
	
	public static void main(String[] args) {
		ProvocarExcepcion1 miPrograma = new ProvocarExcepcion1 ();
		miPrograma.metodoExcepcion(0);
		System.out.println("Esto no llega a imprimirse");
	}
}
