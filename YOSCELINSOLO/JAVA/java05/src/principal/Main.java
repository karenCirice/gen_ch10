/**
 * 
 */
package principal;

/**
 * Sesión 05 Flujo de control
 * @author Yoscelín RS
 *4 abr. 2022
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		/*boolean condicion = false;
		int bandera = 1;
		// if se ejecuta si la condición es verdadera
		if(condicion) {
			bandera=2;
			System.out.println("La condición es verdadera");
			
		}  else {
			bandera = 3;
			System.out.println("La condición es falsa");
		}
		
		
		System.out.println("Valor de bandera" + bandera);
		System.out.println("Se continua con otras instrucciones"); */
		
		// valor entre 0 y 100
		// Prueba <=90 => A, >=80 <90 =B ...
		/*int prueba = 88;
		char calificacion = ' ';
		if (prueba >= 90) {
			calificacion = 'A';
		}else if (prueba >=80 ) {
			calificacion = 'B';
		}else if (prueba >= 70 ) {
			calificacion ='C';
		}else if (prueba >= 60) {
			calificacion = 'D';
		}else {
			calificacion ='F';
		}
		
		System.out.println("Se continua con instrucciones");
		System.out.println("Calificación =" + calificacion);
		*/
		
		//Ejercicio con swith//
		
		/*int mes = 12;
		string mesString;
		
		switch (mes) {
		case 1 : mesString = "Enero";
		break;
		case 3 : mesString = "Febrero";
		break;
		case 4 : mesString = "Marzo";
		break;
		case 5 : mesString = "Abril";
		break;
		case 6 : mesString = "Mayo";
		break;
		case 7 : mesString = "Febrero";
		break;
		case 8 : mesString = "Febrero";
		break;
		case 9 : mesString = "Febrero";
		break;
		case 10 :mesString = "Febrero";
		break;
		case 11: mesString = "Febrero";
		break;
		case 12: mesString = "Febrero";
		break;
		default: mesString = "mes inválido";
		}
		System.out.println("Mes indicado :" +mesString);
		*/
		
		
		//Primeavera: 3,4,5
		//Verano : 6,7,8
		//Otoño : 9,10,11
		//Invierno : 12,1,2
		
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
	


