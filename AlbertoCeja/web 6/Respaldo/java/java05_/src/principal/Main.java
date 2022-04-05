package principal;

public class Main {

	public static void main(String[] args) {
		/*
		boolean condicion = true;
		//if se ejucuta si la condición es verdadera
		if(condicion) {
			System.out.println("La condición es verdadera");
		}
		//comando rápido syso + ctrl + space
		System.out.println("Se continua con otras instrucciones");
		
		
		//segunda parte...
		boolean condition = false;
		int bandera = 1;
		
		//Se ejecuta su cumple la función.
		if(condition) {
			bandera = 2;
			System.out.println("Condición verdadera");
		}else {
		bandera = 3;
		System.out.println("Condición Falsa");
	}
	System.out.println("Valor de bandera: " +bandera);
	System.out.println(" Se contitnua con otras instrucciones");
	*/
		/*
		//If-else anidado, para evaluar la calificaion del estudiante.
		int prueba = 78;
		char calificacion = ' ';
		if(prueba >=90 ) {
			calificacion = 'A';
		}else if(prueba >= 80 ) {
			calificacion = 'B';
		}else if(prueba >= 70) {
			calificacion = 'C';
		}else if(prueba >= 60) {
			calificacion = 'D';
		}else {
			calificacion = 'F';
		}
		System.out.println("La calificación es: "+calificacion);
		*/
		
		/*
		int mes = 2;
		case 1: mesString = "Enero";
		break;
		case 2: mesString = "Febrero";
		break;
		case 3: mesString = "Marzo";
		break;
		case 4: mesString = "Abril";
		break;
		case 5: mesString = "Mayo";
		break;
		case 6: mesString = "Junio";
		break;
		case 7: mesString = "Julio";
		break;
		case 8: mesString = "Agosto";
		break;
		case 9: mesString = "Septiembre";
		break;
		case 10: mesString = "Octubre";
		break;
		case 11: mesString = "Noviembre";
		break;
		case 12: mesString = "Diciembre";
		break;
		default: mesString = "Mes Inválido";
			break;
			*/
		
		// 1,2,12 => Invierno.
		//2,3,5 => Verano.
		//5,7,8 => Otoño.
		//9,10,11 => Primavera.
		int mesCalendario = 3;
		String estacion;
		switch(mesCalendario) {
		case 1: case 2: case 12:
			estacion = "Invierno";
		break;
		case 3,4,5:
			estacion = "Verano";
		break;
		case 6,7,8:
			estacion = "Otoño";
		break;
		case 9,10,11:
			estacion = "Primavera";
		break;
		default: estacion = "Mes invalido";
		}
		System.out.println(estacion);

		
	}
}