package es.cursojava.inicio.condicionales;

public class EjemploIf {
	
	//el método estático están asociados a una clase, 
	//pero no a instancias específicas de esa clase...
	//Una clase abstracta para Java es una clase de la que nunca se van a crear instancias: 
	//simplemente va a servir como superclase a otras clases. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =2;
		int nota = 6;
		
		if (numero%2 != 0) {
			System.out.println("El número es impar.");
		} else
			System.out.println("El número es par.");
		
		if (nota<5) {
			System.out.println("Suspenso");			
		}else if(nota<7) {
			System.out.println("Aprobado");			
		}else if(nota<9) {
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
		
		//++ aumenta en uno el valor de un entero
		System.out.println(nota++); // --> es 6 la pinta y luego suma el ++ --> 7
		System.out.println(++nota); // --> 8
		System.out.println(nota+=3); //nota = nota + 3; --> 11
		
		System.out.println("Fin");
		

	}

}
