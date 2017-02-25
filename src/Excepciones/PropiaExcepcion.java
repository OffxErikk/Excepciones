package Excepciones;

public class PropiaExcepcion {

	static int calcular(String str1, String str2)
			throws ExcepcionIntervalo, NumberFormatException, ArithmeticException {
		int num = Integer.parseInt(str1);
		int den = Integer.parseInt(str2);
		if ((num > 100) || (den < -5)) {
			throw new ExcepcionIntervalo("Números fuera del intervalo");
		}
		return (num / den);
	}

	public static void main(String[] args) {
		/*
		 *  Hay tres tipos de error: 
		 *  a) División entre 0
		 *  b) Caracter no válido
		 *  c) Número fuera de rango [-5,100]
		 */
		String str1 = "101";
		String str2 = "2";
		String respuesta;
		int numerador, denominador, cociente;
		try {
			cociente = calcular(str1, str2);
			respuesta = String.valueOf(cociente);
		} catch (NumberFormatException ex) {
			respuesta = "Se han introducido caracteres no numéricos";
		} catch (ArithmeticException ex) {
			respuesta = "División entre cero";
		} catch (ExcepcionIntervalo ex) {
			respuesta = ex.getMessage();
		}
		System.out.println("La respuesta es: " + respuesta);
	}

}

 class ExcepcionIntervalo extends Exception {
	public ExcepcionIntervalo(String msg) {
		super(msg);
	}

}
