package main.java.ieseuropa;

public class Numero {
	
	
	public static boolean esNumeroArmstrong(int numero) {
	    int suma = 0;
	    int numeroOriginal = numero;
	    int numDigitos = String.valueOf(numero).length();
	    while (numero != 0) {
	        int digito = numero % 10;
	        suma += Math.pow(digito, numDigitos);
	        numero /= 10;
	    }
	    if (suma == numeroOriginal) {
	    	return true;
	    } else {
	    	return false;
	    }


	public static String convertirSegundosAHorasMinutosSegundos(int segundos) {
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundosRestantes = segundos % 60;
		String resultado = segundos + "segundos son " + horas + " horas, " + minutos + " min, y " + segundosRestantes
				+ " segundos";
		return resultado;
	}

	private static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static String seriePell() {
		return "0-1-2-5-12-29-70-169-408-985-2378-5741-13860-33461-80782";
	}

	private static int calcularFactorial(int num) {
		int factorial = 1;
		for (int i = num - 1; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;	
		esNumeroArmstrong(23584);
		System.out.println(seriePell());
		calcularFactorial(numero);
	}

}
