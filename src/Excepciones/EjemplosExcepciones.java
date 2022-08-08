package Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemplosExcepciones {

	public void muestraMenu() {
		System.out.println("(1) - ClassCast");
		System.out.println("(2) - StringIndexOutOfBounds");
		System.out.println("(3) - NegativeArraySize");
		System.out.println("(4) - InputMismatch");
		System.out.println("(5) - NumberFormat");
		System.out.println("(6) - Aritmetic");
		System.out.println("(7) - NullPointer");
		System.out.println("(8) - FileNotFound");
	}

	public void classCast() {
		Object objeto = "HolaMundo";
		System.out.println((Integer) objeto);
	}

	public void stringIndexOutOfBounds() {
		System.out.println("HolaMundo".charAt(20));
	}

	public void negativeArraySize() {
		int array_enteros[] = new int[-5];
	}

	public void inputMismatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número con decimales");
		int numEntero = sc.nextInt();
	}

	public void numberFormat() {
		System.out.println(Integer.parseInt("Hola"));
	}

	public void aritmetic() {
		System.out.println(4 / 0);
	}

	public void nullPointer() {
		String texto = null;
		System.out.println(texto.length());
	}

	public void fileNotFound() throws FileNotFoundException {
		FileReader fr = new FileReader("Camino incorrecto");
	}

	public static void main(String[] args) throws IOException {
		EjemplosExcepciones ejemplo = new EjemplosExcepciones();
		char tipo = 0;
		System.out.println("Elige una Excepción: ");
		ejemplo.muestraMenu();
		tipo = (char) System.in.read();
		switch (tipo) {
		case '1':
			ejemplo.classCast();
			break;
		case '2':
			ejemplo.stringIndexOutOfBounds();
			break;
		case '3':
			ejemplo.negativeArraySize();
			break;
		case '4':
			ejemplo.inputMismatch();
			break;
		case '5':
			ejemplo.numberFormat();
			break;
		case '6':
			ejemplo.aritmetic();
			break;
		case '7':
			ejemplo.nullPointer();
			break;
		case '8':
			ejemplo.fileNotFound();
			break;
		}
	}
}
