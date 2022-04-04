package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean condicion = false;
		int bandera =1;
		//if se ejucuta si la condición es verdadera
		if(condicion) {
			 bandera = 2;
			System.out.println("La condición es verdadera");
		} else {
			 bandera=3;
			System.out.println("La condición es falsa");
		}
		//comando rápido syso + ctrl + space
		System.out.println("valor de bandera" +bandera);
		System.out.println("Se continua con otras istrucciones");
	*/
	}
	//Valor entre 0 y 100
	//resultado
	/*int prueba = 78;
	char calificacion = ' ';{
	if(prueba >= 90) {
		calificacion = 'A';
	}
	else if (prueba >= 80){
		calificacion = 'B';
	}
	else if (prueba >= 70){
		calificacion = 'C';
	}
	else if (prueba >= 60){
		calificacion = 'D';
	}
	else {
		calificacion = 'F';
		System.out.println("Reprobo y hay que anexarlo");
	}
	System.out.println("La calificación es: " + calificacion );
}*/
	//Para la forma larga 
	int mes = 11;
	String mesString = "";{
	
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
	
	System.out.println("Mes indicado" +mesString);
	}
	//Forma corta 
	int mesCalendario = 3;
	String estacion;{
	
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