package es.cursojava.inicio.bucles;

public class BucleFor {

	public static void main(String[] args) {
		// 1 - inicialización variable del for
		// 2 - hasta cuándo tiene que hacer el for "mientras"
		// 3 - variable 
		
		for (int i = 0; i<100; i++ ) {
			//System.out.println("Hola Mundo " + i);
			if (i%2==0) {				
				continue; //para que siga
			}
			if (i%3==0) {				
				continue; //para que siga
			}
			System.out.println(i);
			if (i>=10) {
				break;
			}
			
		}
		System.out.println("FIN");
		
	}

}
