package principal;

public class Main {
	public static void main (String[] args) {
		int contador = 0;
		
		//Uso del ciclo while
		while (contador <=5) {
			System.out.println("Valor de contador en while: "+ contador);
			contador++;
		}
		//Reinicio mi variable
		//contador=0;
		//Uso del ciclo do-while
//		do {
//			System.out.println("Valor de contador en do while: "+ contador);
//			contador++;
//		}while (contador <=5);
		
		//reinicio mi variable
//		for (int i=0; i<=5; i++) {
//			System.out.println("Valor de i en for :"+i);	
//		}
//		contador=1;
//		//Uso del ciclo for con variable predeclarada
//		for (;contador<=5; contador++) {
//			System.out.println("Valor de contador en for :"+contador);
//		}
		
		//Uso de la palabra reservada break
//		for (int gera =1; gera<=5; gera++) {
//			System.out.println("Gera n. :"+ gera);
//			if (gera >1) {
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
		//Uso de la palabra reservada continue
//		for (int gera =1; gera<=5;gera++) {
//			if (gera !=3) {
//				System.out.println("Gera pirata: "+ gera);
//				continue;
//			}
//			System.out.println("El gera original es n. :" + gera);
//		}
		for (int gera=1; gera<=5; gera++) {
			if (gera==3) {
				System.out.println("El gera original es n.: "+gera);
				break;
			}
			System.out.println("Gera pirata :" + gera);
		}
		}
	}

//Ejercicio 1
//public class Main {
//	public static void main(String[] args) {
//		int numero = 10;
//		long factorial = 1;
//
//		for (int i = 1; i <= numero; i++) {
//			factorial *= i;
//		}
//		System.out.println("El factorial de " + numero +" es: " + factorial);
//	}
//}


//Ejercicio 2

//public class Main {
//	public static void main(String[] args) {
//		int num = 4, factorial=1, contador = 0; 		 		 
//		//Factorial con el ciclo for 		
////		for (int i = 0; i < num; i++) { 		
////			factorial*= i+1; 		
////			} 		 		
//		//Factorial con ciclo while 		
//			while(contador < num) { 			
//				factorial*= contador+1; 			
//				contador++; 		
//				} 		 		
//			}}
//	
//System.out.println("El factorial de " + num + " es: " + factorial);


//Ejercicio 3
//public class Main {
//	public static void main(String[] args) {
//}
		