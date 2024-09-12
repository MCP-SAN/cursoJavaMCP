package es.cursojava.inicio.condicionales;

public class EjemploSwitch {

	public static void main(String[] args) {
		//Un Switch solo podemos usarlo para una única variable
		
		String mes = "Enero";
		
		switch(mes) {
		case "Enero":System.out.println("Invierno");
		case "Febrero":System.out.println("Invierno");
		case "Marzo":System.out.println("Invierno");
		case "Abril":System.out.println("Primavera");
		case "Mayo":System.out.println("Primavera");
		case "Junio":System.out.println("Primavera");
		case "Julio":System.out.println("Verano");
		case "Agosto":System.out.println("Verano");
		case "Septiembre":System.out.println("Verano");break;
		case "Octubre":System.out.println("Otoño");
		case "Noviembre":System.out.println("Otoño");
		case "Diciembre":System.out.println("Otoño");
		}

	}

}
