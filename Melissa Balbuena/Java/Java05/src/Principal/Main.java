package Principal;

/**
 * Sesion 05 Flujo de control
 * @author Itzel Alvarez
 *
 */
public class Main {
	
	public static void main(String[] args) {
		/* boolean condicion = true;
		int bandera = 1;
		// if se ejecuta si la condicion es verdader
		if (condicion) {
			bandera = 2;
			System.out.println("La condicion es verdadera");
		// } si solo es una instruccion no es necesario las llaves
		} else {
			bandera = 3;
			System.out.println("La condicion es falsa");
		}
		// Comando rapido syso + ctrl + space
		System.out.println("Valor de bandera: " + bandera);
		System.out.println("Se continua con otras instrucciones");
		*/
		
//////////////////////////////////////////////////////////////////////////////////
		
		/*
		
		// prueba >=90 -> A, >= 80 <90 =B ...
		
		// Valor entre 0 y 100
	
		int prueba = 88;
		char calificacion = ' '; 
		//igual puede funcionar con string, anadiendo con comillas
		if (prueba >= 90) {
			calificacion = 'A';
		} 
		
		else if (prueba >= 80 ) {
			calificacion = 'B';
		} 
		
		else if (prueba >= 70 ) {
			calificacion = 'C';
		}
		
		else if (prueba >= 60)  {
			calificacion = 'D';
		} 
		
		else {
			calificacion = 'F';
		}
		
		System.out.println("Se continua con otras instrucciones");
		System.out.println("Calificacion = " + calificacion);
		
		*/
		
//////////////////////////////////////////////////////////////////////////////////

		/*
	 
		int mes = 10;
		String mesString;
		
		switch (mes) {
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
		
		case 11 : mesString = "Noviembre";
		break;
		
		case 12 : mesString = "Diciembre";
		break;
		
		default: mesString = "Mes invalido";
	}
		System.out.println("Mes indicado: " + mesString);
	
	*/
		
//////////////////////////////////////////////////////////////////////////////////

	// Primavera: 3, 4, 5
	// Verano: 6, 7, 8
	// Otono: 10, 11
	// Invierno: 12, 1, 2
		
	int mesCalendario = 2;
	String estacion;
	
	switch (mesCalendario) {
	
	case 1, 2, 12: // Se puede poniendo coma entre los case
		estacion = "Invierno";
	break;
	
	case 3: case 4: case 5: // o se puede hacer de esta manera
		estacion = "Primavera";
	break;
	
	case 6: case 7: case 8:
		estacion = "Verano";
	break;
	
	case 10, 11:
		estacion = "Otono";
	break;
	default:
		estacion = "Mes invalido";
		break;
	}
	System.out.println("Estacion del anio: " + estacion);
	
	}
}
