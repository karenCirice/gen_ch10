package principal;

/**
 * 
 * @author cynth
 * 4 abr. 2022
 */
public class Main {

		public static void main(String[] args) {
			/*boolean condicion= false;
			int bandera = 1;
			
			if(condicion) { // Dice si es verdadera o falsa
			bandera = 2;
			System.out.println("La condicion es verdadera");
			}else {
			bandera = 3;
			System.out.println("La condicion es falsa");
			}
			System.out.println("Valor de la bandera: " +bandera);
			System.out.println("Se continua con otras instrucciones");*/
			
			//valor entre 0 y 100
			//Prueba >=90-> A, >=80 <90 =B ... 
			
			/*int prueba = 144;
			String calificacion = " ";
			if (prueba >= 100) {
				calificacion = "Valor invalido";
			}
			else if (prueba >=90) {
				calificacion = "A Bueno";
			}
			else if (prueba >=80) {
				calificacion = "B Bueno";
			}
			else if (prueba >=70) {
				calificacion = "C Regular";
			}
			else if (prueba >=60) {
				calificacion = "D Aprovado";
			}
			else {
				calificacion = "F Se requiere hacer otra evaluacion";
			}
			System.out.println("Calificacion = " + calificacion);
		}*/
			
			
		/*	short prueba = 101;
			char cal = 'N';
			if (prueba >= 90 && prueba <= 100) {
				cal = 'A';
			} else if (prueba >= 80 && prueba <= 89) {
				cal = 'B';
			} else if (prueba >= 70 && prueba <= 79) {
				cal = 'C';
			} else if (prueba >= 60 && prueba <= 69) {
				cal = 'D';
			} else if (prueba >= 0 && prueba <= 59) {
				cal = 'F';
			} else {
				System.out.println("Valor inválido");
				System.exit(0);
			}
			System.out.print("Calificación: " + cal);
*/
			
			//palabra reservada switch
			/*int mes = 2;
			String mesString;
			
			switch (mes) {
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
				default: mesString = "Mes invalido";
			}
			System.out.println("El mes es " + mesString);*/
			
			
			//Ejercicio: estaciones del a;o,
			//Primavera : 3,4,5
			//Verano: 6,7,8
			//Oto;o: 9,10,11
			//Invierno: 12,1, 2
			int mesCalendario =5;
			String estacion;
			
			switch (mesCalendario) {
			case 1: case 2: case 12:
				estacion = "Invierno";
				break;
			case 3: case 4: case 5:
				estacion = "Primevera";
				break;
			case 6: case 7: case 8:
				estacion = "Verano";
				break;
			case 9: case 10: case 11:
				estacion = "Oto;o";
				break;
			default: estacion = "Dato invalido";
			break;
			}
					System.out.println(estacion);
}
}
