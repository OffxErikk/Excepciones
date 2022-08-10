package Excepciones;
import java.io.IOException;

public class EjemploIOExcepcion {
	public static void main(String[] args) throws IOException {
		System.out.print("Escribe una letra: ");
		char letra = (char) System.in.read();
		System.out.println("Has escrito la letra: " + letra);
	}
}
