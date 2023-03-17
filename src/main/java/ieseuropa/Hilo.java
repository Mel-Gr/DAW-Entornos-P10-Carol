package main.java.ieseuropa;

import java.util.Scanner;

public class Hilo {

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

		System.out.println(devolverXVeces("uno" , "dos" , 2));
	}

}
