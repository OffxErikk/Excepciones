package Excepciones;

public class LanzaExcepcion3 {

	private void metodoInicial() {
		try {
			metodoExcepcionOrigen();
		} catch (Exception e) {
			System.out.println("El programa falla con el mensaje: " + e.getMessage());
		}
	}

	private void metodoExcepcionOrigen() throws RuntimeException {
		RuntimeException miError = new RuntimeException("Error inventado por mi");
		throw miError;
	}

	public static void main(String[] args) {
		LanzaExcepcion3 miPrograma = new LanzaExcepcion3();
		miPrograma.metodoInicial();
		System.out.println("A pesar del error anterior, la ejecuci�n continua");
	}
}