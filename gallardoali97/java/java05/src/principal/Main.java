package principal;
/**
 * Sesi�n 5 Flujo de control
 * @author Asus Al�
 *
 */
public class Main {

	public static void main(String[] args) {
		/* 
		boolean condicion = true;
		int bandera=1;
		//If se ejecuta la condici�n verdadera
		if (condicion) {
			bandera=2;
			System.out.println("La condici�n es verdadera");
		}else {
			bandera =3;
		System.out.println("La condici{on es falsa");
		}
		System.out.println("Valor de bandera "+bandera);
		System.out.println("Se continuan las siguientes instrucciones");
		
		short prueba=100;
		char cal;
		if(prueba>=90) {
			cal='A';
		}else if(prueba>=80) {
				cal='B';
		}else if(prueba >=70) {
				cal='C';
		}else if(prueba >=60) {
				cal='D';
		}else  {
				cal='F';
		}		
		System.out.print("Calificaci�n: "+ cal);  
		
		int mes = 11;
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
		default: mesString = "Mes inv�lido";
		}
		System.out.println("Mes indicado: "+mesString);  */
		
		//Primavera: 3,4,5
		//Verano: 6,7,8
		//Oto�o: 9,10,11
		//Invierno: 12,1,2
		int mesCalendario = 12;
		String estacion;
		switch(mesCalendario) {
		case 1: case 2: case 12:
			estacion = "Invierno";
		break;
		case 3: case 4: case 5:
			estacion = "Primavera";
		break;
		case 6: case 7: case 8:
			estacion = "Verano";
		break;
		case 9: case 10: case 11:
			estacion = "Oto�o";
		break;
		default:
			estacion= "Mes inv�lido";
		}
		System.out.println("La estacion del a�o es: "+estacion);
     }
		
	}
