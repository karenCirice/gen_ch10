package principal;

/**
 * 
 * @author elisa 4 abr. 2022
 */

public class Main {

	public static void main(String[] args) {
		// doble click al boleano para un break point
		/*
		 * boolean condicion = false; int bandera = 1; //if se ejucuta si la condición
		 * es verdadera //si solamente tiene una instuccion se puede dejar sin {]
		 * 
		 * if(condicion) { bandera = 2; System.out.println("La condición es verdadera");
		 * }else { bandera = 3; System.out.println("La condicion es falsa"); }
		 * 
		 * System.out.println("Valor de bandera: " +bandera);
		 * System.out.println("Se continua con otras instrucciones"); }
		 */

		// valor entre 0 y 100
		// prueba >=90 -> A, >=90 <90 = B
		/*
		 * int prueba = 57; char calificacion = ' '; if(prueba >=90) { calificacion =
		 * 'A';
		 * 
		 * }else if (prueba >=80){ calificacion = 'B';
		 * 
		 * }else if (prueba >=70) { calificacion = 'C'; }else if (prueba >=60) {
		 * calificacion = 'D'; }else { calificacion = 'F'; }
		 * System.out.println("Calificacion = " +calificacion);
		 * System.out.println("Se continua con otras instrucciones");
		 */
		/*
		 * int mes = 10; String mesString; switch (mes) {
		 * 
		 * case 1 : mesString = "Enero"; break; case 2 : mesString = "Febrero"; break;
		 * case 3 : mesString = "Marzo"; break; case 4 : mesString = "Abril"; break;
		 * case 5 : mesString = "Mayo"; break; case 6 : mesString = "Junio"; break; case
		 * 7 : mesString = "Jullio"; break; case 8 : mesString = "Agosto"; break; case 9
		 * : mesString = "Septiembre"; break; case 10 : mesString = "Octubre"; break;
		 * case 11 : mesString = "Noviembre"; break; case 12 : mesString = "Diciembre";
		 * break; default: mesString ="Mes invalido"; }
		 * System.out.println("Mes indicado: " + mesString);
		 */

		int mesCalendario = 3;
		String estacion;

		switch (mesCalendario) {
		case 1:
		case 2:
		case 12:
			estacion = "Invierno";
			break;
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Otoño";
			break;
		default:
			estacion = "Mes invalido";
		}
		
		System.out.println(estacion);

	}

}
