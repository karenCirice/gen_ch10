package principal;

/**
 * Sesión 05 Flujo de control
 * @author GABRI
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		boolean condicion = true;
		int num = 1, bandera = 1;
		//if se ejecuta si la condición es verdadera
		 if (condicion) {
			 bandera = 2;
			 System.out.println("La condición es verdadera");
			 System.out.println("Imprime 1"+ num++);
			 System.out.println("Imprime 2"+ num++);
		 }else {
			 bandera = 3;
			 System.out.println("La condición es falsa");
		 }
		 
		 System.out.println("Continua. Otras instrucciones");
		 System.out.println("El valor de la bandera es: " + bandera);
		 */
		
		/*
		//------------Parte else if-------
		//Valor entre 0 y 100
		// Prueba >= 90 --> A , Prueba >=80 --> B
		int prueba = 88;
		char calificacion = ' ';
		if (prueba >= 90) {
			calificacion = 'A';
		}else if (prueba >= 80) {
			calificacion = 'B';
		}else if (prueba >= 70) {
			calificacion = 'C';
		}else if (prueba >= 60) {
			calificacion = 'D';
		}else {
			calificacion = 'F';
		}
		
		System.out.println("Calificación = " + calificacion);
		 */
		
		/*
		//----------Parte del switch----
		int mes = 10;
		String mesString;
		
		switch (mes) {
		case 1: mesString = "Enero"; break;
		case 2: mesString = "Febrero"; break;
		case 3: mesString = "Marzo"; break;
		case 4: mesString = "Abril"; break;
		case 5: mesString = "Mayo"; break;
		case 6: mesString = "Junio"; break;
		case 7: mesString = "Julio"; break;
		case 8: mesString = "Agosto"; break;
		case 9: mesString = "Septiembre"; break;
		case 10: mesString = "Octubre"; break;
		case 11: mesString = "Noviembre"; break;
		case 12: mesString = "Diciembre"; break;
		default: mesString = "Mes Inválido"; break;
		
		}
		System.out.println("Mes indicado: " + mesString);
		*/
		
		//----------switch con estaciones----
		//Primavera: 3,4,5
		//Verano: 6,7,8
		//Otoño: 9,10,11
		//Invierno: 12,1,2
		
		int mes = 8;
		String estacion;
		
		switch(mes) {
		case 1,2,12: estacion = "Invierno"; break;
		case 3,4,15: estacion = "Primavera"; break;
		case 6,7,8: estacion = "Verano"; break;
		case 9,10,11: estacion = "Otoño"; break;
		default: estacion = "mes no válido"; break;
		}
		
		System.out.println("Estación: " + estacion + " mes " + mes);
		 
	}

}
