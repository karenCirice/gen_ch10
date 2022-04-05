package principal;

/**
 * Sesión 05 Fujo de control
 * @author EXDXC
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean condicion = true;
		
		int bandera = 1;
		
		
		if(condicion) {
			bandera = 2;
			System.out.println("La cindición es verdadera");
		}else{
			bandera = 3;
			System.out.println("La cindición es falsa");
		}
		System.out.println("Valor de la bandera: " + bandera);
		System.out.println("Se continua con las instrucciones \n \n");
		
		int prueba = 100;
		String calificacion = " ";
		
		if(prueba >= 90 && prueba <= 100) {
			calificacion = "A";
		}else if (prueba >= 80 && prueba <= 89) {
			calificacion = "B";
		}else if (prueba >= 70 && prueba <= 79) {
			calificacion = "C"; 
		}else if (prueba <= 69  && prueba >= 0) {
			calificacion = "F";
		}else {
			calificacion = "ERROR, calificación no válida";
		}
		
		System.out.println("La calificación es: " + calificacion + "\n \n");
		
		int mes = 11;
		String mesString = "";
		
		switch(mes) {
		case 1 : mesString = "Enero";
		break;
		case 2 : mesString = "Febrero";
		break;
		case 3 : mesString = "Marzo";
		break;
		case 4 : mesString = "Abril";
		break;
		case 5 : mesString = "Mayo";
		break;
		case 6 : mesString = "Junio";
		break;
		case 7 : mesString = "Julio";
		break;
		case 8 : mesString = "Agosto";
		break;
		case 9 : mesString = "Septiembre";
		break;
		case 10 : mesString = "Octubre";
		break;
		case 11 : mesString = "Noviembre (sin ti)";
		break;
		case 12 : mesString = "Diciembre";
		break;
		}
		
		System.out.println(mesString + "\n \n");
		
		int mesCalendario = 9;
		String estacion = " ";
		
		switch(mesCalendario) {
		case 3, 4, 5 : estacion = "Primavera";
		break;
		case 6, 7, 8 : estacion = "Verano";
		break;
		case 9, 10, 11 : estacion = "Otoño";
		break;
		case 12, 1, 2 : estacion = "Invierno";
		}
		
		System.out.println("La estación es: " + estacion + " \n \n");

	}

}
