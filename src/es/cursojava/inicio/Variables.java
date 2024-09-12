package es.cursojava.inicio;

public class Variables {

	//método static --> se puede invocar sin necesidad de crear un objeto de esta clase.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JAVA es un lenguaje fuertemente tipado
		//Variables de instancia --> definidas a nivel de clase.
		//Variables locales --> definidas a nivel de método.
		//Tenemos 2 tipos de variables en JAVA: 
		//TIPOS PRIMITIVOS
		//enteros
		byte num1 = 1; //-128 a 128
		short num2 = 2;
		int num3 = 7;
		long num4 = 123123; //BBDD para primaryKey
		
		//decimales
		double decimal = 7.5; 
		float decimal1 = 5.6f;
		
		char caracter = 'a';
		
		boolean esMayorEdad = true;		
		
		//TIPO OBJETO
		String mensaje = "Hola Mundo ";
		int[] arrayNumeros = {1, 2, 3};
		
		//	var a = tipoindefinido;
		
		
		//los tipos objeto se encuentran dentro de JRE System Library 
		//tenemos la librería "java.base" --> "java.lang
		
		//syso + (ctrol + espacio)
		System.out.println(mensaje + num3 + 3); //Hola Mundo 73 
		System.out.println(num3 + 3); //10
		System.out.println(mensaje + (num3 + 3));
		

	}

}
