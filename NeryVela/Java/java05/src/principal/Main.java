package principal;

public class Main {
public static void main(String[] args) {
	/*int bandera = 1;
	boolean condicion = true; //if se ejecuta si la condicion
	if(condicion) {
		System.out.println("La condición es verdadera");
		bandera = 2;
	}
	
	else {
		System.out.println("La condición es falsa");
		bandera = 3;
	} 
	System.out.println("se continua con otras instrucciones");
	System.out.println("Valor de bandera:" +bandera);*/
	
	//valor entre 0 y 100
	//Prueba >=90->A, >=80 <90 =B
	
	int prueba = 88;
	char calificacion = ' ';
	if(prueba >= 90) {
		calificacion = 'A';
	} else if (prueba >= 80) {
		calificacion = 'B';
	} else if (prueba >=70) {
		calificacion ='C';
	} else if (prueba >= 60) {
		calificacion = 'D';
	} else {
		calificacion = 'F';
	}

	System.out.println("La calificacion es:"  +calificacion);

int mes = 14;
String mesString = "1";

switch(mes) {
case 1: mesString = "Enero";
break;
case 2: mesString ="Febrero";
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
break;
}
System.out.println("Mes:" + mesString);

//Primavera : 3, 4, 5
//Verano : 6,7,8
//Otoño : 9,10, 11
//Invierno : 12, 1, 2

int mesCalendario = 12;
String estacion;
switch (mesCalendario) {
case 1, 2, 12: estacion = "Invierno";
break;
case 3: case 4: case 5: estacion = "Primavera";
break;
case 6: case 7: case 8: estacion = "Verano";
break;
case 9: case 10: case 11: estacion = "Otoño";
break;
default:
	estacion = "Mes inválido";
break;
}
System.out.println("Estación:" + estacion);
}
}
