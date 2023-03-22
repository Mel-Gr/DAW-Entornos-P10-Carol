package main.java.ieseuropa;

public class Numero {
	
	
	public static String convertirSegundosAHorasMinutosSegundos(int segundos) {
	    int horas = segundos / 3600;
	    int minutos = (segundos % 3600) / 60;
	    int segundosRestantes = segundos % 60;
	    String resultado = segundos + "segundos son " + horas + " horas, " + minutos + " min, y " + segundosRestantes + " segundos" ;
	    return resultado;
  }

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
