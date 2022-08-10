package Excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploOrdenCaptura {
	public static void main(String[] args)  {
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.print("Escribe un número: ");
		int numero=0;
		try {
			numero = Integer.parseInt(br.readLine());
			System.out.println("El siguiente número es: " + (numero + 1));
		} catch (IOException e) {
			System.err.println("Error de Entrada/Salida");
		} catch (NumberFormatException e) {
			System.err.println("No has introducido un dígito");
		} catch (Exception e) {
			System.err.println("Error genérico");
		} finally {
			System.err.println("Esto se ejecuta siempre");
		}
		System.out.println("Fin");
	}
}
