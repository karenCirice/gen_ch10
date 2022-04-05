package principal;

import java.security.MessageDigest;

public class Main {
	public static void main(String[] args) {
		/*
		boolean condicion = true;
		int bandera = 1;
		//if se ejucuta si la condición es verdadera
		if(condicion) {
			bandera = 2;
			System.out.println("La condición es verdadera");
		}else {
			bandera = 3;
			System.out.println("La condicion es falsa");
		}
		
		//comando rápido syso + ctrl + space
		System.out.println("Valor de bandera: "+bandera);
		System.out.println("Se continua con otras instrucciones");	
		 */
		
		//Ejercicio
		//Prueba >= 90 ->A
		
		/*
		int prueba = 88;
		char calificacion = ' ';
		
		if (prueba >= 90) {
			calificacion = 'A';
		}else if(prueba >= 80) {
			calificacion = 'B';
		}else if (prueba >= 70) {
			calificacion = 'C';
		}else if (prueba >= 60) {
			calificacion = 'D';
		}else {
			calificacion = 'F';
		}
		System.out.println("Calificacion: "+calificacion);
		*/
		
		/*
		 * int mes = 10; String mesS; switch (mes) { case 1: mesS = "Enero"; break; case
		 * 2: mesS = "Febrero"; break; case 3: mesS = "Marzo"; break; case 4: mesS =
		 * "Abril"; break; case 5: mesS = "Mayo"; break; case 6: mesS = "Junio"; break;
		 * case 7: mesS = "Julio"; break; case 8: mesS = "Agosto"; break; case 9: mesS =
		 * "Septiembre"; break; case 10: mesS = "Octubre"; break; case 11: mesS =
		 * "Noviembre"; break; case 12: mesS = "Diciembre"; break; default: mesS =
		 * "Mes no encontrado"; break; } System.out.println("Mes indicado: "+mesS);
		 */
		//Primavera: 3, 4, 5
		//Verano: 6, 7, 8
		//Otoño: 9, 10, 11;
		//Invierno: 12, 1, 2
		int mesCalendario = 3;
		String estacionAnio="";
		
		switch (mesCalendario) {
		case 1, 2, 12:
			estacionAnio = "Invierno";
			break;
		case 3: case 4: case 5:
			estacionAnio = "Primavera";
			break;
		case 6: case 7: case 8:
			estacionAnio = "Verano";
			break;
		case 9: case 10: case 11:
			estacionAnio = "Otoño";
			break;
		default:
			break;
		}
		System.out.println("La estacion es: "+estacionAnio);
	}
}
