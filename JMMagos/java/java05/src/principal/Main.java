package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean id =true;
		short i=1;
			if(id) {
				i=3;
				System.out.println("es verdadero");
			}else {
				id=true;
				i=2;
				System.out.println("es falso");
			}*/
		
		/*short prueba = 101;
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
		
		/*
		 
		short num= 3;
		String mes="0";
		switch(num) {
		case 1: mes="Enero";break;
		case 2: mes="Febrero";break;
		case 3: mes="Marzo";break;
		case 4: mes="Abril";break;
		case 5: mes="Mayo";break;
		case 6: mes="Junio";break;
		case 7: mes="Julio";break;
		case 8: mes="agosto";break;
		case 9: mes="sep";break;
		case 10: mes="oct";break;
		case 11: mes="nov";break;
		case 12: mes="diciembre";break;
		default: 
			System.out.println("Valor inválido");
			System.exit(0);
		}
		System.out.println(mes);
		*/
		
		short mes= 3;
		String estacion="0";
		switch(mes) {
		case 3: 
		case 4: 
		case 5: estacion="Primavera";break;
		
		case 6: 
		case 7: 
		case 8: estacion="Verano";break;
		
		case 9: 
		case 10: 
		case 11: estacion="Otoño";break;
		
		case 1: 
		case 2: 
		case 12: estacion="Invierno";break;
		default: 
			System.out.println("Valor inválido");
			System.exit(0);
		}
		System.out.print("Mes: "+mes+" esatación: "+estacion);
		
	}

}
