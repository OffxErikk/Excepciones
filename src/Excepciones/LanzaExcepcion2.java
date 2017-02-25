package Excepciones;

public class LanzaExcepcion2 {

	private void metodoExcepcion () {
		RuntimeException miError = new RuntimeException ("Error inventado por mi");
		throw miError;
	}
	
	public static void main(String[] args) {
		LanzaExcepcion2 miPrograma = new LanzaExcepcion2 ();
		try {
			miPrograma.metodoExcepcion();	
		} catch (Exception e) {
			System.out.println("El programa falló con el mensaje: " + e.getMessage());
		}
		System.out.println("A pesar del error anterior, la ejecución continua");
		
	}

}