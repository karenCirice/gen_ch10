package principal;


/**
 * Sesi�n 05 flujo de control
 * @author A10
 *
 */

public class Main {

	public static void main(String[] args) {
		/*boolean condicion = false; //Le dimos doble click en el 13 de la izq, para hacer un breakpoint
		int bandera = 1;
		
		//El if evalua si la condici�n entre () es true or false
		// si es true, aplica lo que est� primero en las llaves
		//si no, sale y ejecuta el sig c�digo
		if (condicion) {
			bandera = 2;
			System.out.println("La condici�n es verdadera");
			
		}else {
			bandera = 3;
			System.out.println("La condici�n es falsa");
		}
		System.out.println("Valor de la bandera " + bandera);
		System.out.println("Se continua con otras instrucciones");
		*/
		
		//valor entre 0 y 100
		//Prueba >=90 -> A, >=80 <90 =B ...
		/*int prueba = 110;
		char calificacion = ' ';  //Se pone char ya que son valores chicos
		if (prueba >= 90) {			
			calificacion = 'A';		
		}
		else if (prueba >=80) {
			calificacion = 'B';
		}
		else if (prueba >=70) {
			calificacion = 'C';
		}
		else if (prueba >=60) {
			calificacion = 'D';
		}
		else {						//La �ltima opci�n solo lleva else
			calificacion = 'F';
		}
		System.out.println("Calificaci�n = "+ calificacion);  //Aqu� sale la instrucci�n al final de realizar el if*/
	
		//------------------ESTACIONES-----------------
				//Primavera: 3,4,5
				//Verano: 6,7,8
				//Oto�o: 9,10,11
				//Invierno: 12,1,2
				
				int mesCalendario = 3;
				String estacion;
				
				switch (mesCalendario) {
				case 1: case 2: case 12: 
					estacion = "Invierno";
				break;  		//el break es para que no salte a menos que si 
				case 3: case 4: case 5:
					estacion = "Primavera";
				break;
				case 6: case 7: case 8:
					estacion = "Verano";
				break;
				case 9: case 10: case 11:
					estacion = "Oto�o";
				break;
				default: estacion = "Mes invalido";
				break;
				
				}
				System.out.println("Estacion del a�o: " + estacion);
			}

	}

