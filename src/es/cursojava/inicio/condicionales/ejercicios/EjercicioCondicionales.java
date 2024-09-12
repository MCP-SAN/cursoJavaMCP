package es.cursojava.inicio.condicionales.ejercicios;

public class EjercicioCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//si mes enero, feb, mar --> invierno
		//si mes abr, may, jun --> primaver
		
		String mes = "Mayo";		
		
		if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
			System.out.println("Es Invierno");	
		}else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") {
			System.out.println("Es Primavera");
		}else if (mes == "Julio" || mes == "Agosto" || mes == "Septiembre") {
			System.out.println("Es Verano");
		}else if (mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre"){
			System.out.println("Es Otoño");
		}else {
			System.out.println("mes incorrecto");
		}
		
		if (mes.equals("Enero") || mes.equals("Febrero") || mes.equals("Marzo")) {
			System.out.println("Es Invierno");	
		}else if (mes.equals("Abril") || mes.equals("Mayo") || mes.equals("Junio")) {
			System.out.println("Es Primavera");
		}else if (mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Septiembre")) {
			System.out.println("Es Verano");
		}else if (mes.equals("Octubre" || mes.equals("Noviembre" || mes.equals("Diciembre"))))){
			System.out.println("Es Otoño");
		}else {
			System.out.println("Mes incorrecto");
		}
	}
}
