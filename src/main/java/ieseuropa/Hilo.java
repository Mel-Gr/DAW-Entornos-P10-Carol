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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	System.out.println(	ocurrenciasLetra('a', "Me encanta entornos"));
		System.out.println(devolverXVeces("Hola","adios",3));
		System.out.println(mayus("hola"));
		System.out.println(minus("HOLA"));
		System.out.println(longitud("HOLA hola"));
		
	}

}
