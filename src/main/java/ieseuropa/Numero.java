package main.java.ieseuropa;

public class Numero {

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

	private static boolean numSuerte(int num) {
		if (num > 0) {
			ArrayList<Integer> numeros = new ArrayList<>();
			for (int i = 1; i <= num; i++) {
				numeros.add(i);
			}
			for (int i = 1; i < numeros.size(); i += 2) {
				numeros.remove(i);
			}
			for (int i = 2; i < numeros.size(); i += 3) {
				numeros.remove(i);
			}
			for (int i = 6; i < numeros.size(); i += 7) {
				numeros.remove(i);
			}
			return numeros.contains(num);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSuerte(87));

	}

}
