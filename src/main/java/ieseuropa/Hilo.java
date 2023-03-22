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

	private static String duplicarLetras(String string) {
		String resultado = "";
		for (int i = 0; i < string.length(); i++) {
			resultado += string.charAt(i);
			resultado += string.charAt(i);
		}
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		duplicarLetras("NBA");
	}

}
