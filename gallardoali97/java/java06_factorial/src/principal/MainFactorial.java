package principal;

public class MainFactorial {

	public static void main(String[] args) {
		//Ejercicio 1
//		int numero=7;
//		int numerof=1;
//		System.out.print("El factorial de "+numero);
//		for( int i=1;i<numero;i++) {
//			numerof+=numerof*i;
//		}
//		System.out.println(" es :"+numerof);
	
	//Ejercicio 2
	int numeroVeces=7;
	int resultado=1;
	
	for (int k=1; k<=numeroVeces;k++) {
		for( int j=1;j<k;j++) {
			
			resultado+=resultado*j;
		}
		
		System.out.println("El factorial de "+ k +" es :"+resultado);
		resultado=1;
	}

 }
}
