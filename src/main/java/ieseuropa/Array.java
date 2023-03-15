package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	public static void ordenar(int [] a) {
		Arrays.sort(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,4,5,9,3,1,7};
		ordenar(a);
		System.out.println(Arrays.toString(a));
	}

}
