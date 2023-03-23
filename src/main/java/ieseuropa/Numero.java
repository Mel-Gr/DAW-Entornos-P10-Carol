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
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		
		
	}

}
