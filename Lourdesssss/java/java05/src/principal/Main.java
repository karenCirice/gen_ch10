package principal;
/*
 * sesión 05 flujo de control
 * @autor Lourdes
 * 
 * */

public class Main {

	public static void main(String[] args) {
		
		int mesCalendario = 10;
		String estacion = "";
		
		switch(mesCalendario){
			case 1, 
				 2, 
				 3:
				estacion = "Invierno";
				break;
			case 4, 5, 6:
				estacion = "Primavera";
				break;
			case 7: case 8: case 9:
				estacion = "Verano";
				break;
			case 10: case 11: case 12:
				estacion = "Otoño";
				break;
		}
		System.out.println("La estación es: " + estacion);
	
	}

}


/*
 * int mes = 5; String mesString = ""; switch(mes) { case 1 : mesString
 * ="January"; break; case 2 : mesString ="February"; break; case 3 : mesString
 * ="March"; break; case 4 : mesString ="June"; break; case 5 : mesString
 * ="July"; break; case 6 : mesString ="Augost"; break; case 7 : mesString
 * ="September"; break; case 8 : mesString ="October"; break; case 9 : mesString
 * ="November"; break; case 10 : mesString ="December"; break; case 11 :
 * mesString = "Mes inválido"; break; }
 * 	System.out.println("Mes indicado: " + mesString);
 */

//valor entre 0 y 100
//prueba >= 90 A,>=80 <90 =B
/*
int prueba = 30
char calificacion = 0;
if(prueba>=90) {
	calificacion = 'A';
}else if (prueba>=80){
	calificacion = 'B';
}else if(prueba>=70) {
	calificacion = 'C';
}else if(prueba>=60) {
	calificacion = 'D';
}else if(prueba>=60) {
	calificacion = 'E';
}
System.out.println("se continuan con otras instrucciones");
System.out.println("calificación= " + calificacion);

boolean condition = true;
int bandera = 1;
//if se ejecuta si la condicion es verdadera
//para un if de una sola instrucción no es necesario las llaves
if (condition) {
	bandera = 2;
	System.out.println("la condicion es verdadera");
}else {
	bandera = 3;
	System.out.println("la condición es verdadera");
}
//Command fast=syso+ctrl+space
System.out.println("Valor de bandera : " + bandera);
System.out.println("Se continua con otras condiciones");
*/