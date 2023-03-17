package main.java.ieseuropa;

public class Numero {
	
	
	
	private static boolean esPrimo(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		
		
	}

}
