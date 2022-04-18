package principal;

/**
 * Sesión 05 Flujo de control
 * 
 * @author marcosds
 *
 */

public class Main {

	public static void main(String[] args) {
		/*
		boolean condicion = false;
		// Se puede usar solo la estrucura if
		// comando rápido if + ctrl + space
		if (condicion) {
			System.out.println("La condición es verdadera");
		}

		System.out.println("Se prosigue con otras instrucciones");

		// También, es posible usar if else
		if (condicion == true) {
			// Se ejecutará este bloque si la condición es verdadera
			// La estructura podría quedar if (condicion){ }
			System.out.println("La condición es verdadera");
		} else {
			// si la condición es falsa, se ejecuta este bloque
			System.out.println("La condición es falsa");
		}
		System.out.println("Se prosigue con otras instrucciones");

		int numero = 4;

		if (numero == 0) {
			System.out.println("El número es cero");
		} else if (numero == 1) {
			System.out.println("El número es uno");
		} else if (numero >= 2 && numero <= 20) {
			System.out.println("Número está en rago de 2 a 20");
		} else {
			System.out.println("Número no es 0, 1, ni está en rango de 2 a 20 ");
		}
		
		//El switch puede ser condición numérica o String.
		// se tiene que usar beak, para romper a continuación de los sig. casos
		int seleccion = 4;
		String seleccionTxt = "";
		
		switch (seleccion) {
		case 1:
			seleccionTxt = "Selección uno";
			break;
		case 2:
			seleccionTxt = "Selección dos";
			break;
		case 3:
			seleccionTxt = "Selección Tres";
			break;
		case 4: case 5:
			seleccionTxt = "Seleccion 4 o 5";
			break;
		default:
			seleccionTxt = "Selección indeterminada";			
		}
		System.out.println("Usuario realizó: " + seleccionTxt);*/
		
		/*
		 * boolean condicion = true; int bandera = 1; //if se ejucuta si la condición es
		 * verdadera if(condicion) { bandera = 2;
		 * System.out.println("La condición es verdadera");
		 * 
		 * }else { bandera = 3; System.out.println("La condición es falsa"); } //comando
		 * rápido syso + ctrl + space System.out.println("Valor de bandera : "
		 * +bandera); System.out.println("Se continua con otras instrucciones");
		 */
		/*
		 * // valor entre 0 y 100 int prueba = 110; char calificacion; if (prueba >= 90)
		 * { calificacion = 'A'; } else if (prueba >= 80) { calificacion = 'B'; } else
		 * if (prueba >= 70) { calificacion = 'C'; } else if (prueba >= 60) {
		 * calificacion = 'D'; } else { calificacion = 'F'; }
		 * System.out.println("Se continua con otras instrucciones");
		 * System.out.println("Calificacion = " + calificacion);
		 */

		/*
		 * int mes = 3; String mesString;
		 * 
		 * switch (mes) { case 1 : mesString = "Enero"; break; case 2 : mesString =
		 * "Febrero"; break; case 3 : mesString = "Marzo";
		 * 
		 * case 4 : mesString = "Abril"; break; case 5 : mesString = "Mayo"; break; case
		 * 6 : mesString = "Junio"; break; case 7 : mesString = "Julio"; break; case 8 :
		 * mesString = "Agosto"; break; case 9 : mesString = "Septiembre"; break; case
		 * 10 : mesString = "Octubre"; break; case 11 : mesString = "Noviembre"; break;
		 * case 12 : mesString = "Diciembre"; break; default: mesString =
		 * "mes inválido"; break; }
		 * 
		 * System.out.println("Mes indicado : " + mesString);
		 */

		// Primavera : 3,4,5
		// Verano : 6,7,8
		// Otoño : 9,10,11
		// Invierno : 12, 1, 2
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
			estacion = "Mes inválido";
			break;

		}
		String estacionClon = estacion;
		estacionClon = "Dato aleatorio";
		System.out.println("Estación del año : " + estacion);
	}

}
