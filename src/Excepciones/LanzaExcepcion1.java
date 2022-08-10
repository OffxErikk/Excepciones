package Excepciones;

public class LanzaExcepcion1 {

	private void metodoExcepcion () {
		RuntimeException miError = new RuntimeException ("Error inventado por mi");
		throw miError;
	}
	
	public static void main(String[] args) {
		LanzaExcepcion1 miPrograma = new LanzaExcepcion1 ();
		miPrograma.metodoExcepcion();
		System.out.println("Este mensaje no se imprime porque el programa se para");
	}
}
