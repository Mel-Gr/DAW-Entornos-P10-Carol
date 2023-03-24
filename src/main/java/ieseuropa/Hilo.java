package main.java.ieseuropa;

import java.util.Scanner;

public class Hilo {

	public static String mayus(String string) {
		return string = string.toUpperCase();
	}

	public static String minus(String string) {
		return string = string.toLowerCase();
	}

	public static int longitud(String string) {
		int size = string.length();
		return size;
	}

	private static int ocurrenciasLetra(char a, String string) {
		int contador = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(a)) {
				contador++;
			}
		}
		return contador;
	}

	public static String devolverXVeces(String uno, String dos, int veces) {

		String resultado = "";

		for (int i = 0; i < veces; i++) {
			resultado += uno + " " + dos + " ";
		}

		return resultado;
	}

	public static String borrarOcurrencias(String uno, String dos) {
	    String unoLower = uno.toLowerCase();
	    String dosLower = dos.toLowerCase();
	    int index = unoLower.indexOf(dosLower);
	    while (index != -1) {
	        uno = uno.substring(0, index) + uno.substring(index + dos.length());
	        unoLower = uno.toLowerCase();
	        index = unoLower.indexOf(dosLower);
	    }
	    return uno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ocurrenciasLetra('a', "Me encanta entornos"));
		System.out.println(devolverXVeces("Hola", "adios", 3));
		System.out.println(mayus("hola"));
		System.out.println(minus("HOLA"));
		System.out.println(longitud("HOLA hola"));
		System.out.println(borrarOcurrencias("Real Zaragoza es de la realeza", "Real"));
	}

}
